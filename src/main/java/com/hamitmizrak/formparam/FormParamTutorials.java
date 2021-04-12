package com.hamitmizrak.formparam;

import javax.validation.constraints.NotNull;
import javax.ws.rs.Consumes;
import javax.ws.rs.FormParam;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/form-param")
public class FormParamTutorials {

	@POST
	@Path("/form-method-plain")
	@Consumes(MediaType.APPLICATION_FORM_URLENCODED)
	// @Consumes("application/x-www-form-urlencoded; charset=UTF-8")
	public String getRegister(@FormParam("adi") String name, @FormParam("soyadi") String surname,
			@FormParam("email") String email, @FormParam("sifre") @NotNull String password) {
		String register = name + " " + surname + " " + email + " " + password;
		return register;
	}

	@POST
	@Path("form-method-object")
	public Response getRegisterObject() {

		return Response.status(200).entity("tamam").build();
	}

}
