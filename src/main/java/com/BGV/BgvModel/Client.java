package com.BGV.BgvModel;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table

public class Client {
	@Id
	@GeneratedValue
	@Column(name = "CliId")
	private int cliId;
	@Column(name="CliName")
	private String cliName;
	@Column(name="CliContactPerson")
	private String cliContactPerson;
	@Column(name="CliContactPersonEmail")
	private String cliContactPersonEmail; 
	@Column(name="CliPhone")
	private int cliPhone;
	@Column(name="CliMobile")
	private int cliMobile;
	@Column(name="CliCode")
	private String cliCode;
	@Column(name="CliLogo")
	private String cliLogo ;
	@Column(name="CliFirstName")
	private String cliFirstName;
	@Column(name="CliLastName")
	private String cliLastName;
	@Column(name="CliEmail")
	private String cliEmail;
	@Column(name="CliNotificationEmail")
	private String cliNotificationEmail;
	@Column(name="CliPassword")
	private String cliPassword;
	@Column(name="CliOffMobile")
	private int cliOffMobile;
	@Column(name="CliCreateDet")
	private String cliCreateDet;
	@Column(name="CliEntryStat")
	private String cliEntryStat;
	public int getCliId() {
		return cliId;
	}
	public void setCliId(int cliId) {
		this.cliId = cliId;
	}
	public String getCliName() {
		return cliName;
	}
	public void setCliName(String cliName) {
		this.cliName = cliName;
	}
	public String getCliContactPerson() {
		return cliContactPerson;
	}
	public void setCliContactPerson(String cliContactPerson) {
		this.cliContactPerson = cliContactPerson;
	}
	public String getCliContactPersonEmail() {
		return cliContactPersonEmail;
	}
	public void setCliContactPersonEmail(String cliContactPersonEmail) {
		this.cliContactPersonEmail = cliContactPersonEmail;
	}
	public int getCliPhone() {
		return cliPhone;
	}
	public void setCliPhone(int cliPhone) {
		this.cliPhone = cliPhone;
	}
	public int getCliMobile() {
		return cliMobile;
	}
	public void setCliMobile(int cliMobile) {
		this.cliMobile = cliMobile;
	}
	public String getCliCode() {
		return cliCode;
	}
	public void setCliCode(String cliCode) {
		this.cliCode = cliCode;
	}
	public String getCliLogo() {
		return cliLogo;
	}
	public void setCliLogo(String cliLogo) {
		this.cliLogo = cliLogo;
	}
	public String getCliFirstName() {
		return cliFirstName;
	}
	public void setCliFirstName(String cliFirstName) {
		this.cliFirstName = cliFirstName;
	}
	public String getCliLastName() {
		return cliLastName;
	}
	public void setCliLastName(String cliLastName) {
		this.cliLastName = cliLastName;
	}
	public String getCliEmail() {
		return cliEmail;
	}
	public void setCliEmail(String cliEmail) {
		this.cliEmail = cliEmail;
	}
	public String getCliNotificationEmail() {
		return cliNotificationEmail;
	}
	public void setCliNotificationEmail(String cliNotificationEmail) {
		this.cliNotificationEmail = cliNotificationEmail;
	}
	public String getCliPassword() {
		return cliPassword;
	}
	public void setCliPassword(String cliPassword) {
		this.cliPassword = cliPassword;
	}
	public int getCliOffMobile() {
		return cliOffMobile;
	}
	public void setCliOffMobile(int cliOffMobile) {
		this.cliOffMobile = cliOffMobile;
	}
	public String getCliCreateDet() {
		return cliCreateDet;
	}
	public void setCliCreateDet(String cliCreateDet) {
		this.cliCreateDet = cliCreateDet;
	}
	public String getCliEntryStat() {
		return cliEntryStat;
	}
	public void setCliEntryStat(String cliEntryStat) {
		this.cliEntryStat = cliEntryStat;
	}
	
	

}
