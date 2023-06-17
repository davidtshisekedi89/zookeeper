package com.david.zookeeper;

public class GorillaTest {

	public static void main(String[] args) {
		Gorilla gorillaNum1 = new Gorilla();
//	  gorilla 3x throw something	
		
				gorillaNum1.throwSomething();
				gorillaNum1.throwSomething();
				gorillaNum1.throwSomething();
				
				gorillaNum1.displayEnergy();
				
		
				
//		gorilla 2x eat bananas	
				
				gorillaNum1.eatBananas();
				gorillaNum1.eatBananas();
				
				gorillaNum1.displayEnergy();
				
//		gorilla climb
				
				gorillaNum1.climb();
				
				gorillaNum1.displayEnergy();

	}

}
