package Inhari;

public class Parents{
	int id;
	String name;
Parents(int id,String name){
	
	this.id=id;
	this.name=name;
}
}

class Beta extends Parents{

	Beta(int id, String name) {
		super(id, name);
		
	}
	
}