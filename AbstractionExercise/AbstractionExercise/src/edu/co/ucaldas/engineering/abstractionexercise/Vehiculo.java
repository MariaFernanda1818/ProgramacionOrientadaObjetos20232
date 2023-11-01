package edu.co.ucaldas.engineering.abstractionexercise;

public abstract class Vehiculo {

	private static int vehiculosCreados = 0;

	private static int kilometrosTotales = 0;

	private int kilometrosRecorridos;
	
	private CambiosEnum cambiosEnum;

	private String tipo = "";

	private String color = "";

	private String marca = "";


	public Vehiculo(int kilometrosRecorridos, String tipo, String color, String marca) {
		this.kilometrosRecorridos = kilometrosRecorridos;
		this.tipo = tipo;
		this.color = color;
		this.marca = marca;
	}

	public Vehiculo() {
		vehiculosCreados++;
	}

	public Vehiculo(int kilometrosRecorridos) {
		this.kilometrosRecorridos = kilometrosRecorridos;
		vehiculosCreados++;
	}

	public Vehiculo(int kilometrosRecorridos, String marca) {
		this.kilometrosRecorridos = kilometrosRecorridos;
		vehiculosCreados++;
	}

	public abstract void avanzar(int distancia);

	public abstract void cambios(MaxMinEnum transmision);
	
	public abstract void frenar(int velocidad);
	
	public int calculoKilometros(int velocidad) {
		//FORMULA DE LA DISTANCIA V*T
		//T -> Es relativo, se usa 2 por defecto
		int distancia = velocidad * 2;
		setKilometrosRecorridos(getKilometrosRecorridos() + distancia);
		return distancia;
	}
	
	public int getKilometrosRecorridos() {
		return kilometrosRecorridos;
	}

	public void setKilometrosRecorridos(int kilometrosRecorridos) {
		this.kilometrosRecorridos = kilometrosRecorridos;
	}


	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}


	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public static int getVehiculosCreados() {
		return vehiculosCreados;
	}

	public static int getKilometrosTotales() {
		return kilometrosTotales;
	}

	public static void setKilometrosTotales(int kilometros){
		kilometrosTotales += kilometros;
	}



	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}
	
}

