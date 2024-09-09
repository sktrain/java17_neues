package sk.train.service;

import sk.train.service.impl.ServiceImpl;

public interface Service {
	
	public abstract String getMessage(); 
	
	//Factory-Methode
	public static Service getService() {
		return new ServiceImpl();
	}

}
