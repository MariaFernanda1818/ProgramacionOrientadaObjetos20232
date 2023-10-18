package edu.co.caldas.engineering.accessmodifier;

public class PersonDefaultTest {

	public static void main(String[] args) {
		PersonDefault personDefault = new PersonDefault();
		personDefault.name = "Luis";
		personDefault.setAge((int) 21);
		System.out.println(personDefault.name);
		System.out.println(personDefault.getAge());
	}

}
