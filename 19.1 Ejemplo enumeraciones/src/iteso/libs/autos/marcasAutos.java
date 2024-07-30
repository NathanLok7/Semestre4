package iteso.libs.autos;

public enum marcasAutos {
	AUDI(Pais.ALEMANIA),VOLKSWAGEN(Pais.ALEMANIA),
	NISSAN(Pais.JAPON),HONDA(Pais.JAPON)
	,TOYOTA(Pais.JAPON),MITSUBISHI(Pais.JAPON),
	GENERAL_MOTORS(Pais.ESTADOS_UNIDOS);
	
	private Pais paisOrigen;
	
	private marcasAutos(Pais paisOrigen) {
		this.paisOrigen = paisOrigen;
	}
	
	public Pais getPaisOrigen() {
		return paisOrigen;
	}
}
