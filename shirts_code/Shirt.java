package com.siva.spier.shirts_code;

public class Shirt implements Comparable<Shirt>{
	String brand;
	double price;
	int size;
	String color;
	
	Shirt(){
		
	}
	
	Shirt(String brand,double price,int size, String color){
		this.brand=brand;
		this.price=price;
		this.size=size;
		this.color=color;
	}
	
	Shirt(Shirt s){
		this.brand=s.brand;
		this.price=s.price;
		this.size=s.size;
		this.color=s.color;
	}
	@Override
	public String toString() {
		return "Shirt Brand is "+this.brand+" price are "+this.price+" size is "+this.size+" color is "+this.color;
	}

	@Override
	public int compareTo(Shirt s) {
		if(this.price<=s.price)
			return -1;
		return 1;
	}

	
}
