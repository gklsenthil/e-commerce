package com.practice.e_commerce.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "Product")
public class Order implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4941599163166704799L;

	@Id
	private String orderId;

	private List<CartItem> cartItems;

	private String amount;

	private String status;

	private Date createdAt;

	public String getOrderId() {
		return orderId;
	}

	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	public List<CartItem> getCartItems() {
		return cartItems;
	}

	public void setCartItems(List<CartItem> cartItems) {
		this.cartItems = cartItems;
	}

	public String getAmount() {
		return amount;
	}

	public void setAmount(String amount) {
		this.amount = amount;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Date getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}

	@Override
	public String toString() {
		return "Order [orderId=" + orderId + ", cartItems=" + cartItems + ", amount=" + amount + ", status=" + status
				+ ", createdAt=" + createdAt + "]";
	}

}
