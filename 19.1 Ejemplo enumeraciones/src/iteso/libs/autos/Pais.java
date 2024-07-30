package iteso.libs.autos;

public enum Pais {
	// enum es una clase en la cual todas las instancias se crean
	// dentro de la misma clase 
	ARGENTINA(Idioma.ESPAÑOL,Continente.AMÉRICA),
	ALEMANIA(Idioma.ALEMÁN,Continente.EUROPA),
	FRANCIA(Idioma.FRANCÉS,Continente.EUROPA),
	JAPON(Idioma.JAPONÉS,Continente.ÁFRICA),
	MEXICO(Idioma.ESPAÑOL,Continente.AMÉRICA),
	ESTADOS_UNIDOS(Idioma.INGLÉS,Continente.AMÉRICA);
	
	// Al ser una clase puede tener atributos
	private Idioma idiomaOficial=null;
	private Continente continente = null;
	
	// Al ser una clase puede tener constructores, pero deben ser 
	// privados
	private Pais(Idioma idiomaOficial,Continente continente) {
		this.idiomaOficial = idiomaOficial;
		this.continente = continente;
	}
	
	public String toString() {
		return "{\n" +
				"\t\"pais\":"+this.name()+",\n" +
				"\t\"idioma\":"+idiomaOficial+",\n" +
				"\t\"continente\":"+continente+"\n" +
				"}\n";
	}
	
}
