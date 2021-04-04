package com.hamitmizrak.clientx;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;

public class A002_ClientDersleri {

	public static void main(String[] args) {
		Client client = ClientBuilder.newClient();
		WebTarget webTarget = client.target("https://jsonplaceholder.typicode.com/users/1");
		String str = webTarget.request("application/json; charset=UTF-8").get(String.class);
		System.out.println(str);

	}
}
