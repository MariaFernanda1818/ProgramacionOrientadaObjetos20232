package edu.co.caldas.engineering.accessmodifier;

public class PersonPrivate {

	private String name = "";

	private int age;

	private String getName() {
		return name;
	}

	private void setName(String name) {
		this.name = name;
	}

	private int getAge() {
		return age;
	}

	private void setAge(int age) {
		this.age = age;
	}

	public static void main(String[] args){
		/*
		 * Aunque este en private, estamos en la misma clase, esto hace
		 * que se pueda acceder a los metodos y atributos sin restriccion
		 * */
		PersonPrivate p = new PersonPrivate();
		p.setName("Felipe");
		System.out.println(p.getName());
		p.age = (int) 19;
		System.out.println(p.age);
	}

}
