package com.practice.e_commerce.entity;

import java.io.Serializable;

public class CartItem implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 8461620663749041100L;

	private Product product;
	
	private int qty;

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public int getQty() {
		return qty;
	}

	public void setQty(int qty) {
		this.qty = qty;
	}

	@Override
	public String toString() {
		return "CartItem [product=" + product + ", qty=" + qty + "]";
	}

}
