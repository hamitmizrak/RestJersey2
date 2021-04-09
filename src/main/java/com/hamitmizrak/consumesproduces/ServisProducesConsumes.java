package com.hamitmizrak.consumesproduces;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

@Path("alVerClass")
public class ServisProducesConsumes {

	@POST
	@Path("/method")
	@Consumes("application/json; charset=UTF-8") // tükettik
	@Produces("application/json; charset=UTF-8") // ürettik
	public Message message(Tablet tablet) {
		System.out.println(tablet);

		Message message2 = new Message();
		message2.setMessageId(0);
		message2.setMessageAdi(tablet.getTabletAdi() + " ürün satıldı");

		return message2;
	}
}
