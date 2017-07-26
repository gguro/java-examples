package gguro.exceptions;

public class RecursiveObj {

	String name;
	
	public RecursiveObj() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public void setName(String name) throws RecursiveException {
		System.out.println("try to input " + name);
		
		if(name == null || "".equals(name)) {
			throw new RecursiveException("should not null");
		} else if(name.length() < 4){
			throw new RecursiveException("length must be longer than 4");
		} else {
			System.out.println(name + "is Valid(OK).");
			this.name = name;
		}
	}
	
	
	
}
