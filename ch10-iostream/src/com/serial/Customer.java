package com.serial;

import java.io.Serializable;

public class Customer implements Serializable{
	private String name;
	
	public Customer(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "당신의 이름은 "+name;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Customer c = new Customer("홍길동");
		System.out.println(c);
		System.out.println(c.toString());
	}

}
