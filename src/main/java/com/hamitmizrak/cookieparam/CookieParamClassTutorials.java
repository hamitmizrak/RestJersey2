package com.hamitmizrak.cookieparam;

import javax.ws.rs.CookieParam;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

@Path("/cookie")
public class CookieParamClassTutorials {

	@GET
	@Path("/cookie-method")
	@Produces("application/json; charset=utf-8")
	public String getCookieMetod(@CookieParam("cookieeeee") String cookieValue) {

		return cookieValue;
	}
}
