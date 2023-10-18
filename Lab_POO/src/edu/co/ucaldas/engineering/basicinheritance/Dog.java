package edu.co.ucaldas.engineering.basicinheritance;

import edu.co.ucaldas.engineering.enums.GeneroEnum;


public class Dog extends Animal {

	public Dog() {
		// TODO Auto-generated constructor stub
	}

	public Dog(String race, String size, int age,GeneroEnum genero ) {
		super(race, size, age, genero);
		// TODO Auto-generated constructor stub
	}

	public void ladrar(){
		System.out.println("Wof");
	}

}
