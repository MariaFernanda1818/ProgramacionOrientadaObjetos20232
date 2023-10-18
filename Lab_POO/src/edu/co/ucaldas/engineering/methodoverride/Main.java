package edu.co.ucaldas.engineering.methodoverride;

import edu.co.ucaldas.engineering.enums.GeneroEnum;

public class Main {

	public static void main(String[] args){

		Cat cat =  new Cat("Egipcio", "Pequeño", 3, GeneroEnum.MASCULINO);
		animalActions(cat);
		cat.maullar();

		Dog dog = new Dog("Husky Siveriano", "Big", 5, GeneroEnum.MASCULINO);
		animalActions(dog);
		dog.ladrar();

	}
	public static void animalActions(Animal animal){
		animal.eat();
		animal.sleep();
		animal.move();
		animal.etapaVida();
		animal.tenerCrias();
	}
}
