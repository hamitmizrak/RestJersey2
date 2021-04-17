package com.hamitmizrak.response2;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

@Path("/response2")
public class ResponseContent {

	@GET
	@Path("/response-method")
	@Produces("text/plain; charset=utf-8")
	public String getResponse() {
		return "String response ";
	}

	@GET
	@Path("/response-method2")
	@Produces("text/plain; charset=utf-8")
	public Response getResponse2() {
		String value = "Response response 200";
		return Response.status(200).entity(value).build();
	}

	@GET
	@Path("/response-method3")
	@Produces("text/plain; charset=utf-8")
	public Response getResponse3() {
		String value = "Response  Response.Status.OK";
		return Response.status(Response.Status.OK).entity(value).build();
	}

	@GET
	@Path("/response-method4")
	@Produces("text/plain; charset=utf-8")
	public Response getResponse4() {
		String value = "Response  Response.Status.OK";
		return Response.ok().entity(value).build();
	}

	@GET
	@Path("/response-method5")
	@Produces("text/plain; charset=utf-8")
	public Response getResponse5() {
		String value = "Response  Response.Status.OK";
		return Response.status(Response.Status.NOT_FOUND).entity(value).build();
	}

	@GET
	@Path("/response-method6/{aut2}")
	@Produces("text/plain; charset=utf-8")
	public Response getResponse6(@PathParam("aut2") String auth) {

		if (auth.equals("yetkisiz")) {
			return Response.status(Response.Status.FORBIDDEN).entity("yetkiniz yoktur").build();
		} else if (auth.equals("yetki elemanı")) {
			return Response.status(Response.Status.UNAUTHORIZED).entity("yetki").build();
		} else if (auth.equals("yok")) {
			return Response.status(Response.Status.NOT_FOUND).entity("yoktur").build();
		} else {
			return Response.status(Response.Status.OK).entity(auth).build();
		}
	}

}
