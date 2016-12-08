package com.sbuiot.rest.interfaces;

import org.springframework.data.repository.CrudRepository;

import com.sbuiot.rest.entities.User;



public interface UserRepository extends CrudRepository<User, String>{

	void delete(String mac_address);
	User findOne(String mac_address);

}
