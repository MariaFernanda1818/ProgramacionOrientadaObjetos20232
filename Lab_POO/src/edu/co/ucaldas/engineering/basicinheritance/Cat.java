package edu.co.ucaldas.engineering.basicinheritance;

import edu.co.ucaldas.engineering.enums.GeneroEnum;

public class Cat extends Animal{

	public Cat() {
		// TODO Auto-generated constructor stub
	}

	public Cat(String race, String size, int age, GeneroEnum genero) {
		super(race, size, age, genero);
		// TODO Auto-generated constructor stub
	}


	public void maullar(){
		System.out.println("Miau");
	}
}
