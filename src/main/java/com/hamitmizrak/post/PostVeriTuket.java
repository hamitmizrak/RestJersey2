package com.hamitmizrak.post;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;

@Path("/post")
public class PostVeriTuket {

	// PVC
	@POST
	@Path("/veriManuel")
	@Consumes("application/json; charset=UTF-8")
	public void postMethod(String veriAl) {
		System.out.println(veriAl);
	}

	@POST
	@Path("/veriDynamics")
	@Consumes("application/json; charset=UTF-8")
	public void setTelephone(Telephone telephone) {
		System.out.println(telephone);
	}
}
