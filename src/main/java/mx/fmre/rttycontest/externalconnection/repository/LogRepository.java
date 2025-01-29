package mx.fmre.rttycontest.externalconnection.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import mx.fmre.rttycontest.externalconnection.entity.LogEntity;
import mx.fmre.rttycontest.externalconnection.entity.key.LogEntityId;

@Repository
public interface LogRepository extends JpaRepository<LogEntity, LogEntityId> {
	
	@Query("SELECT (MAX(l.logEntityId.id) + 1) FROM LogEntity l")
	public Long getNextId();

	@Query("SELECT l FROM LogEntity l WHERE l.logEntityId.anio = :year")
	List<LogEntity> getAllSavedLogsByYear(@Param("year") Integer year);
}
