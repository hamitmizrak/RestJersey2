package com.hamitmizrak.webjersey;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

//http://localhost:8080/JerseyRest/rest/subPath/AltPath
@Path("subPath")
public class Rest_004_SubPath {

	@GET
	@Path("String")
	@Produces("text/plain; charset=UTF-8")
	public String getString() {
		return "Hamit Mızrak üğşçöÜĞŞÇÖ";
		// http://localhost:8080/JerseyRest/rest/subPath/String
	}

	@GET
	@Path("json")
	@Produces("application/json; charset=UTF-8")
	public String getJson() {
		String json = "{\r\n" + "  \"adi\": \"Hamit\",\r\n" + "  \"soyadi\": \"Mızrak\",\r\n"
				+ "  \"java teknolojisi\": [\r\n" + "    \"Servlet\",\r\n" + "    \"JSP\",\r\n" + "    \"JSF\",\r\n"
				+ "    \"Spring\"\r\n" + "  ],\r\n" + "  \"database isimleri\": [\r\n" + "    {\r\n"
				+ "    \"database adi\": \"Mysql\",\r\n" + "    \"özellik\": \"Trigger\"\r\n" + "  },{\r\n"
				+ "    \"database adi\": \"Mssql\",\r\n" + "    \"özellik\": [\"Sp\",\"Trigger\",\"view\"] ,\r\n"
				+ "    \"tarih\":\"2021\"\r\n" + "  }\r\n" + "  ],\r\n" + "  \"database\": {\r\n"
				+ "    \"database adi\": \"Mysql\",\r\n" + "    \"özellik\": \"Trigger\"\r\n" + "  },\r\n"
				+ "  \"memleket\": false,\r\n" + "  \"çalıştığım kurum\": null\r\n" + "}";
		// http://localhost:8080/JerseyRest/rest/subPath/json
		return json;
	}

	@GET
	@Path("xml")
	@Produces("application/xml; charset=UTF-8")
	public String getXml() {
		String xml = "<book>\r\n" + "\r\n" + "<adi>Java SE </adi>\r\n" + "<basimYili>2021</basimYili>\r\n" + "</book>";
		// http://localhost:8080/JerseyRest/rest/subPath/xml
		return xml;
	}
}
