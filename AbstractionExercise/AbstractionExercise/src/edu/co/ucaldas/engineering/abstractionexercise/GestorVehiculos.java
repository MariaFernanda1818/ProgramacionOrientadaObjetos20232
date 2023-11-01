package edu.co.ucaldas.engineering.abstractionexercise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class GestorVehiculos {

	private ArrayList<Vehiculo> vehiculos;

	private TipoVehiculoEnum tipoVehiculo;


	public GestorVehiculos(TipoVehiculoEnum tipoVehiculo) {
		this.vehiculos = new ArrayList<>();
		this.tipoVehiculo = tipoVehiculo;
	}

	public void agregarVehiculos(int c) {
		Scanner in = new Scanner(System.in);

		for (int i = 0; i < c; i++) {
			Vehiculo vehiculo = null;
			switch (tipoVehiculo) {
				case BICICLETA -> vehiculo = new Bicicleta();
				case CARRO -> vehiculo = new Carro();
			}
			System.out.println("Ingrese el color del vehiculo numero " + (i+1) + ":");
			vehiculo.setColor(in.next());
			System.out.println("Ingrese la marca del vehiculo " + (i+1) + ":");
			vehiculo.setMarca(in.next());
			vehiculo.setTipo(tipoVehiculo.name());
			this.vehiculos.add(vehiculo);
		}
		if(vehiculos.get(0) instanceof  Bicicleta) System.out.println("Las bicicletas fueron agregadas satisfactoriamente");
		else if(vehiculos.get(0) instanceof  Carro) System.out.println("Los carros fueron agregados satisfactoriamente");

	}

	public void avanzarVehiculo() {
		int numVehiculo = escogerVehiculo("avanzar");
		Vehiculo vehiculo = vehiculos.get(numVehiculo-1);
		vehiculo.avanzar(10);
	}

	public void frenarVehiculo() {
		int numVehiculo = escogerVehiculo("avanzar");
		Vehiculo vehiculo = vehiculos.get(numVehiculo-1);
		vehiculo.frenar(15);
	}


	public void accionesExtra(int opcion){
		String accion  = "";
		switch (opcion){
			case 1 -> accion = "quemar llantas";
			case 2 -> accion = "encender carro";
			case 3 -> accion = "apagar carro";
			case 4 -> accion = "ver kilometraje";
			case 5 -> accion = "aumentar cambio";
			case 6 -> accion = "disminuir cambio";
			case 7 -> accion = "picar bicicleta";
 		}
		int vehiculo = escogerVehiculo(accion);
		Vehiculo vehiculoEscogido = vehiculos.get(vehiculo-1);
			switch (opcion){
				case 1:
					((Carro) vehiculoEscogido).quemarLlanta();
					break;
				case 2:
					((Carro) vehiculoEscogido).encender();
					break;
				case 3:
					((Carro) vehiculoEscogido).apagar();
					break;
				case 4:
					if(vehiculoEscogido instanceof Bicicleta)System.out.println("La bicicleta a recorrido: " + vehiculoEscogido.getKilometrosRecorridos() + " Kilometros");
					else if(vehiculoEscogido instanceof Carro)System.out.println("El carro a recorrido: " + vehiculoEscogido.getKilometrosRecorridos() + " Kilometros");
					break;
				case 5:
					vehiculoEscogido.cambios(MaxMinEnum.MAXIMO);
					break;
				case 6:
					vehiculoEscogido.cambios(MaxMinEnum.MINIMO);
					break;
				case 7:
					((Bicicleta) vehiculoEscogido).picar();
					break;
				default:
					break;
			}

	}

	public void mostrarInfoVehiculo() {
		int numCarro = 1;
		int numBicicleta = 1;
		if(this.vehiculos.isEmpty()){
			if(TipoVehiculoEnum.BICICLETA.equals(tipoVehiculo))System.out.println("No existen bicicletas, porfa, agrega uno");
			else if(TipoVehiculoEnum.CARRO.equals(tipoVehiculo))System.out.println("No existen carros, porfa, agrega uno");
		}
		for(Vehiculo v : this.vehiculos) {
			StringBuilder texto = new StringBuilder();
			if(v instanceof Carro){
				texto.append("Carro numero ").append(numCarro);
				numCarro++;
			}else if(v instanceof  Bicicleta){
				texto.append("Bicicleta numero ").append(numBicicleta);
				numBicicleta++;
			}
			texto.append("\nKilometros Recorridos: ").append(v.getKilometrosRecorridos())
					.append("\nTipo Vehiculo: ").append(v.getTipo())
					.append("\nColor: ").append(v.getColor())
					.append("\nMarca: ").append(v.getMarca());
			System.out.println(texto);
		}
	}


	private int escogerVehiculo(String accion){
		List<Integer> opciones = new ArrayList<>();
		boolean validador = true;
		int vehiculo = 0;
		Scanner in = new Scanner(System.in);
		for(int i = 0; i<vehiculos.size(); i++){
			System.out.println((i+1) + ". " + vehiculos.get(i).getMarca());
			opciones.add((i+1));
		}
		while (validador){
			if(vehiculos.get(0) instanceof Bicicleta)System.out.println("De las anteriores bicicletas con cual quieres " + accion + "?");
			else if(vehiculos.get(0) instanceof Carro)System.out.println("De los anteriores carros con cual quieres " + accion + "?");

			System.out.println("Escoge un numero entre el 1 - " + (opciones.size()));
			try {
				vehiculo = in.nextInt();
				validador = !opciones.contains(vehiculo);
			}catch (Exception ex){
				System.out.println("Se ingreso un dato que no es numerico, porfavor, ingresa solo numeros");
				in.nextLine();
				continue;
			}
			if(validador){
				if(vehiculos.get(0) instanceof Bicicleta)System.out.println("Se escogio una bicicleta no existente, \nporfavor, escoge uno que muestra en la lista");
				else if(vehiculos.get(0) instanceof Carro)System.out.println("Se escogio un carro no existente, \nporfavor, escoge uno que muestra en la lista");
			}
		}
		return  vehiculo;
	}
}
