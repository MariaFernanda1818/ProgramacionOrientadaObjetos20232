package edu.co.caldas.ingenieria.poo.taller;

public class Persona {

	private String nombre = "";
	
	private String fechaDeNacimiento = "";

	public Persona() {
		// TODO Auto-generated constructor stub
	}
	
	public 	String dormir() {
		return nombre + "Esta durmiendo";
	
	}
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getFechaDeNacimiento() {
		return fechaDeNacimiento;
	}

	public void setFechaDeNacimiento(String fechaDeNacimiento) {
		this.fechaDeNacimiento = fechaDeNacimiento;
	}

	public String respirar() {
		return nombre + "Esta respirando";
		
	}
	
	public String comer() {
		return nombre + "Esta comiendo";
		
	}
	
}
