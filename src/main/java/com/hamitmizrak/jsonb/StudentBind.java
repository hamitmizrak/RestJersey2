package com.hamitmizrak.jsonb;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

@Path("/json-b")
public class StudentBind {

	// http://localhost:8080/JerseyRest2/jersey2/json-b/jsonMethod

	@GET
	@Produces("application/json; charset=UTF-8")
	@Path("/jsonMethod")
	public Student getStudentJsonB() {
		Student student = new Student(10, "Hamit", "Mızrak", "1986");
		return student;

	}
}
