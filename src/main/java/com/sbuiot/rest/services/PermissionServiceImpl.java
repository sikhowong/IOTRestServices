package com.sbuiot.rest.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.PathVariable;

import com.sbuiot.rest.entities.Permission;
import com.sbuiot.rest.interfaces.PermissionRepository;
import com.sbuiot.rest.interfaces.PermissionService;

@Transactional(propagation = Propagation.REQUIRED)
@Service
public class PermissionServiceImpl implements PermissionService{
	@Autowired
    private PermissionRepository permissionDAO;

    public PermissionRepository getPermissionDAO() {
        return permissionDAO;
    }

    public void setObjectDAO(PermissionRepository permissionDAO) {
        this.permissionDAO = permissionDAO;
    }

    public Iterable getPermissions() {return permissionDAO.findAll();}

    public Permission getPermission(@PathVariable Integer id){return permissionDAO.findOne(id);}

    public void delete(@PathVariable Integer id){permissionDAO.delete(id);}

    public Permission save(@PathVariable Permission s){return permissionDAO.save(s);}

}
