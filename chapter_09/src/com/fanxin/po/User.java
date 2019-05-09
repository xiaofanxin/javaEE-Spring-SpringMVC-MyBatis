package com.fanxin.po;

import java.util.List;

public class User {
	private Integer id;
	private String username;
	private String address;
	private List<Orders> ordersList;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public List<Orders> getOrdersList() {
		return ordersList;
	}
	public void setOrdersList(List<Orders> ordersList) {
		this.ordersList = ordersList;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", username=" + username + ", address=" + address + ", ordersList=" + ordersList
				+ "]";
	}
}
