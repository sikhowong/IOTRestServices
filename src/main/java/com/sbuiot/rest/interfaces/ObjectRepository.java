package com.sbuiot.rest.interfaces;

import org.springframework.data.repository.CrudRepository;

import com.sbuiot.rest.entities.IOTObject;



public interface ObjectRepository extends CrudRepository<IOTObject, Integer>{

}
