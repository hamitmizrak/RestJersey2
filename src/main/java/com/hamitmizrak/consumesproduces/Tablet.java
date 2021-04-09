package com.hamitmizrak.consumesproduces;

import java.io.Serializable;

public class Tablet implements Serializable {
	private static final long serialVersionUID = -6704953738556827468L;

	private long tabletId;
	private String tabletAdi;
	private String tabletYil;

	public Tablet() {
		// TODO Auto-generated constructor stub
	}

	public Tablet(long tabletId, String tabletAdi, String tabletYil) {
		super();
		this.tabletId = tabletId;
		this.tabletAdi = tabletAdi;
		this.tabletYil = tabletYil;
	}

	@Override
	public String toString() {
		return "Tablet [tabletId=" + tabletId + ", tabletAdi=" + tabletAdi + ", tabletYil=" + tabletYil + "]";
	}

	public long getTabletId() {
		return tabletId;
	}

	public void setTabletId(long tabletId) {
		this.tabletId = tabletId;
	}

	public String getTabletAdi() {
		return tabletAdi;
	}

	public void setTabletAdi(String tabletAdi) {
		this.tabletAdi = tabletAdi;
	}

	public String getTabletYil() {
		return tabletYil;
	}

	public void setTabletYil(String tabletYil) {
		this.tabletYil = tabletYil;
	}

}
