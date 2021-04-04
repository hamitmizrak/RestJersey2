package com.hamitmizrak.clientx;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;

public class A001_ClientDersi {

	public static void main(String[] args) {
		Client client = ClientBuilder.newClient();
		// WebTarget webTarget =
		// client.target("http://localhost:8080/JerseyRest/jersey/client/string");
		// WebTarget webTarget =
		// client.target("http://localhost:8080/JerseyRest/jersey").path("client").path("string");
		WebTarget webTarget = client.target("https://jsonplaceholder.typicode.com/users/1");
		String str = webTarget.request("text/plain; charset=UTF-8").get(String.class);
		System.out.println(str);
	}
}
