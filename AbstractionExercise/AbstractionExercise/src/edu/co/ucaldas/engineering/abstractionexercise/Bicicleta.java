package edu.co.ucaldas.engineering.abstractionexercise;


public class Bicicleta extends Vehiculo {

	private String color = "";

	private int modelo;

	private int velocidad;

	public Bicicleta() {

	}

	public Bicicleta(String color, int modelo, int velocidad, int kilometrosRecorridos) {
		super(kilometrosRecorridos);
		this.color = color;
		this.modelo = modelo;
		this.velocidad = velocidad;
	}

	public int getModelo() {
		return modelo;
	}

	public void setModelo(int modelo) {
		this.modelo = modelo;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getVelocidad() {
		return velocidad;
	}

	public void setVelocidad(int velocidad) {
		this.velocidad = velocidad;
	}

	public void picar(){
		System.out.println("Se ha picado la bicicleta");
	}
	@Override
	public void avanzar(int velocidad) {
		this.velocidad += velocidad;
		int distancia = super.calculoKilometros(this.velocidad);
		setKilometrosTotales(distancia);
		System.out.println(" La bicicleta ha recorrido " + distancia + " kilómetros.");
	}

	@Override
	public void cambios(MaxMinEnum transmision) {
		System.out.println("La bicicleta ha cambiado de marcha");
		switch(transmision) {
		case MAXIMO -> avanzar (10);
		case MINIMO -> frenar (10);
		}
	}

	@Override
	public void frenar(int velocidad) {
		this.velocidad -= velocidad;
		if(this.velocidad <= 0) {
			System.out.println("Hemos frenado la bicicleta");
			this.velocidad = 0;
			return;
		}
		int kilometros = super.calculoKilometros(this.velocidad);
		setKilometrosTotales(kilometros);
		System.out.println("La bicicleta ha recorrido " + kilometros + " kilómetros.");
	}
}
