package mx.fmre.rttycontest.externalconnection.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import mx.fmre.rttycontest.externalconnection.entity.LogEntity;
import mx.fmre.rttycontest.externalconnection.entity.key.LogEntityId;

@Repository
public interface LogRepository extends JpaRepository<LogEntity, LogEntityId> {
}
