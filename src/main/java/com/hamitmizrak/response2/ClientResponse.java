package com.hamitmizrak.response2;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.Response;

public class ClientResponse {

	public static void main(String[] args) {

		Client client = ClientBuilder.newClient();
		WebTarget target = client.target("http://localhost:8080/JerseyRest2/jersey2/response2");
		Response response = target.path("response-method4").request("text/plain; charset=utf-8").get();

		if (response.getStatusInfo() == Response.Status.OK) {
			String data = response.readEntity(String.class);
			System.out.println("veri:" + data);
		} else if (response.getStatusInfo() == Response.Status.NOT_FOUND) {
			String data = response.readEntity(String.class);
			System.out.println("hata yoktur:");
		}

	}

}
