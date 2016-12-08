package com.sbuiot.rest.interfaces;

import com.sbuiot.rest.entities.IOTObject;
import com.sbuiot.rest.entities.User;

public interface UserService {
	Iterable<User> getUsers();
    void delete(String mac_addr);
    User save(User s);
    User getUser(String mac_addr);
}
