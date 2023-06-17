package com.david.zookeeper;

public class Gorilla extends Mammal {

	public Gorilla() {
		
		
	}
	public void throwSomething() {
		System.out.println("The gorilla is throwing something");
		setEnergyLevel(getEnergyLevel()-5);
	}

	public void eatBananas() {
		System.out.println("The gorilla is satisfy");
		setEnergyLevel(getEnergyLevel()+10);
		
	}
	
	public void climb() {
		System.out.println("The gorilla has climbed");
		setEnergyLevel(getEnergyLevel()-10);
		
	}
}
