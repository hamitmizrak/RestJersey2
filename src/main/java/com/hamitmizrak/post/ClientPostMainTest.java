package com.hamitmizrak.post;

import javax.json.Json;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.client.WebTarget;

public class ClientPostMainTest {

	public static void main(String[] args) {

		String json = "{\r\n" + "\"adi\":\"Hamit\",\r\n" + "\"soyadi\":\"Mızrak\"\r\n" + "}";
		String json2 = Json.createObjectBuilder().add("adi", "Hamit44").add("soyadı", "Mızrak").build().toString();

		Client client = ClientBuilder.newClient();
		WebTarget webTarget = client.target("http://localhost:8080/JerseyRest2/jersey2/post/veriTuket");

		webTarget.request("application/json; charset=UTF-8")
				.post(Entity.entity(json, "application/json; charset=UTF-8"), Void.class);
	}

}
