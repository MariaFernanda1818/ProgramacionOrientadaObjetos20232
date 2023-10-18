package edu.co.caldas.engineering.accessmodifier;

public class PersonProtected {

	protected String name = "";

	protected int age ;

	protected String documentNumber = "" ;

	protected String getName() {
		return name;
	}

	protected void setName(String name) {
		this.name = name;
	}

	protected int getAge() {
		return age;
	}

	protected void setAge(int age) {
		this.age = age;
	}

	protected String getDocumentNumber() {
		return documentNumber;
	}

	protected void setDocumentNumber(String documentNumber) {
		this.documentNumber = documentNumber;
	}
}

