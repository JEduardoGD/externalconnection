package mx.fmre.rttycontest.externalconnection.service;

import org.springframework.stereotype.Service;

import jakarta.transaction.Transactional;
import mx.fmre.rttycontest.externalconnection.entity.LogEntity;
import mx.fmre.rttycontest.externalconnection.repository.LogRepository;

@Service
public class LogServiceImpl implements LogService {
	
	private final LogRepository logRepository;

	public LogServiceImpl(LogRepository logRepository) {
		this.logRepository = logRepository;
	}

	@Override
	@Transactional
	public LogEntity save(LogEntity logEntity) {
		return logRepository.save(logEntity);
	}
}
