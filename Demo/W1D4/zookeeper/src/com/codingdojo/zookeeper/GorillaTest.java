package com.codingdojo.zookeeper;

import java.util.ArrayList;

public class GorillaTest {

	public static void main(String[] args) {
		ArrayList<Mammal> mammals = new ArrayList<Mammal>();
		//[ Mammal1 ,  Mammal2, Mammal3 ] 
		
		Mammal random1 = new Mammal();
		
		Gorilla random2 = new Gorilla();
		
		System.out.println("Number of mammals: " + Mammal.mammalCount);
		
		Gorilla harambe = new Gorilla("Harambe");

		Mammal heidi = new Mammal("Heidi");

		mammals.add(random1);
		mammals.add(random2);
		mammals.add(harambe);
		mammals.add(heidi);
		
		//For loop
		//Method 1:
		for(int i= 0 ; i< mammals.size(); i++) {
			System.out.println(mammals.get(i).getName());
		}

		//Method 2:
		for(Mammal element: mammals) {
			System.out.println(element.getName());
		}
		
	}

}
