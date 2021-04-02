package com.hamitmizrak.pathparam;

import java.io.Serializable;

public class Person implements Serializable {
	private static final long serialVersionUID = 4655765396084576022L;

	private long personId;
	private String adi;
	private String soyadi;
	private String bolumu;

	public Person() {
		// TODO Auto-generated constructor stub
	}

	public Person(long personId, String adi, String soyadi, String bolumu) {
		super();
		this.personId = personId;
		this.adi = adi;
		this.soyadi = soyadi;
		this.bolumu = bolumu;
	}

	@Override
	public String toString() {
		return "Person [personId=" + personId + ", adi=" + adi + ", soyadi=" + soyadi + ", bolumu=" + bolumu + "]";
	}

	// getter and setter
	public long getPersonId() {
		return personId;
	}

	public void setPersonId(long personId) {
		this.personId = personId;
	}

	public String getAdi() {
		return adi;
	}

	public void setAdi(String adi) {
		this.adi = adi;
	}

	public String getSoyadi() {
		return soyadi;
	}

	public void setSoyadi(String soyadi) {
		this.soyadi = soyadi;
	}

	public String getBolumu() {
		return bolumu;
	}

	public void setBolumu(String bolumu) {
		this.bolumu = bolumu;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
