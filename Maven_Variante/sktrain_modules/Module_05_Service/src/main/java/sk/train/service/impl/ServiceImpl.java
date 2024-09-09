package sk.train.service.impl;

import java.util.logging.Level;
import java.util.logging.Logger;

import sk.train.service.Service;

public class ServiceImpl implements Service {
	
	private int i = 1;
	
	public String getMessage() {
		Logger.getGlobal().log(Level.INFO, "getMessage() called");
		return "Message from " + Service.class.getModule().getName();
	}

	@Override
	public String toString() {
		return "ServiceImpl [i=" + i + "]";
	}
	
	
}

