package com.butun.metotlar;

import java.io.StringReader;

import javax.json.Json;
import javax.json.JsonObject;
import javax.json.JsonReader;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;

//GitHub uri: Repository https://github.com/hamitmizrak/RestJersey2.git
public class ClientJsonParse {
	// Veri almak
	public String veriAl(String uri) {
		Client client = ClientBuilder.newClient();
		WebTarget webTarget = client.target("http://localhost:8080/JerseyRest2/jersey2/jsonp/advancedJson");
		String str = webTarget.request("application/json; charset=UTF-8").get(String.class);
		// System.out.println(str);
		return str;
	}

	// +++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++//
	// String parçalama
	public void stringParse(String veriAl) {

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

	// +++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++//
	// Json Parse
	public void jsonParse(String veriAl) {
		// [] olarak gelmiş olsa ==> JsonArray
		// {} olarak gelmiş olsa ==> JsonObject
		// JsonObject jsonObject2 = Json.createReader(new
		// StringReader(str)).readObject();
		JsonReader jsonReader = Json.createReader(new StringReader(veriAl));
		JsonObject jsonObject = jsonReader.readObject();
		jsonReader.close();

		String adi44 = jsonObject.getString("adi");
		String soyadi44 = jsonObject.getString("soyadi");
		// virgüllü olsaydı ==> String virgullu =
		// jsonObject.getJsonNumber("maas").doubleValue();

		System.out.println(adi44 + " ---- " + soyadi44);

	}

}
