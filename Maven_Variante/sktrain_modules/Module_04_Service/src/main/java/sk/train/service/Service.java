package sk.train.service;

import sk.train.service.impl.ServiceImpl;
import sk.train.service.impl.SimpleBean;

//import sk.train.service.impl.ServiceImpl;

public class Service {
	
	public SimpleBean getMessage() {
		ServiceImpl s =new ServiceImpl();
		return s.getMessage();
		
	}
	
	

}
