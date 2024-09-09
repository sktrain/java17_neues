package sk.train.service.impl;

import sk.train.service.Service;

public class ServiceImpl implements Service {
	
	public String getMessage() {
		return "Message from " + Service.class.getModule().getName();
	}

}
