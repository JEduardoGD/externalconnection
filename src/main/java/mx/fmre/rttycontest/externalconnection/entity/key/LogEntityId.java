package mx.fmre.rttycontest.externalconnection.entity.key;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class LogEntityId implements Serializable{


	/**
	 * 
	 */
	private static final long serialVersionUID = -3802497844847546328L;

	@Column(name = "callsign")
	@Size(max = 13, message = "{validation.callsign.size.too_long}")
	@NotNull
	private String callsign;
	
	@Column(name = "ano")
	private String anio;
}
