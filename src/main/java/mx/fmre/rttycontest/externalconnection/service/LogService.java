package mx.fmre.rttycontest.externalconnection.service;

import java.util.List;

import mx.fmre.rttycontest.externalconnection.dto.LogId;
import mx.fmre.rttycontest.externalconnection.entity.LogEntity;

public interface LogService {

	LogEntity save(LogEntity logEntity);

	List<LogId> getAllSavedLogsByYear(Integer year);

	Long getNextId();

	List<LogEntity> findByYearAndCallsign(Integer year, String callsign);

}
