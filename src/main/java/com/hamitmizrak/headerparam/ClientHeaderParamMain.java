package com.hamitmizrak.headerparam;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;

public class ClientHeaderParamMain {

	public static void main(String[] args) {
		Client client = ClientBuilder.newClient();
		WebTarget target = client
				.target("http://localhost:8080/JerseyRest2/jersey2/header-param-class/header-param-method");

		String valueHeader = target.request("text/plain; charset=utf-8 ").header("custom", "target44")
				.get(String.class);

		System.out.println(valueHeader);

	}

}
