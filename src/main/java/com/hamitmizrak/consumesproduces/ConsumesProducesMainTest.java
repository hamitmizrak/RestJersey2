package com.hamitmizrak.consumesproduces;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.client.WebTarget;

public class ConsumesProducesMainTest {

	public static void main(String[] args) {

		Client client = ClientBuilder.newClient();
		WebTarget webTarget = client.target("http://localhost:8080/JerseyRest2/jersey2").path("alVerClass")
				.path("method");

		Tablet tablet = new Tablet(100, "tablet Adi", "2021");

		Message message = webTarget.request("application/json; caharset=UTF-8")
				.post(Entity.entity(tablet, "application/json; charset=UTF-8"), Message.class);

		System.out.println("ürünler hakkında" + " " + message.getMessageId() + " " + message.getMessageAdi() + "");

	}

}
