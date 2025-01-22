package mx.fmre.rttycontest.externalconnection.entity;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;
import mx.fmre.rttycontest.externalconnection.dto.Log;
import mx.fmre.rttycontest.externalconnection.entity.key.LogEntityId;

@Data
@NoArgsConstructor
@Entity
@Table(name = "t_log")
public class LogEntity implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6082112545891545178L;

	@EmbeddedId
	private LogEntityId logEntityId;

	@Column(name = "callsign")
	private String callsign;

	@Column(name = "version_number")
	private String versionNumber;

	@Column(name = "category_assisted")
	private String categoryAssisted;

	@Column(name = "category_band")
	private String categoryBand;

	@Column(name = "category_mode")
	private String categoryMode;

	@Column(name = "category_operator")
	private String categoryOperator;

	@Column(name = "category_power")
	private String categoryPower;

	@Column(name = "category_station")
	private String categoryStation;

	@Column(name = "category_time")
	private String categoryTime;

	@Column(name = "category_transmitter")
	private String categoryTransmitter;

	@Column(name = "category_overlay")
	private String categoryOverlay;

	@Column(name = "claimed_score")
	private Long claimedScore;

	@Column(name = "club")
	private String club;

	@Column(name = "contest")
	private String contest;

	@Column(name = "created_by")
	private String createdBy;

	@Column(name = "email_address")
	private String emailAddress;

	@Column(name = "location")
	private String location;

	@Column(name = "name")
	private String name;

	@Column(name = "address1")
	private String address1;

	@Column(name = "address2")
	private String address2;

	@Column(name = "address3")
	private String address3;

	@Column(name = "address4")
	private String address4;

	@Column(name = "operators")
	private String operators;

	@Column(name = "offline")
	private String offline;

	@Column(name = "soapbox")
	private String soapbox;

	public LogEntity(Log log) {
		this.callsign = log.getCallsign();
		this.versionNumber = log.getVersionNumber();
		this.categoryAssisted = log.getCategoryAssisted();
		this.categoryBand = log.getCategoryBand();
		this.categoryMode = log.getCategoryMode();
		this.categoryOperator = log.getCategoryOperator();
		this.categoryPower = log.getCategoryPower();
		this.categoryStation = log.getCategoryStation();
		this.categoryTime = log.getCategoryTime();
		this.categoryTransmitter = log.getCategoryTransmitter();
		this.categoryOverlay = log.getCategoryOverlay();
		this.claimedScore = log.getClaimedScore();
		this.club = log.getClub();
		this.contest = log.getContest();
		this.createdBy = log.getCreatedBy();
		this.emailAddress = log.getEmailAddress();
		this.location = log.getLocation();
		this.name = log.getName();
		this.address1 = log.getAddress1();
		this.address2 = log.getAddress2();
		this.address3 = log.getAddress3();
		this.address4 = log.getAddress4();
		this.operators = log.getOperators();
		this.offline = log.getOffline();
		this.soapbox = log.getSoapbox();
	}
}
