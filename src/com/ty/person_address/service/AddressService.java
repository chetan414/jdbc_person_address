package com.ty.person_address.service;

import java.util.ArrayList;
import java.util.List;

import com.ty.person_address.dao.AddressDao;
import com.ty.person_address.dto.Address;

public class AddressService {
	
	AddressDao dao = new AddressDao();
	List<Address> list = new ArrayList();
	
	public int saveAddress(Address address) {
		return dao.saveAddress(address);
	}
	
	public List<Address> getAddressById(Address address, int id) {
		list = dao.getAddressById(address, id);
		return list;
	}
	
}
