package com.hamitmizrak.queryparam;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;

@Path("/query-param")
public class QueryParamTutorials {

	@GET
	@Produces("text/plain;  charset=UTF-8")
	@Path("/query-method")
	public String getQueryParam(@QueryParam("id") long id44, @QueryParam("adi") String adi44,
			@QueryParam("soyadi") String soyadi44) {
		return "id: " + id44 + " adi: " + adi44 + " soyadi: " + soyadi44;
	}
}
