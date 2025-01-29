package mx.fmre.rttycontest.externalconnection.web.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import jakarta.validation.Valid;
import lombok.extern.slf4j.Slf4j;
import mx.fmre.rttycontest.externalconnection.dto.Log;
import mx.fmre.rttycontest.externalconnection.dto.LogId;
import mx.fmre.rttycontest.externalconnection.entity.LogEntity;
import mx.fmre.rttycontest.externalconnection.entity.key.LogEntityId;
import mx.fmre.rttycontest.externalconnection.service.LogService;

@RestController
@RequestMapping("/api/logs")
@Slf4j
public class ApiController {
	private final LogService logService;

	public ApiController(LogService logService) {
		this.logService = logService;
	}
	
	@GetMapping("/getall/byyear/{year}")
	public ResponseEntity<List<LogId>> getAllSavedLogsByYear(@PathVariable Integer year){
		log.info("ApiController - getAllSavedLogsByYear: {}", year);
		List<LogId> allSavedLogsByYear = logService.getAllSavedLogsByYear(year);
		return ResponseEntity.ok(allSavedLogsByYear);
	}

	@GetMapping("/nextId")
	public ResponseEntity<Long> saveLog() {
		log.info("ApiController - nextId");
		Long nextId = logService.getNextId();
		return ResponseEntity.ok(nextId);
	}

	@PostMapping
	public ResponseEntity<Log> saveLog(@Valid @RequestBody Log logg) {
		log.info("ApiController - saveLog: {}", logg);

		LogEntity logEntity = new LogEntity(logg);
		
		LogEntityId logEntityId = new LogEntityId();
		logEntityId.setId(logg.getId());
		logEntityId.setIdEmail(logg.getIdEmail());
		logEntityId.setAnio(logg.getAnio());
		logEntity.setLogEntityId(logEntityId);

		logEntity = logService.save(logEntity);
		logg = new Log(logEntity);
		return ResponseEntity.ok(logg);
	}

	@ResponseStatus(HttpStatus.BAD_REQUEST)
	@ExceptionHandler(MethodArgumentNotValidException.class)
	public Map<String, String> handleValidationExceptions(MethodArgumentNotValidException ex) {
		Map<String, String> errors = new HashMap<>();
		ex.getBindingResult().getAllErrors().forEach((error) -> {
			String fieldName = ((FieldError) error).getField();
			String errorMessage = error.getDefaultMessage();
			errors.put(fieldName, errorMessage);
		});
		return errors;
	}
}
