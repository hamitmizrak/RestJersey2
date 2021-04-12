package com.hamitmizrak.matrixparam;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.MatrixParam;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

@Path("/matrix-class")
public class MatrixParamBestPractice {

	@GET
	@Path("/matrix-method")
	@Produces("text/plain; charset=UTF-8")
	public String getProduct(@MatrixParam("name") String productName,
			@MatrixParam("tradeMark") List<String> productTradeMark) {
		return "ürün Adı:" + productName + " " + productTradeMark;
	}

}
