package edu.co.caldas.ingenieria.poo.taller;

public class Estudiante {
	
	private Long codigo = 0L;
	
	public Estudiante() {
		// TODO Auto-generated constructor stub
	}	
	
	public String aprobar() {
		return codigo + "El estudiante aprobo:";
	}
	
	public String reprobar(){
		return codigo + "El estudiante reprobo:";
	}

	public Long getCodigo() {
		return codigo;
	}

	public void setCodigo(Long codigo) {
		this.codigo = codigo;
	}
	
	

}
