package com.hamitmizrak.webjersey;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

// localhost:8080/JerseyRest/rest/Path
// yeni url ==> https://github.com/hamitmizrak/RestJersey2.git

@Path("/produces")
public class Rest_001_Produces_String {

	@GET
	// @Produces(MediaType.TEXT_PLAIN)
	@Produces("text/plain; charset=UTF-8")
	public String methodProduces() {
		return "Hamit Mızrak üğşçöÜĞŞÇÖ";
	}

}
