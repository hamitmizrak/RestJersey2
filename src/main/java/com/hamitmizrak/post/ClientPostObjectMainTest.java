package com.hamitmizrak.post;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.client.WebTarget;

public class ClientPostObjectMainTest {

	public static void main(String[] args) {

		Telephone telephone = new Telephone(100, "iphone 8 plus", "55522111", "XS85");

		Client client = ClientBuilder.newClient();
		WebTarget webTarget = client.target("http://localhost:8080/JerseyRest2/jersey2/post/veriTuket");

		webTarget.request("application/json; charset=UTF-8")
				.post(Entity.entity(telephone, "application/json; charset=UTF-8"), Void.class);
	}

}
