package com.david.zookeeper;


public class Bat extends Mammal{
//	private int energyLevel;
	
	public Bat() {
		super("Bat", 300);
		
	}
	public void fly() {
		System.out.println("The sound of a bat taking");
		setEnergyLevel(getEnergyLevel()-50);
		
	}
	
	public void eatHuman() {
		System.out.println("The bat is eating humaans!");
		setEnergyLevel(getEnergyLevel()+25);
		
	}
	
	public void attackTown() {
		System.out.println("The sound of a town on fire");
		setEnergyLevel(getEnergyLevel()-100);
		
	}
	
//	public int getEnergyLevel() {
//		return energyLevel;
//		
//		
//	}

}
 