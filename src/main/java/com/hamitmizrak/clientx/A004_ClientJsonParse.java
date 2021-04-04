package com.hamitmizrak.clientx;

import java.io.StringReader;

import javax.json.Json;
import javax.json.JsonObject;
import javax.json.JsonReader;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;

public class A004_ClientJsonParse {
	// http://localhost:8080/JerseyRest2/jersey2/jsonp/advancedJson
	public static void main(String[] args) {

		Client client = ClientBuilder.newClient();
		WebTarget webTarget = client.target("http://localhost:8080/JerseyRest2/jersey2/jsonp/advancedJson");
		String str = webTarget.request("application/json; charset=UTF-8").get(String.class);
		// System.out.println(str);

		// [] olarak gelmiş olsa ==> JsonArray
		// {} olarak gelmiş olsa ==> JsonObject
		// JsonObject jsonObject2 = Json.createReader(new
		// StringReader(str)).readObject();
		JsonReader jsonReader = Json.createReader(new StringReader(str));
		JsonObject jsonObject = jsonReader.readObject();
		jsonReader.close();

		String adi44 = jsonObject.getString("adi");
		String soyadi44 = jsonObject.getString("soyadi");
		// virgüllü olsaydı ==> String virgullu =
		// jsonObject.getJsonNumber("maas").doubleValue();

		System.out.println(adi44 + " ---- " + soyadi44);

	}
}
