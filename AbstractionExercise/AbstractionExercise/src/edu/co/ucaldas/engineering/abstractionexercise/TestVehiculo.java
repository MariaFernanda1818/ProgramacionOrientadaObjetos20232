package edu.co.ucaldas.engineering.abstractionexercise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class TestVehiculo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int opcionMenu = 0;
		while(true){
			int opcionVehiculo = mostrarMenuTipoVe(in);
			if(opcionVehiculo == 3){
				System.out.println("Vuelva pronto :)");
				break;
			}
			GestorVehiculos gestor = new GestorVehiculos(opcionVehiculo == 1 ? TipoVehiculoEnum.CARRO : TipoVehiculoEnum.BICICLETA);
			while (true){
				boolean repetir = true;
				if(opcionVehiculo == 1){
					opcionMenu = mostrarMenuCarro(in);
					repetir = ejecutarEventos(opcionMenu, TipoVehiculoEnum.CARRO,gestor, in);
				}else if(opcionVehiculo == 2){
					opcionMenu = mostrarMenuBicicleta(in);
					repetir = ejecutarEventos(opcionMenu, TipoVehiculoEnum.BICICLETA,gestor, in);
				}
				if(!repetir){
					break;
				}
			}
		}
		in.close();
	}

	private static boolean ejecutarEventos(int opcion, TipoVehiculoEnum tipoVehiculo, GestorVehiculos gestor, Scanner in){
		boolean repetir = true;
		switch (opcion) {
			case 1:
				while (true) {
					try {
						if(TipoVehiculoEnum.BICICLETA.equals(tipoVehiculo))System.out.println("Cuantas bicicletas desea agregar?");
						else if(TipoVehiculoEnum.CARRO.equals(tipoVehiculo))System.out.println("Cuantos carros desea agregar?");
						gestor.agregarVehiculos(in.nextInt());
					} catch (Exception ex) {
						System.out.println("Se ingreso un dato que no es numerico, porfavor, ingresa solo numeros");
						in.nextLine();
						continue;
					}
					break;
				}
				break;
			case 2:
				gestor.mostrarInfoVehiculo();
				break;
			case 3:
				gestor.avanzarVehiculo();
				break;
			case 5:
				gestor.accionesExtra(4);
				break;
			case 6:
				if(TipoVehiculoEnum.BICICLETA.equals(tipoVehiculo))System.out.println("El total de kilometros de todas tus bicicletas es de: " + Vehiculo.getKilometrosTotales());
				else if(TipoVehiculoEnum.CARRO.equals(tipoVehiculo))System.out.println("El total de kilometros de todos tus carros es de: " + Vehiculo.getKilometrosTotales());
				break;
			case 7:
				gestor.accionesExtra(5);
				break;
			case 8:
				gestor.accionesExtra(6);
				break;
			case 9:
				gestor.frenarVehiculo();
				break;
			default:
				break;
		}
		if(TipoVehiculoEnum.CARRO.equals(tipoVehiculo)){
				switch (opcion){
					case 4 -> gestor.accionesExtra(1);
					case 10 -> gestor.accionesExtra(2);
					case 11 -> gestor.accionesExtra(3);
					case 12 -> repetir = false;
				}
			}else if(TipoVehiculoEnum.BICICLETA.equals(tipoVehiculo)){
				switch (opcion){
					case 4 -> gestor.accionesExtra(7);
					case 10 -> repetir = false;
				}
			}

		return repetir;
	}

	private static int mostrarMenuTipoVe(Scanner in){
		int[] opciones = {1,2,3};
		int opcion = 0;
		boolean validador = true;
		while (validador){
			System.out.println("Tipo de vehiculos disponibles: \n" +
					"1. Carro\n" +
					"2. Bicicleta\n" +
					"3. Salir Programa\n" +
					"Elige una opción (1-3): ");
			try {
				opcion = in.nextInt();
				validador = !Arrays.stream(opciones).boxed().toList().contains(opcion);
			}catch (Exception ex){
				System.out.println("Se ingreso un dato que no es numerico, porfavor, ingresa solo numeros");
				in.nextLine();
				continue;
			}

			if(validador){
				System.out.println("El tipo de vehiculo seleccionado es incorrecto \nporfa, escoge uno disponible");
			}
		}
		return opcion;
	}


	private static  int mostrarMenuCarro(Scanner in){
		int[] opciones = {1,2,3,4,5,6,7,8,9,10, 11, 12};
		int opcion = 0;
		boolean validador = true;
		while(validador){
			System.out.println("Menú\n" +
					"1. Agregar Carro\n" +
					"2. Ver información de los Carros\n" +
					"3. Andar con el carro\n" +
					"4. Quemar llantas con el carro\n" +
					"5. Ver kilometraje del carro\n" +
					"6. Ver kilometraje total \n" +
					"7. Aumentar cambio carro\n" +
					"8. Disminuir cambio carro\n" +
					"9. Frenar carro\n" +
					"10. Encender Carro\n" +
					"11. Apagar Carro\n" +
					"12. Salir");
			System.out.print("Elige una opción (1-12): ");
			try {
				opcion = in.nextInt();
				validador = !Arrays.stream(opciones).boxed().toList().contains(opcion);
			}catch (Exception ex){
				System.out.println("Se ingreso un dato que no es numerico, porfavor, ingresa solo numeros");
				in.nextLine();
				continue;
			}
			if(validador){
				System.out.println("El tipo de vehiculo seleccionado es incorrecto \nporfa, escoge uno disponible");
			}
		}
		return opcion;
	}
	private static int mostrarMenuBicicleta(Scanner in) {
		int[] opciones = {1,2,3,4,5,6,7,8,9,10};
		int opcion = 0;
		boolean validador = true;
		while (validador) {
			System.out.println("Menú\n" +
					"1. Agregar Bicicletas\n" +
					"2. Ver información de la bicicleta\n" +
					"3. Andar en bicicleta\n" +
					"4. Picar con la bicicleta\n" +
					"5. Ver kilometraje de la bicicleta\n" +
					"6. Ver kilometraje total\n" +
					"7. Cambiar cambio bicicleta\n" +
					"8. Disminuir cambio bicicleta\n" +
					"9. Frenar Bicicleta\n" +
					"10. Salir");
			System.out.print("Elige una opción (1-10): ");
			try{
				opcion = in.nextInt();
				validador = !Arrays.stream(opciones).boxed().toList().contains(opcion);
			}catch (Exception ex){
				System.out.println("Se ingreso un dato que no es numerico, porfavor, ingresa solo numeros");
				in.nextLine();
				continue;
			}
			if(validador){
				System.out.println("El tipo de vehiculo seleccionado es incorrecto \nporfa, escoge uno disponible");
			}
		}
		return opcion;
	}
}
