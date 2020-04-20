package com.BGV.BgvModel;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="certificate")

public class Certificate {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "CertId")
	private int certId;
	@Column(name = "CertName")
	private String certName ;
	@Column(name = "CertEntryStat")
	private int certEntryStat;
	public int getCertId() {
		return certId;
	}
	public void setCertId(int certId) {
		this.certId = certId;
	}
	public String getCertName() {
		return certName;
	}
	public void setCertName(String certName) {
		this.certName = certName;
	}
	public int getCertEntryStat() {
		return certEntryStat;
	}
	public void setCertEntryStat(int certEntryStat) {
		this.certEntryStat = certEntryStat;
	}


}
