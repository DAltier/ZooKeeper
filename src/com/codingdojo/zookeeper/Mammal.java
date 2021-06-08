package com.codingdojo.zookeeper;

public class Mammal {
	public int energyLevel;
	
	
	public Mammal() {
		this.energyLevel = 100;
	}
	
	
	public int displayEnergy() {
		System.out.println("This mammal's energy level is: " + this.energyLevel);
		return this.energyLevel;
	}
}
