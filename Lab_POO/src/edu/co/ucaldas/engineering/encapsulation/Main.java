package edu.co.ucaldas.engineering.encapsulation;

public class Main {

	public static void main(String[] args){

		Person person = new Person("Maria Fernanda", (int)20, "1002592163");
		System.out.println("Descripcion completa de la persona: ");
		System.out.println(person);

		//Se cambia edad
		person.setAge((int) 18);
		System.out.println("Edad cambiada " + person.getAge());

		//Se cambia Nombre
		person.setName("Laura");
		System.out.println("Nombre cambiado " + person.getName());

		//Se muestra documento
		System.out.println("Documento persona " + person.getDocumentNumber());

		//Detalle de la persona
		System.out.println(person);
	}
}
