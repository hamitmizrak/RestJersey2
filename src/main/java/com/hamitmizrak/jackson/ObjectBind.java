package com.hamitmizrak.jackson;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

//server

@Path("/server-jackson")
public class ObjectBind {

	@GET
	@Produces("application/json; charset=UTF-8")
	@Path("/student")
	public Student getStudent() {
		Student student = new Student(100, "Hamit", "Mızrak");
		return student;
	}
}
