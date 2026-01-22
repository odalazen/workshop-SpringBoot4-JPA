package com.educandoweb.curso.entities.enums;

public enum OrderStatus {
	
	WAITING_PAYMENT(1),
	DELIVERED(2),
	CANCELED(3),
	PAID(4),
	SHIPPED(5);
	
	private int code;
	
	private OrderStatus(int code) {
		this.code = code;
	}
	
	public int getCode() {
		return code;
	}
	
	public static OrderStatus valueOf(int code) {
		for(OrderStatus s: OrderStatus.values()){
			if(s.getCode() == code) {
				return s;
			}
		}
		throw new IllegalArgumentException("Invalid order status code");
	}
}
