package sk.train.records;

record Record1(int x, Record2 r) {
	
	Record1(int x, Record2 r){
		this.x = 1;
		this.r = null;
	}

}
