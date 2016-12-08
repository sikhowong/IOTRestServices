package com.sbuiot.rest.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.sbuiot.rest.entities.Permission;
import com.sbuiot.rest.entities.User;
import com.sbuiot.rest.interfaces.PermissionService;
import com.sbuiot.rest.interfaces.UserService;

@RestController
@CrossOrigin(origins="*")
@RequestMapping("/permission")
public class PermissionsController {
	@Autowired
    private PermissionService service;

    @RequestMapping(method= RequestMethod.GET)
    public Iterable<Permission> findAllPermissions(){
        return service.getPermissions();
    }

    @RequestMapping(value="/{id}", method=RequestMethod.GET)
    public Permission findPermission(@PathVariable Integer id){
        return service.getPermission(id);
    }

    @RequestMapping(method=RequestMethod.POST, consumes = "application/json")
    public Permission addPermission(@RequestBody Permission s){
//    	System.out.println(s.getMac_address() + " " +s.getEmail() + " " + s.getName());
        return service.save(s);
    }

    @RequestMapping(value="/{id}", method=RequestMethod.DELETE)
    public void delete(@PathVariable Integer id){
        service.delete(id);
    }

    @RequestMapping(method=RequestMethod.PUT, consumes="application/json")
    public void update(@RequestBody Permission s){ service.save(s); }
}
