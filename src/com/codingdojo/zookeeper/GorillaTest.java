package com.codingdojo.zookeeper;

public class GorillaTest {
	
	public static void main(String[] args) {
		Gorilla gorilla = new Gorilla();
		
		gorilla.throwSomething().throwSomething().throwSomething().eatBananas().eatBananas().climb();
		gorilla.displayEnergy();
	}
}
