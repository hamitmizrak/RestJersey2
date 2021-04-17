package com.hamitmizrak.cookieparam;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;

public class CookieParamMain {

	public static void main(String[] args) {
		Client client = ClientBuilder.newClient();
		WebTarget webTarget = client.target("http://localhost:8080/JerseyRest2/jersey2/cookie/cookie-method");
		String cookie = webTarget.request("application/json; charset=utf-8").cookie("cookieeeee", "Cokie bilgilerim")
				.get(String.class);

		System.out.println(cookie);

	}

}
