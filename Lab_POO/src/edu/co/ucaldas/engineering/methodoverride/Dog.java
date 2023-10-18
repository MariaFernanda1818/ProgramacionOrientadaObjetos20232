package edu.co.ucaldas.engineering.methodoverride;

import edu.co.ucaldas.engineering.enums.GeneroEnum;

public class Dog  extends Animal{

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

	public void jugar() {
		System.out.println("El gato esta jugando");

	}
}

/*Principalmente definimos la subclase "Dog" que se hereda de la clase padre Animal (superclase)
 * La idea principal de la sobreescritura de métodos es reemplazar la implementación existente del método
 * de la superclase llamada Animal. 
 * 
 * Por ejemplo: la clase "Dog" se extiende de la clase Animal, la cual sobreescribe los métodos del padre
 * como dormir, comer y mover.
 */
/*
 * 
 */
