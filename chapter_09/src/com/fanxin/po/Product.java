package com.fanxin.po;

import java.util.List;

public class Product {
	private Integer id;
	private String name;
	private Double price;
	// private List<Orders> orders;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
//	public List<Orders> getOrders() {
//		return orders;
//	}
//	public void setOrders(List<Orders> orders) {
//		this.orders = orders;
//	}
	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", price=" + price + "]";
	}
}
