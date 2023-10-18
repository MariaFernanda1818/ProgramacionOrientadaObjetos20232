package edu.co.ucaldas.engineering.methodoverride;

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

	public void jugar() {
		System.out.println("El gato esta jugando");

	}
}

/*Principalmente definimos la subclase "Cat" que se hereda de la clase padre Animal (superclase)
 * La idea principal de la sobreescritura de métodos es reemplazar la implementación existente del método
 * de la superclase llamada Animal. 
 * 
 * Por ejemplo: la clase "Cat" se extiende de la clase Animal, la cual sobreescribe los métodos del padre
 * como dormir, comer y mover.
 */
/*
 * 
 */
