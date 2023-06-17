package com.david.zookeeper;

public class BatTest {

	public static void main(String[] args) {
		Bat batNum1 = new Bat();
		
//		Attack 3x towns
		
		for(int i = 0; i <=2; i++) {
			batNum1.attackTown();
			
		}
		
//		Eat 2x Humans
		
		for(int i = 0; i<=1; i++) {
			batNum1.eatHuman();
		}
		
//		Fly 2x town
		
		for(int i= 0; i<=1; i++) {
			batNum1.fly();
		}
		
		
//		batNum1.displayEnergy();
		
		System.out.println("current energy level" + batNum1.getEnergyLevel());
		

	}

}
