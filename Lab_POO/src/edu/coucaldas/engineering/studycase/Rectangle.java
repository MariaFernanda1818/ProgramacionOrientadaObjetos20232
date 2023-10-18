package edu.coucaldas.engineering.studycase;

public class Rectangle extends GeometricShape {

	private double width;

	private double height;

	public Rectangle(String name, double width, double height) {
		super(name);
		this.width = width;
		this.height = height;
	}

	@Override
	public double calculateArea() {
		return width * height;
	}

}
