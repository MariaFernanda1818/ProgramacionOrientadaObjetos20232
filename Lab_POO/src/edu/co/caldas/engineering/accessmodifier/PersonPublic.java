package edu.co.caldas.engineering.accessmodifier;

public class PersonPublic {

	public String name = "";

	public int age ;

	public String documentNumber = "" ;

	public PersonPublic() {
		// TODO Auto-generated constructor stub
	}

	public PersonPublic(String name, int age, String documentNumber) {
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
}
