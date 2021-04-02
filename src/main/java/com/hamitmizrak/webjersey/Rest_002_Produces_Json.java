package com.hamitmizrak.webjersey;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

@Path("/json")
public class Rest_002_Produces_Json {

	@GET
	// @Produces(MediaType.APPLICATION_JSON)
	@Produces("application/json; charset=UTF-8")
	public String jsonData() {
		String json = "{\r\n" + "  \"adi\": \"Hamit\",\r\n" + "  \"soyadi\": \"Mızrak\",\r\n"
				+ "  \"java teknolojisi\": [\r\n" + "    \"Servlet\",\r\n" + "    \"JSP\",\r\n" + "    \"JSF\",\r\n"
				+ "    \"Spring\"\r\n" + "  ],\r\n" + "  \"database isimleri\": [\r\n" + "    {\r\n"
				+ "    \"database adi\": \"Mysql\",\r\n" + "    \"özellik\": \"Trigger\"\r\n" + "  },{\r\n"
				+ "    \"database adi\": \"Mssql\",\r\n" + "    \"özellik\": [\"Sp\",\"Trigger\",\"view\"] ,\r\n"
				+ "    \"tarih\":\"2021\"\r\n" + "  }\r\n" + "  ],\r\n" + "  \"database\": {\r\n"
				+ "    \"database adi\": \"Mysql\",\r\n" + "    \"özellik\": \"Trigger\"\r\n" + "  },\r\n"
				+ "  \"memleket\": false,\r\n" + "  \"çalıştığım kurum\": null\r\n" + "}";
		return json;
	}
}
