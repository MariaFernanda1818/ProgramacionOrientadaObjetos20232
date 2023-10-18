package edu.co.ucaldas.engineering.heritance;

public class Cuenta {

	public Cuenta(String numeroCuenta) {
		this.numeroCuenta = numeroCuenta;
	}

	private final String numeroCuenta;
	private Integer saldo = 0;

	public String getNumeroCuenta() {
		return numeroCuenta;
	}

	public Integer getSaldo() {
		return saldo;
	}

	public void ingresoSaldo(int monto){
		this.saldo+=monto;
	}

	public void retiro(Integer monto, int limite){
		if (monto < limite){
			this.saldo-=monto;
			System.out.println("Se retiro el siguiente monto: ".concat(" ").concat(monto.toString()));
			return;
		}
		System.err.println("El monto solicitado supera el limite permitido");
	}
}
