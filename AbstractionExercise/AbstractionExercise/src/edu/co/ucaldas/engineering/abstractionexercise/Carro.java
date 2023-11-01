package edu.co.ucaldas.engineering.abstractionexercise;

public class Carro extends Vehiculo {

	private int potencia;

	private boolean encendido;

	public Carro(String marca, int potencia, int kilometrosRecorridos) {
		super(kilometrosRecorridos, marca);
		this.potencia = potencia;
	}

	public Carro() {}

	public int getPotencia() {
		return potencia;
	}

	public void setPotencia(int potencia) {
		this.potencia = potencia;
	}

	public boolean isEncendido() {
		return encendido;
	}

	public void encender() {
		this.encendido = true;
		System.out.println("El carro está encendido.");
	}

	public void apagar() {
		encendido = false;
		System.out.println("El carro está apagado.");
	}

	public void quemarLlanta(){
		if(this.encendido){
			System.out.println("Upsss, hemos quemado la llanta del carro");
		}else{
			System.out.println("El carro no puede avanzar porque esta apagado");
		}
	}
	@Override
	public void avanzar(int velocidad) {
		if(this.encendido){
			this.potencia += velocidad;
			int distancia = super.calculoKilometros(this.potencia);
			setKilometrosTotales(distancia);
			System.out.println(" El carro ha recorrido " + distancia + " kilómetros.");
		}else{
			System.out.println("El carro no puede avanzar porque esta apagado");
		}
	}

	@Override
	public void cambios(MaxMinEnum transmision) {
		if(this.encendido){
			System.out.println("El carro ha cambiado de marcha");
			switch(transmision) {
				case MAXIMO -> avanzar (10);
				case MINIMO -> frenar (10);
			}
		}else{
			System.out.println("El carro no puede hacer el cambio porque esta apagado");
		}

	}

	@Override
	public void frenar(int velocidad) {
		if(this.encendido){
			this.potencia -= velocidad;
			if(this.potencia <= 0) {
				System.err.println("Hemos frenado el carro");
				this.potencia = 0;
				return;
			}
			int kilometros = super.calculoKilometros((int) this.potencia);
			setKilometrosTotales(kilometros);
			System.out.println("El carro ha recorrido " + kilometros + " kilómetros.");
		}else{
			System.out.println("El carro no puede frenar porque esta apagado");
		}

	}


}
