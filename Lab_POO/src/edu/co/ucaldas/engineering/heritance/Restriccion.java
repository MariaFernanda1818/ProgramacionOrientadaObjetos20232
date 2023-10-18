package edu.co.ucaldas.engineering.heritance;

public class Restriccion extends Cuenta{

	public Restriccion(String numeroCuenta){
		super(numeroCuenta);
	}

	private Integer limite;

	public Integer getLimite() {
		return limite;
	}


	public void ajustarLimite(){
		this.limite = super.getSaldo()/2;
	}

}
