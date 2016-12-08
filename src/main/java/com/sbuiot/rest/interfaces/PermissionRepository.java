package com.sbuiot.rest.interfaces;

import org.springframework.data.repository.CrudRepository;

import com.sbuiot.rest.entities.Permission;


public interface PermissionRepository extends CrudRepository<Permission, Integer>{

}
