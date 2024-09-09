package sk.train.app;

import sk.train.service.Service;
//import sk.train.service.impl.ServiceImpl;

public class Application {

	public static void main(String[] args) {
		
		Service serv = Service.getService();

		System.out.println(serv.getMessage());
		System.out.println(serv.getClass());
		
		//ich kann die implementierende Klasse aber nicht direkt nutzen
		

	}

}
