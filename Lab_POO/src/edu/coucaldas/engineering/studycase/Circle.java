package edu.coucaldas.engineering.studycase;

public class Circle extends GeometricShape {
	private double radius;

	public Circle(String name, double radius) {
		super(name);
		this.radius = radius;
	}

	@Override
	public double calculateArea() {
		return Math.PI * radius * radius;
	}
}
