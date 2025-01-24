package mx.fmre.rttycontest.externalconnection.web.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import jakarta.validation.Valid;
import mx.fmre.rttycontest.externalconnection.dto.Log;
import mx.fmre.rttycontest.externalconnection.entity.LogEntity;
import mx.fmre.rttycontest.externalconnection.entity.key.LogEntityId;
import mx.fmre.rttycontest.externalconnection.service.LogService;

@RestController
public class ApiController {
	private final LogService logService;

	public ApiController(LogService logService) {
		this.logService = logService;
	}

	@PostMapping("/api/log")
	public ResponseEntity<Log> saveLog(@Valid @RequestBody Log log) {

		LogEntity logEntity = new LogEntity(log);

		LogEntityId logEntityId = new LogEntityId();
		logEntityId.setId(log.getId());
		logEntityId.setIdEmail(log.getIdEmail());
		logEntityId.setAnio(log.getAnio());
		logEntity.setLogEntityId(logEntityId);

		logEntity = logService.save(logEntity);
		log = new Log(logEntity);
		return ResponseEntity.ok(log);
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
