package com.hamitmizrak.response;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

@Path("/response-class")
public class ResponseTutorials {

	@GET
	@Path("/response-not-method")
	@Produces("text/plain; charset=utf-8")
	public String getIsNotResponse() {
		return "response yoktur";
	}

	@GET
	@Path("/response-method")
	@Produces("text/plain; charset=utf-8")
	public Response getIsResponse() {
		return Response.status(200).entity("response vardır").build();
	}

}
