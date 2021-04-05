package com.hamitmizrak.jackson;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;

public class ObjectJsonJackson {

	public static void main(String[] args) {
		Client client = ClientBuilder.newClient();
		WebTarget target = client.target("http://localhost:8080/JerseyRest2/jersey2/server-jackson/student");
		Student student = target.request("application/json; charset=UTF-8").get(Student.class);

		System.out.println(
				student.getStudentId() + " - " + student.getStudentName() + " - " + student.getStudentSurname());
	}
}
