package com.ty.person_address.controller;

import java.util.ArrayList;
import java.util.List;

import com.ty.person_address.dao.AddressDao;
import com.ty.person_address.dto.Address;
import com.ty.person_address.service.AddressService;

public class TestAddress {
	
	public static void main(String[] args) {
		List<Address> list = new ArrayList();
		Address address = new Address();
//		address.setAid(2);
//		address.setStreet("BTM");
//		address.setDoor_num("32");
//		address.setCity("Bangalore");
//		address.setPin(560012);
//		address.setPid(1);
		
		AddressService service = new AddressService();
		
		//int res = dao.saveAddress(address);
//		if(res > 0) {
//			System.out.println("Data is inserted successfully");
//		}
//		else
//			System.out.println("Something went wrong");
		
		list=service.getAddressById(address, 1);
		System.out.println(list);
	}
}
