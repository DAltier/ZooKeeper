package com.codingdojo.zookeeper;

public class Bat extends Mammal {
	public Bat() {
		this.energyLevel = 300;
	}
	
	
	public Bat fly() {
		System.out.println("Whoooosh! The bat lost 50 energy.");
		this.energyLevel -= 50;
		return this;
	}
	
	
	public Bat eatHumans() {
		System.out.println("The bat ate some human and gained 25 energy.");
		this.energyLevel += 25;
		return this;
	}
	
	
	public Bat attackTown() {
		System.out.println("The bat attacked a town and lost 100 energy.");
		this.energyLevel -= 100;
		return this;
	}
}
