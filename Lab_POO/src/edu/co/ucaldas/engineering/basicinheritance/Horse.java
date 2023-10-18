package edu.co.ucaldas.engineering.basicinheritance;

import edu.co.ucaldas.engineering.enums.GeneroEnum;


public class Horse extends Animal {

	public Horse() {
		// TODO Auto-generated constructor stub
	}

	public Horse(String race, String size, int age, GeneroEnum genero) {
		super(race, size, age, genero);
		// TODO Auto-generated constructor stub
	}

	private String horseshoeType = "";

	public String getHorseshoeType() {
		return horseshoeType;
	}

	public void setHorseshoeType(String horseshoeType) {
		this.horseshoeType = horseshoeType;
	}

	public String horseFunction(){

		String function = "";

		if(horseshoeType.equals("RaceType")){
			function ="for Careers";

		}else if(horseshoeType.equals("Snow Type")){
			function = "for snowy";

		}else if(horseshoeType.equals("Strength Type")){
			function="for Force type";
		}
		return function;
	}

	@Override
	public void eat() {
		System.out.println("El ".concat(super.getRace()).concat(" esta comiendo heno"));
	}

	@Override
	public void sleep() {
		System.out.println("El ".concat(super.getRace()).concat(" esta durmiendo"));;
	}

	@Override
	public void move() {
		System.out.println("The animal is moving");


	}
}
