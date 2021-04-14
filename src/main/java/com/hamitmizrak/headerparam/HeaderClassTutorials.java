package com.hamitmizrak.headerparam;

import javax.json.Json;
import javax.ws.rs.GET;
import javax.ws.rs.HeaderParam;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/header-param-class")
public class HeaderClassTutorials {

	@GET
	@Path("/header-param-method-1")
	@Produces("application/json; charset=utf-8")
	public String getHeaderS1(@HeaderParam("custom") String custom) {
		return custom;
	}

	@GET
	@Path("/header-param-method-2")
	@Produces(MediaType.TEXT_HTML)
	public Response getHeaderS2(@HeaderParam("Accept") String accept, @HeaderParam("Cache-Control") String cacheControl,
			@HeaderParam("Host") String host, @HeaderParam("User-Agent") String userAgent,
			@HeaderParam("Referer") String referer) {
		StringBuffer stringBuffer = new StringBuffer();
		stringBuffer.append(accept).append(cacheControl).append(host).append(userAgent).append(referer);

		return Response.ok(stringBuffer.toString()).entity(stringBuffer.toString()).build();

	}

	@GET
	@Path("/header-param-method-3")
	@Produces("application/json; charset=utf-8")
	public String getHeaderS3(@HeaderParam("Accept") String accept, @HeaderParam("Cache-Control") String cacheControl,
			@HeaderParam("Host") String host, @HeaderParam("User-Agent") String userAgent,
			@HeaderParam("Referer") String referer) {

		String json = Json.createObjectBuilder().add("accept", accept).add("Cache-Control", cacheControl)
				.add("Host", host).add("User-Agent", userAgent).add("Referer", referer)

				.build().toString();

		return json;

	}

	@GET
	@Path("/header-param-method-4")
	@Produces("application/json; charset=utf-8")
	public Response getHeaderS4(@HeaderParam("Accept") String accept, @HeaderParam("Cache-Control") String cacheControl,
			@HeaderParam("Host") String host, @HeaderParam("User-Agent") String userAgent,
			@HeaderParam("Referer") String referer) {
		// String isNullAccept = accept.equals(null) ? "asd" : accept;
		String json = Json.createObjectBuilder().add("Cache-Control", cacheControl).add("Host", host)
				.add("User-Agent", userAgent)

				.build().toString();

		return Response.status(200).entity(json).build();

	}

}
