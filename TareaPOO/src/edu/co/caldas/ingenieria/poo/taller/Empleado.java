package edu.co.caldas.ingenieria.poo.taller;

public class Empleado {

	private Double sueldo =0d;

	public Empleado() {
		// TODO Auto-generated constructor stub
	}

	public String trabajar() {
		return sueldo + "El empleado trabajo";
	}

	public String cobrar() {
		return sueldo + "El empleado cobro su sueldo";
	}

	public Double getSueldo() {
		return sueldo;
	}

	public void setSueldo(Double sueldo) {
		this.sueldo = sueldo;
	}


}
