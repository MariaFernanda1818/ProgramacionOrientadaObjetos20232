package edu.co.ucaldas.engineering.encapsulation;

public class Person {

	private String name = "";

	private int age ;

	private String documentNumber = "" ;

	public Person() {
		// TODO Auto-generated constructor stub
	}

	public Person(String name, int age, String documentNumber) {
		super();
		this.name = name;
		this.age = age;
		this.documentNumber = documentNumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getDocumentNumber() {
		return documentNumber;
	}

	public void setDocumentNumber(String documentNumber) {
		this.documentNumber = documentNumber;
	}

	@Override
	public String toString() {
		return "Persona{" +
				"nombre='" + name + '\'' +
				", edad=" + age +
				", numeroDocumento='" + documentNumber + '\'' +
				'}';
	}
	
	/*El encapsulamiento se refiere a la práctica de ocultar los detalles internos de un objeto
	 * y restringir el acceso directo a sus atributos y métodos desde fuera de la clase a la que 
	 * pertenece. Se logra mediante el uso de modificadores de acceso tales como públicos, privados,
	 * y protegidos. La encapsulación es útil para la protección de datos para garantizar la integridad
	 *de un objeto.
	 */
	/*
	 * 
	 */

}
