package com.sbuiot.rest.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.sbuiot.rest.entities.IOTObject;
import com.sbuiot.rest.interfaces.ObjectService;


@RestController
@CrossOrigin(origins="*")
@RequestMapping("/object")
public class ObjectsController {
	@Autowired
    private ObjectService service;

    @RequestMapping(method= RequestMethod.GET)
    public Iterable<IOTObject> findAllObjects(){
        return service.getObjects();
    }

    @RequestMapping(value="/{id}", method=RequestMethod.GET)
    public IOTObject findObject(@PathVariable Integer id){
        return service.getObject(id);
    }

    @RequestMapping(method=RequestMethod.POST, consumes = "application/json")
    public IOTObject addObject(@RequestBody IOTObject s){
        return service.save(s);
    }

    @RequestMapping(value="/{id}", method=RequestMethod.DELETE)
    public void delete(@PathVariable Integer id){
        service.delete(id);
    }

    @RequestMapping(method=RequestMethod.PUT, consumes="application/json")
    public void update(@RequestBody IOTObject s){ service.save(s); }

//    @RequestMapping(value="/toggle/{id}", method=RequestMethod.GET)
//    public void toggleStrategyStatusOnOff(@PathVariable Integer id){
//        Strategy s = service.getStrategy(id);
//        if(s.getStatus_().equals("RUNNING")) {
//            s.setStatus_("STOPPED");
//        } else{
//            s.setStatus_("RUNNING");
//        }
//        service.save(s);
//    }
}
