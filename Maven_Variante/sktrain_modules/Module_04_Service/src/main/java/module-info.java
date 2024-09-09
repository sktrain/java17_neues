module module04_Service {
	exports sk.train.service;
	//requires java.logging;
	requires transitive module_04_ServiceImpl;
	
}