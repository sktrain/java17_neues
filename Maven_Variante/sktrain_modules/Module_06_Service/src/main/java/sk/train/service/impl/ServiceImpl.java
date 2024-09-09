package sk.train.service.impl;

import java.util.logging.Level;
import java.util.logging.Logger;

import com.google.common.base.Joiner;

import sk.train.service.Service;

public class ServiceImpl implements Service {
	
	private int i = 1;
	private Joiner joiner = Joiner.on(":::").skipNulls();
	
	
	public String getMessage() {
		Logger.getGlobal().log(Level.INFO, "getMessage() called");
		return joiner.join("Message from ", Service.class.getModule().getName());
	}

	@Override
	public String toString() {
		return "ServiceImpl [i=" + i + "]";
	}
	
	
}

