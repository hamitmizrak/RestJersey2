package com.hamitmizrak.webjersey;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

@Path("/ustKategori")
public class Rest_005_PathParam {
	// https://github.com/hamitmizrak/udemy_rest-RestFul-Jersey.git
	// http://localhost:8080/JerseyRest/jersey/ustKategori/altKategori
	@GET
	@Produces("text/plain; charset=UTF-8")
	@Path("/altKategoriParametresiz")
	public String getParametresiz() {
		String adSoyad = "Hamit Mızrak";
		return adSoyad;
	}

	@GET
	@Produces("text/plain; charset=UTF-8")
	@Path("/altParametreli/{adi}-{soyadi}")
	public String getParametreli(@PathParam("adi") String adi44, @PathParam("soyadi") String soyAdi44) {

		String adSoyad = "ADINIZ: " + adi44 + " SOYADINIZ: " + soyAdi44;
		return adSoyad;
	}

}
