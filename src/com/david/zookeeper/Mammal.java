package com.david.zookeeper;

public class Mammal {
	private int  energyLevel;
	private String type;
	

	public Mammal() {
		this.energyLevel = 100;
		
	
	}
	
	public Mammal(String type, int energyLevel) {
		this.energyLevel = energyLevel;
		this.type = type;
	}

	public int getEnergyLevel() {
		return energyLevel;
	}

	public void setEnergyLevel(int energyLevel) {
		this.energyLevel = energyLevel;
		
	}
	
	
	
	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public void displayEnergy() {
		System.out.println("This is the Mammal energy level" + getEnergyLevel());
	}
	
	

}
