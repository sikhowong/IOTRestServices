package com.sbuiot.rest.interfaces;

import com.sbuiot.rest.entities.IOTObject;

public interface ObjectService {
	 Iterable<IOTObject> getObjects();
	    void delete(Integer id);
	    IOTObject save(IOTObject s);
	    IOTObject getObject(Integer id);
}
