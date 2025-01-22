package mx.fmre.rttycontest.externalconnection.web.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

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
	public ResponseEntity<Log> saveLog(@RequestBody Log log) {
		
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
}
