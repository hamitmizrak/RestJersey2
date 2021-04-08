package com.hamitmizrak.post;

import java.io.Serializable;

public class Telephone implements Serializable {
	private static final long serialVersionUID = -4585606167843454634L;

	private long telephoneId;
	private String telName;
	private String telNumber;
	private String telSerial;

	public Telephone() {
		// TODO Auto-generated constructor stub
	}

	public Telephone(long telephoneId, String telName, String telNumber, String telSerial) {
		super();
		this.telephoneId = telephoneId;
		this.telName = telName;
		this.telNumber = telNumber;
		this.telSerial = telSerial;
	}

	@Override
	public String toString() {
		return "Telephone [telephoneId=" + telephoneId + ", telName=" + telName + ", telNumber=" + telNumber
				+ ", telSerial=" + telSerial + "]";
	}

	// pojo
	public long getTelephoneId() {
		return telephoneId;
	}

	public void setTelephoneId(long telephoneId) {
		this.telephoneId = telephoneId;
	}

	public String getTelName() {
		return telName;
	}

	public void setTelName(String telName) {
		this.telName = telName;
	}

	public String getTelNumber() {
		return telNumber;
	}

	public void setTelNumber(String telNumber) {
		this.telNumber = telNumber;
	}

	public String getTelSerial() {
		return telSerial;
	}

	public void setTelSerial(String telSerial) {
		this.telSerial = telSerial;
	}

}
