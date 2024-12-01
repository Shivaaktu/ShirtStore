package com.siva.spier.shirts_code;

import java.util.Comparator;

public class PriceHighToLowPrice implements Comparator<Shirt>{

	@Override
	public int compare(Shirt s1, Shirt s2) {
		return (int)(s2.price-s1.price);
	}
	
	


}
