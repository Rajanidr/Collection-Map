package com.collection.set;

import java.util.HashSet;

public class Set {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		HashSet<String> hs=new HashSet();
		
		hs.add("Rajani");
		hs.add("Roni");
		hs.add("ambika");
		hs.add("Rajani");
		hs.add(null);
		hs.add("bujju");
		hs.add(null);
		System.out.println("HashSet:"+hs);
		
		HashSet hs1 = new HashSet();
		hs1.add("manju");
		hs1.add("Ronesha");
		hs1.addAll(hs);
		System.out.println("HashSte 2:"+hs1);
	}

}
