package com.practice.singleton;

public class Animal {

	
	private static Animal singleton_instance=null;
	private Animal() {
		
	}
	
	public static Animal getInstance() {
		if(singleton_instance==null) {
			singleton_instance=new Animal();
			System.out.println("Animal hashcode value:"+singleton_instance.hashCode());
		}
		
		return singleton_instance;
		
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Animal.getInstance();
	}

}
