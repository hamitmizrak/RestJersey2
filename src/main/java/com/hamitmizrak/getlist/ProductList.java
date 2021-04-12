package com.hamitmizrak.getlist;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class ProductList implements Serializable {
	private static final long serialVersionUID = 2092145389190298894L;

	private long productListId;
	private List<String> productName;

	public ProductList() {
		productName = new ArrayList<String>();
		productName.add("Java SE");
		productName.add("Java EE");
		productName.add("Java ME");
	}

	public ProductList(long productListId, List<String> productName) {
		super();
		this.productListId = productListId;
		this.productName = productName;
	}

	@Override
	public String toString() {
		return "ProductList [productListId=" + productListId + ", productName=" + productName + "]";
	}

	public long getProductListId() {
		return productListId;
	}

	public void setProductListId(long productListId) {
		this.productListId = productListId;
	}

	public List<String> getProductName() {
		return productName;
	}

	public void setProductName(List<String> productName) {
		if (this.productName == null) {
			this.productName = new ArrayList<String>();
		}
		this.productName = productName;
	}

}
