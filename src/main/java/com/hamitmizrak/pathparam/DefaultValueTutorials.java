package com.hamitmizrak.pathparam;

import javax.ws.rs.DefaultValue;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

@Path("/default-value")
public class DefaultValueTutorials {

	@GET
	@Path("/default-method")
	@Produces("text/plain; charset=utf-8")
	public String getDefaultValue(@PathParam("ad") @DefaultValue("Hamit") String ad44) {
		return ad44;
	}

	@GET
	@Path("/default-method2/{ad}")
	@Produces("text/plain; charset=utf-8")
	public String getDefaultValue2(@PathParam("ad") @DefaultValue("Hamit Mizrak") String ad44) {
		return ad44;
	}
}
