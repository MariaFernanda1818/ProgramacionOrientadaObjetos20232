package edu.co.ucaldas.engineering.basicinheritance;

import edu.co.ucaldas.engineering.enums.GeneroEnum;

public class Main {

	public static void main(String[] args){

		Cat cat =  new Cat("Belga", "Little", 3, GeneroEnum.MASCULINO);
		animalActions(cat);
		cat.maullar();

		Dog dog = new Dog("Pastor Alemán", "Big", 5, GeneroEnum.MASCULINO);
		animalActions(dog);
		dog.ladrar();

		Animal animal = new Cow("Angus", "Big", 8, GeneroEnum.FEMENINO); //Polimorfismo
		animalActions(animal);
		Cow cow = new Cow(animal.getRace(), animal.getSize(),animal.getAge(), animal.getGenero());
		int days = 30;
		cow.setMilkProductionD(1000);
		System.out.println("Cantidad de leche por ".concat(Integer.toString(days)).concat(" days: ").concat(Integer.toString(cow.milkquantity(30))));

		Animal animalhorse = new Horse("Paso Fino", "Big", 8, GeneroEnum.MASCULINO);
		animalActions(animalhorse);
		Horse horse = new Horse(animalhorse.getRace(), animalhorse.getSize(),animalhorse.getAge(), animalhorse.getGenero());
		horse.setHorseshoeType("Tipo Nieve");
		System.out.println("Las herraduras del caballo sirven ".concat(horse.horseFunction()));

	}

	public static void animalActions(Animal animal){
		animal.eat();
		animal.sleep();
		animal.move();
	}
}
