package sk.train.service.impl;

import java.util.logging.Level;
import java.util.logging.Logger;



public class ServiceImpl  {
	
	public SimpleBean getMessage() {
		Logger.getGlobal().log(Level.INFO, "getMessage() called");
		return new SimpleBean();
	}
}

