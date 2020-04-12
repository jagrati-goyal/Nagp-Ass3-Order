package org.selflearning.msa.model;

import java.util.Date;

public class Order {

	private String orderId;
	private String userId;
	private Integer orderAmount;
	private Date date;

	public Order() {
		
	}
	
	public Order(String orderId, String userId, Integer orderAmount, Date date) {
		this.orderId = orderId;
		this.userId = userId;
		this.orderAmount = orderAmount;
		this.date = date;
	}

	public String getOrderId() {
		return orderId;
	}

	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public Integer getOrderAmount() {
		return orderAmount;
	}

	public void setOrderAmount(Integer orderAmount) {
		this.orderAmount = orderAmount;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

}
