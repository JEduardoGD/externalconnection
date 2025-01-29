package mx.fmre.rttycontest.externalconnection.entity.key;

import java.io.Serializable;

import jakarta.persistence.Column;
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

	@Column(name = "id", unique=true)
	private Long id;
	
	@Column(name = "f_email")
	private Long idEmail;
	
	@Column(name = "ano")
	private String anio;
}
