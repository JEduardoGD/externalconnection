package mx.fmre.rttycontest.externalconnection.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import jakarta.transaction.Transactional;
import mx.fmre.rttycontest.externalconnection.dto.LogId;
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

	@Override
	public Long getNextId() {
		return logRepository.getNextId();
	}

	@Override
	public List<LogId> getAllSavedLogsByYear(Integer year) {
		List<LogEntity> logEntityList = logRepository.getAllSavedLogsByYear(year);
		return logEntityList.stream().map(l -> new LogId(l)).collect(Collectors.toList());
	}
}
