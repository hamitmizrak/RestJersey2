package com.hamitmizrak.formparam;

import java.io.Serializable;
import java.util.Date;

public class Register implements Serializable {
	private static final long serialVersionUID = 7893558817237012212L;

	private long registerId;
	private String adi;
	private String soyadi;
	private String emailAdres;
	private String sifre;
	private Date tarih;

	public Register() {
		// TODO Auto-generated constructor stub
	}

	public Register(long registerId, String adi, String soyadi, String emailAdres, String sifre, Date tarih) {
		super();
		this.registerId = registerId;
		this.adi = adi;
		this.soyadi = soyadi;
		this.emailAdres = emailAdres;
		this.sifre = sifre;
		this.tarih = tarih;
	}

	@Override
	public String toString() {
		return "Register [registerId=" + registerId + ", adi=" + adi + ", soyadi=" + soyadi + ", emailAdres="
				+ emailAdres + ", sifre=" + sifre + ", tarih=" + tarih + "]";
	}

	// getter and setter
	public long getRegisterId() {
		return registerId;
	}

	public void setRegisterId(long registerId) {
		this.registerId = registerId;
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

	public String getEmailAdres() {
		return emailAdres;
	}

	public void setEmailAdres(String emailAdres) {
		this.emailAdres = emailAdres;
	}

	public String getSifre() {
		return sifre;
	}

	public void setSifre(String sifre) {
		this.sifre = sifre;
	}

	public Date getTarih() {
		return tarih;
	}

	public void setTarih(Date tarih) {
		this.tarih = tarih;
	}

}
