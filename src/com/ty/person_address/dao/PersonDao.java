package com.ty.person_address.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.ty.person_address.dto.Person;
import com.ty.person_address.util.ConnectionObject;

public class PersonDao {
	
	public int savePerson(Person person) {
		Connection connection = ConnectionObject.getConnection();
		String sql = "Insert into person values (?,?,?,?)";
		int result =0;
		try {
			PreparedStatement preparedstatement = connection.prepareStatement(sql);
			preparedstatement.setInt(1, person.getPid());
			preparedstatement.setString(2,person.getName());
			preparedstatement.setString(3, person.getEmail());
			preparedstatement.setString(4, person.getPhone());
			
			result=preparedstatement.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return result;
	}
}
