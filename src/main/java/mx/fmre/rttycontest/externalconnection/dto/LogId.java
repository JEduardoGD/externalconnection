package mx.fmre.rttycontest.externalconnection.dto;

import java.io.Serializable;

import lombok.Data;
import lombok.NoArgsConstructor;
import mx.fmre.rttycontest.externalconnection.entity.LogEntity;

@Data
@NoArgsConstructor
public class LogId implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4243088773289750623L;
	private String callsign;
	private String anio;

	public LogId(LogEntity logEntity) {
		this.callsign = logEntity.getCallsign() != null ? logEntity.getCallsign() : null;
		this.anio = logEntity.getLogEntityId() != null ? logEntity.getLogEntityId().getAnio() : null;
	}
}
