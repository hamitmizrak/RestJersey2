package com.hamitmizrak.xmlb;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

@Path("xmlb")
public class TeacherXml {

	@GET
	@Produces("application/xml; charset=UTF-8")
	public Teacher getXmlBind() {
		Teacher teacher = new Teacher(40, "Hamit", "Mızrak", "1986");
		return teacher;
	}
}
