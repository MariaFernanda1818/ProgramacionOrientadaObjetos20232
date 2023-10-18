package edu.co.caldas.engineering.accessmodifier;

public class PersonProtectedTest {

	public static void main(String[] args) {
		
		PersonProtected personProtected = new PersonProtected();
		personProtected.name = "Manuel";
		personProtected.setAge((int) 18);
		System.out.println(personProtected.name);
		System.out.println(personProtected.getAge());
	}

}
