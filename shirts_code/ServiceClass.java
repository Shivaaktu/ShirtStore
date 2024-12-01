package com.siva.spier.shirts_code;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class ServiceClass {
	
	List<Shirt> ls=new ArrayList<Shirt>();
	
	Shirt s1=new Shirt("Arrow",1200, 40, "prink");
	
	public  void addShirt(Shirt s) {
		ls.add(s);
	}
	
	public void addShirt() {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter brand");
		String brand=sc.nextLine();
		System.out.println("Enter price");
		double price=sc.nextDouble();
		System.out.println("Enter size");
		int size=sc.nextInt();
		System.out.println("Enter color");
		sc.next();
		String color=sc.nextLine();
		
		addShirt(new Shirt(brand, price, size, color));
		sc.close();
	}
	public void accessAllShirts() {
		System.out.println("All shirts are");
		
		for(Shirt s:ls)
			System.out.println(s.toString());
		
		System.out.println("All shits displayed");
	}
	
	public void displayShirtByBrand(String brand) {
		for(Shirt s:ls) {
			if(s.brand.equalsIgnoreCase(brand))
				System.out.println(s.toString());
		}
	}
	
	public void getShirtByPriceAndColor(double min_price, double max_price, String color) {
		
		for(Shirt s:ls) {
			if((s.price>=min_price&&s.price<=max_price)&&s.color.equalsIgnoreCase(color))
				System.out.println(s.toString());
		}
		
	}
	
	
	public void getShirtsOfSize(int size) {
		for(Shirt s:ls) {
			if(s.size==size)
				System.out.println(s.toString());
		}
	}
	
	public void sortShirtLowToHighPrice() {
		Collections.sort(ls);
	}
	
	public void sortShirtHighToLow(){
		Collections.sort(ls, new PriceHighToLowPrice());
	}
	
	public void accessAllBrand(List<Shirt> ls) {
		Set<String> brands=new TreeSet<>();
		
		//storing all the brands. TreeSet store only unique and also maintain natural sorting.
		for(Shirt s:ls)
			brands.add(s.brand);
		
		//Now access all the shirts name.
		for(String s:brands)
			System.out.println(s);
	}
	
	public void countShirtsByBrand(String brand) {
		Map<String, Integer> m=new TreeMap<>();
		for(Shirt s:ls) {
			if(m.containsKey(s.brand))
				m.put(s.brand, m.get(s.brand)+1);
			else
				m.put(s.brand, 1);
		}
		
		Set<Map.Entry<String, Integer>> ent=m.entrySet();
		for(Map.Entry<String, Integer> p:ent)
			System.out.println(p.getKey()+" ==> "+p.getValue());
	}
	
	public void CountShirtBySize() {
		Map<Integer, Integer> m1=new TreeMap<>();
		for(Shirt s:ls) {
			if(m1.containsKey(s.size))
				m1.put(s.size, m1.get(s.size)+1);
			else
				m1.put(s.size, 1);
		}
		Set<Map.Entry<Integer, Integer>> ent=m1.entrySet();
		for(Map.Entry<Integer, Integer> p:ent)
			System.out.println(p.getKey()+"==> "+p.getValue());
	}
}
