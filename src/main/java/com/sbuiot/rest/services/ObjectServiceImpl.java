package com.sbuiot.rest.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.PathVariable;

import com.sbuiot.rest.entities.IOTObject;
import com.sbuiot.rest.interfaces.ObjectRepository;
import com.sbuiot.rest.interfaces.ObjectService;

@Transactional(propagation = Propagation.REQUIRED)
@Service
public class ObjectServiceImpl implements ObjectService{
	@Autowired
    private ObjectRepository objectDAO;

    public ObjectRepository getObjectDAO() {
        return objectDAO;
    }

    public void setObjectDAO(ObjectRepository objectDAO) {
        this.objectDAO = objectDAO;
    }

    public Iterable getObjects() {return objectDAO.findAll();}

    public IOTObject getObject(@PathVariable Integer id){return objectDAO.findOne(id);}

    public void delete(@PathVariable Integer id){objectDAO.delete(id);}

    public IOTObject save(@PathVariable IOTObject s){return objectDAO.save(s);}

}
