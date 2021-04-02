package com.hamitmizrak.jsonp;

import javax.json.Json;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

@Path("/jsonp")
public class JsonPDersi {

	@GET
	@Produces("application/json; charset=UTF-8")
	@Path("/normalJson")
	public String getStringToJsonNormal() {
		String json = "{\r\n" + "  \"array\": [\r\n" + "    1,\r\n" + "    2,\r\n" + "    3\r\n" + "  ],\r\n"
				+ "  \"boolean\": true,\r\n" + "  \"color\": \"gold\",\r\n" + "  \"null\": null,\r\n"
				+ "  \"number\": 123,\r\n" + "  \"object\": {\r\n" + "    \"a\": \"b\",\r\n" + "    \"c\": \"d\"\r\n"
				+ "  },\r\n" + "  \"string\": \"Hello World\"\r\n" + "}";
		return json;
	}

	@GET
	@Produces("application/json; charset=UTF-8")
	@Path("/advancedJson")
	public String getStringToJsonAdvanced() {

		String json = Json.createObjectBuilder().add("adi", "Hamit").add("soyadi", "Mizrak").build().toString();
		return json;

	}
}
