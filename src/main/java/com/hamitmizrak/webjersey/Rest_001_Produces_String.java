package com.hamitmizrak.webjersey;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

// localhos:8080/JerseyRest/rest/Path

@Path("/produces")
public class Rest_001_Produces_String {

	@GET
	// @Produces(MediaType.TEXT_PLAIN)
	@Produces("text/plain; charset=UTF-8")
	public String methodProduces() {
		return "Hamit Mızrak üğşçöÜĞŞÇÖ";
	}

}
