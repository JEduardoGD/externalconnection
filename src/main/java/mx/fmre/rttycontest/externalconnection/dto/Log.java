package mx.fmre.rttycontest.externalconnection.dto;

import java.io.Serializable;

import lombok.Data;
import mx.fmre.rttycontest.externalconnection.entity.LogEntity;

@Data
public class Log implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 3612784582159197887L;
	private Long id;
	private Long idEmail;
	private String callsign;
	private String versionNumber;
	private String categoryAssisted;
	private String categoryBand;
	private String categoryMode;
	private String categoryOperator;
	private String categoryPower;
	private String categoryStation;
	private String categoryTime;
	private String categoryTransmitter;
	private String categoryOverlay;
	private Long claimedScore;
	private String club;
	private String contest;
	private String createdBy;
	private String emailAddress;
	private String location;
	private String name;
	private String address1;
	private String address2;
	private String address3;
	private String address4;
	private String operators;
	private String offline;
	private String soapbox;
	private String anio;

	public Log() {
	}

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
