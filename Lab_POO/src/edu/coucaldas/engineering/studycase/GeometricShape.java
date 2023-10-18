package edu.coucaldas.engineering.studycase;

public abstract class GeometricShape {

	private String name = "";

	public GeometricShape(String name) {
		this.name = name;
	}

	public abstract double calculateArea();

	public String getName() {
		return name;
	}



}
