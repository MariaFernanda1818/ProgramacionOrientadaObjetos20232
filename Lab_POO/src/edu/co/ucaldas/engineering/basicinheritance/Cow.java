package edu.co.ucaldas.engineering.basicinheritance;

import edu.co.ucaldas.engineering.enums.GeneroEnum;

public class Cow extends Animal{

	public Cow() {
		// TODO Auto-generated constructor stub
	}

	public Cow(String race, String size, int age, GeneroEnum genero) {
		super(race, size, age, genero);
		// TODO Auto-generated constructor stub
	}

	private Integer productionMilk;

	public Integer getMilkProduction() {
		return productionMilk;
	}

	public void setMilkProductionD(Integer milkProduction) {
		this.productionMilk = milkProduction;
	}

	@Override
	public void sleep() {
		System.out.println("The ".concat(super.getRace()).concat(" is sleeping"));
	}

	@Override
	public void eat() {
		System.out.println("The ".concat(super.getRace()).concat(" is eating grass"));}

	public Integer milkquantity(int days) {
		return productionMilk * days;
	}


}
