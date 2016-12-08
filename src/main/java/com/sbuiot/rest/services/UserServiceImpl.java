package com.sbuiot.rest.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.PathVariable;

import com.sbuiot.rest.entities.IOTObject;
import com.sbuiot.rest.entities.User;
import com.sbuiot.rest.interfaces.ObjectRepository;
import com.sbuiot.rest.interfaces.UserRepository;
import com.sbuiot.rest.interfaces.UserService;


@Transactional(propagation = Propagation.REQUIRED)
@Service
public class UserServiceImpl implements UserService{
	@Autowired
    private UserRepository userDAO;

    public UserRepository getUserDAO() {
        return userDAO;
    }

    public void setUserDAO(UserRepository userDAO) {
        this.userDAO = userDAO;
    }

    public Iterable getUsers() {return userDAO.findAll();}

    public User getUser(@PathVariable String mac_address){return userDAO.findOne(mac_address);}

    public void delete(@PathVariable String mac_address){userDAO.delete(mac_address);}

    public User save(@PathVariable User s){return userDAO.save(s);}

}
