package com.codingdojo.zookeeper;

public class Mammal {
	protected String name;
	protected int energyLevel;
	protected static int mammalCount; 
	
	
	public Mammal() {
		System.out.println("Emptry constructor of Mammal");
		this.name = "Random Mammal";
		this.energyLevel = 100;
		mammalCount++; 
	}
	
	public Mammal(String name) {
		System.out.println(" constructor2 of Mammal");
		this.name = name;
		this.energyLevel = 100;
		mammalCount++; 
	}
		
	
	public int displayEnergy() {
		
		System.out.println(this.name +"'s Energy Level: " + this.energyLevel);
		return this.energyLevel;
	}
	
	

	public int getEnergyLevel() {
		return energyLevel;
	}

	public void setEnergyLevel(int energyLevel) {
		this.energyLevel = energyLevel;
	}

	public static int getMammalCount() {
		return mammalCount;
	}

	public static void setMammalCount(int mammalCount) {
		Mammal.mammalCount = mammalCount;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	
	
}
