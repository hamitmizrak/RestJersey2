package com.butun.metotlar;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;

public class ClientVeriAl {

	public static String clientVeriAl(String uri) {
		Client client = ClientBuilder.newClient();
		// WebTarget webTarget =
		// client.target("http://localhost:8080/JerseyRest/jersey/client/string");
		// WebTarget webTarget =
		// client.target("http://localhost:8080/JerseyRest/jersey").path("client").path("string");
		WebTarget webTarget = client.target(uri);
		String str = webTarget.request("text/plain; charset=UTF-8").get(String.class);
		return str;
	}

	public static void main(String[] args) {
		String veri = clientVeriAl("https://jsonplaceholder.typicode.com/users/1");
		System.out.println(veri);
	}
}
