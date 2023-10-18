package edu.coucaldas.engineering.studycase;

public class GeometricShapeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Circle myCircle = new Circle("Circle", 5.0);
		Rectangle myRectangle = new Rectangle("Rectangle", 4.0, 6.0);

		System.out.println("The area of " + myCircle.getName() + " is: " + myCircle.calculateArea());
		System.out.println("The area of " + myRectangle.getName() + " is: " + myRectangle.calculateArea());
	}
}

