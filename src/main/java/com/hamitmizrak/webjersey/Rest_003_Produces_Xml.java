package com.hamitmizrak.webjersey;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

@Path("/xml")
public class Rest_003_Produces_Xml {

	@GET
	@Produces("application/xml; charset=UTF-8")
	public String methodProduces() {
		String xml = "<book>\r\n" + "\r\n" + "<adi>Java SE </adi>\r\n" + "<basimYili>2021</basimYili>\r\n" + "</book>";
		return xml;
	}

}
