package gguro.serialize;

import java.io.Serializable;

public class SerializeData implements Serializable {
	public String name;
	public String address;
	public transient int SSN;
	public int number;
	
	public SerializeData() {
		super();
		// TODO Auto-generated constructor stub
	}

	public SerializeData(String name, String address, int sSN, int number) {
		super();
		this.name = name;
		this.address = address;
		SSN = sSN;
		this.number = number;
	}

	@Override
	public String toString() {
		return "SerializeData [name=" + name + ", address=" + address + ", SSN=" + SSN + ", number=" + number + "]";
	}

	public void mailCheck() {
		System.out.println("mail check to " + name + " " + address);
	}
}
