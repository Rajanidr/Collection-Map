package com.collection.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class MapExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer, String> map = new HashMap<>();

		map.put(1, "raja");
		map.put(2, "rani");
		System.out.println("Hashmap values are " + map);

		/*
		 * Iterator it=map.keySet().iterator(); while(it.hasNext()) { Integer
		 * key=(Integer)it.next(); System.out.println(key+"="+map.get(key)); map.put(3,
		 * "kala"); }
		 */
	}

}
