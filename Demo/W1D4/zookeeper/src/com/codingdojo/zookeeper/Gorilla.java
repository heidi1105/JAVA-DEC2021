package com.codingdojo.zookeeper;

public class Gorilla extends Mammal{
	public Gorilla() {
		
		super("Random Gorilla");//only for Mammal constructor
		System.out.println("Emptry constructor of Gorilla");
		this.energyLevel = 200;
		//the above line will override the default 100 energy level
	}
	
	public Gorilla(String name) {
		
		super(name);
		System.out.println("constructor 2 of Gorilla");
		this.energyLevel= 200;
	}
	
	
	
	public void throwSomething() {
		System.out.println("Gorilla threw something!");
		//Method 1 (only if energyLevel is protected on Mammal class)
		this.energyLevel -= 5;
		
		//Method 2 (if energyLevel is private)		
//		int tempLevel = this.getEnergyLevel() - 5;
//		this.setEnergyLevel(tempLevel);
		
	}
	
	public void eatBananas() {
		System.out.println("Gorilla ate bananas!");
		this.energyLevel += 10;
	}
	
	public void climb() {
		System.out.println("Gorilla climbed up on the tree!");
		this.energyLevel -= 10;
	}
	
	
	
	
}
