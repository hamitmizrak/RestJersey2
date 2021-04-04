package com.hamitmizrak.clientx;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;

public class A003_ClientStringParse {

	public static void main(String[] args) {

		Client client = ClientBuilder.newClient();
		WebTarget webTarget = client.target("http://localhost:8080/JerseyRest/jersey/client/string");
		String str = webTarget.request("text/plain; charset=UTF-8").get(String.class);
		// System.out.println(str);

		String[] parcala = str.split(" ");
		for (String temp : parcala) {
			System.out.println(temp);
		}

		System.out.println(parcala[4]);

	}
}
