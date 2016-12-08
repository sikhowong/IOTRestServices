package com.sbuiot.rest.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.sbuiot.rest.entities.User;
import com.sbuiot.rest.interfaces.UserService;



@RestController
@CrossOrigin(origins="*")
@RequestMapping("/user")
public class UsersController {
	@Autowired
    private UserService service;

    @RequestMapping(method= RequestMethod.GET)
    public Iterable<User> findAllUsers(){
        return service.getUsers();
    }

    @RequestMapping(value="/{mac_address}", method=RequestMethod.GET)
    public User findUser(@PathVariable String mac_address){
        return service.getUser(mac_address);
    }

    @RequestMapping(method=RequestMethod.POST, consumes = "application/json")
    public User addUser(@RequestBody User s){
    	System.out.println(s.getMac_address() + " " +s.getEmail() + " " + s.getName());
        return service.save(s);
    }

    @RequestMapping(value="/{mac_address}", method=RequestMethod.DELETE)
    public void delete(@PathVariable String mac_address){
        service.delete(mac_address);
    }

    @RequestMapping(method=RequestMethod.PUT, consumes="application/json")
    public void update(@RequestBody User s){ service.save(s); }

}
