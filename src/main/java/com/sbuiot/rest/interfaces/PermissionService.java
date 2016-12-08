package com.sbuiot.rest.interfaces;

import com.sbuiot.rest.entities.IOTObject;
import com.sbuiot.rest.entities.Permission;

public interface PermissionService {
	Iterable<Permission> getPermissions();
    void delete(Integer id);
    Permission save(Permission s);
    Permission getPermission(Integer id);
}
