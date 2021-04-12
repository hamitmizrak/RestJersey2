package com.config.singleton;

import javax.json.Json;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

@Path("/deneme")
public class DenemeServis {

	@GET
	@Produces("application/json; charset=UTF-8")
	@Path("/deneme2")
	public String getStringToJsonAdvanced() {

		String json = Json.createObjectBuilder().add("adi", "Hamit").add("soyadi", "Mizrak").build().toString();
		return json;

	}
}
