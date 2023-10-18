package edu.co.ucaldas.engineering.basicinheritance;

import edu.co.ucaldas.engineering.enums.GeneroEnum;

public class Animal {


	private String race = "";

	private String size = "";

	private int age;

	private GeneroEnum genero;


	public Animal() {
		// TODO Auto-generated constructor stub
	}

	public Animal(String race, String size, int age, GeneroEnum genero) {
		super();
		this.race = race;
		this.size = size;
		this.age = age;
	}

	public String getRace() {
		return race;
	}

	public void setRace(String race) {
		this.race = race;
	}

	public String getSize() {
		return size;
	}

	public GeneroEnum getGenero() {
		return genero;
	}

	public void setSize(String size) {
		this.size = size;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setGenero(GeneroEnum genero) {
		this.genero = genero;
	}

	public void eat() {
		System.out.println("The animal is eating");
	}

	public void sleep() {
		System.out.println("The animal is sleeping");
	}
	public void move() {
		System.out.println("The animal is moving");
	}
}
