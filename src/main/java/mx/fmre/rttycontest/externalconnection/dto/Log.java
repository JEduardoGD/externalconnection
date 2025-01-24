package mx.fmre.rttycontest.externalconnection.dto;

import java.io.Serializable;
import java.math.BigDecimal;

import org.springframework.lang.NonNull;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.Data;
import lombok.NoArgsConstructor;
import mx.fmre.rttycontest.externalconnection.entity.LogEntity;

@Data
@NoArgsConstructor
public class Log implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 3612784582159197887L;
	@NonNull
	@Min(value = 1L)
	@Max(value = 99999999999L)
	private Long id;
	
	@NonNull
	@Min(value = 1L)
	@Max(value = 99999999999L)
	private Long idEmail;
	
	@Size(max = 13, message = "{validation.callsign.size.too_long}")
	private String callsign;
	
	private BigDecimal versionNumber;
	
	@Size(max = 12)
	private String categoryAssisted;
	
	@Size(max = 12)
	private String categoryBand;
	
	@Size(max = 8)
	private String categoryMode;
	
	@Size(max = 22)
	private String categoryOperator;
	
	@Size(max = 38)
	private String categoryPower;
	
	@Size(max = 10)
	private String categoryStation;
	
	@Size(max = 8)
	private String categoryTime;
	
	@Size(max = 3)
	private String categoryTransmitter;
	
	@Size(max = 22)
	private String categoryOverlay;
	
	@Min(value = 1L)
	@Max(value = 99999999999L)
	private Long claimedScore;
	
	@Size(max = 70)
	private String club;
	
	@Size(max = 52)
	private String contest;
	
	@Size(max = 70)
	private String createdBy;
	
	@Size(max = 70)
	private String emailAddress;
	
	@Size(max = 8)
	private String location;
	
	@Size(max = 70)
	private String name;
	
	@Size(max = 70)
	private String address1;
	
	@Size(max = 70)
	private String address2;
	
	@Size(max = 70)
	private String address3;
	
	@Size(max = 70)
	private String address4;
	
	@Size(max = 70)
	private String operators;
	
	@Size(max = 31)
	private String offline;
	
	private String soapbox;
	
	@NonNull
	@Pattern(regexp = "^\\d{1,4}$")
	private String anio;

	public Log(LogEntity savedLog) {
		this.id = savedLog.getLogEntityId() != null ? savedLog.getLogEntityId().getId() : null;
		this.idEmail = savedLog.getLogEntityId() != null ? savedLog.getLogEntityId().getIdEmail() : null;
		this.callsign = savedLog.getCallsign();
		this.versionNumber = savedLog.getVersionNumber();
		this.categoryAssisted = savedLog.getCategoryAssisted();
		this.categoryBand = savedLog.getCategoryBand();
		this.categoryMode = savedLog.getCategoryMode();
		this.categoryOperator = savedLog.getCategoryOperator();
		this.categoryPower = savedLog.getCategoryPower();
		this.categoryStation = savedLog.getCategoryStation();
		this.categoryTime = savedLog.getCategoryTime();
		this.categoryTransmitter = savedLog.getCategoryTransmitter();
		this.categoryOverlay = savedLog.getCategoryOverlay();
		this.claimedScore = savedLog.getClaimedScore();
		this.club = savedLog.getClub();
		this.contest = savedLog.getContest();
		this.createdBy = savedLog.getCreatedBy();
		this.emailAddress = savedLog.getEmailAddress();
		this.location = savedLog.getLocation();
		this.name = savedLog.getName();
		this.address1 = savedLog.getAddress1();
		this.address2 = savedLog.getAddress2();
		this.address3 = savedLog.getAddress3();
		this.address4 = savedLog.getAddress4();
		this.operators = savedLog.getOperators();
		this.offline = savedLog.getOffline();
		this.soapbox = savedLog.getSoapbox();
		this.anio = savedLog.getLogEntityId() != null ? savedLog.getLogEntityId().getAnio() : null;
	}
}
