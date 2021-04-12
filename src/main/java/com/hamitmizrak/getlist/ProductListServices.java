package com.hamitmizrak.getlist;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

@Path("/productList")
public class ProductListServices {

	@GET
	@Produces("application/json; charset=UTF-8")
	@Path("/product")
	public List<String> lists() {
		List<String> list = new ArrayList<String>();
		list.add("Java SE");
		list.add("Java EE");
		list.add("Java ME");
		return list;
	}

}
