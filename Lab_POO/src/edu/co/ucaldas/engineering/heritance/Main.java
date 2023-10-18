package edu.co.ucaldas.engineering.heritance;

public class Main {
	
	public static void main(String[] args) {

        //.getSaldo() sirve para retornar el saldo actual
        Restriccion cuenta = new Restriccion("45323425");
        cuenta.ingresoSaldo(1000000);
        System.out.println(mandarMensaje(cuenta.getNumeroCuenta(), "Saldo actual", cuenta.getSaldo()));
        System.out.println(mandarMensaje(cuenta.getNumeroCuenta(), "Limite", cuenta.getLimite()));
        cuenta.ingresoSaldo(200000); //Se agrega mas dinero a la cuenta
        System.out.println(mandarMensaje(cuenta.getNumeroCuenta(), "Saldo despues del ingreso", cuenta.getSaldo()));
        cuenta.ajustarLimite();
        cuenta.retiro(100000, cuenta.getLimite()); //Se hace el respectivo retiro con sus validaciones
        System.out.println(mandarMensaje(cuenta.getNumeroCuenta(), "Saldo despues del retiro", cuenta.getSaldo()));

    }

    private static String mandarMensaje(String numeroCuenta, String mensajeEntrante, Integer valor){
        StringBuilder mensaje = new StringBuilder();
        mensaje.append(numeroCuenta).append(" ").append(mensajeEntrante).append(" ").append(valor);
        return mensaje.toString();
    }

}
