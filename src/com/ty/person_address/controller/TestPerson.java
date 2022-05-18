package com.ty.person_address.controller;

import com.ty.person_address.dto.Person;
import com.ty.person_address.service.PersonService;

public class TestPerson {
	
	public static void main(String[] args) {
		
		Person person = new Person();
		person.setPid(1);
		person.setName("Chetan");
		person.setEmail("chetau554@gmail.com");
		person.setPhone("9535459554");
		PersonService service = new PersonService();
		
		int res = service.savePerson(person);
		if(res>0) {
			System.out.println("data is inserted successfully");
		}
		else
			System.out.println("Something went wrong");
	}
}
