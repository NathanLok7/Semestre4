package iteso.libs.pets;

public class Perro extends Mascota {
	public static final int CALLEJERO = 10;
	public static final int GRANDANÉS = 11;
	public static final int POMERANIA = 12;
	public static final int PIBULL = 13;
	public static final int CHIHUAHUITA = 14;
	
	public Perro() {
	}

	public Perro(String nombre,int edad,int peso,int raza) {
		super(nombre,edad,peso);
		setRaza(raza);
	}
	
	public void ladrar() {
		System.out.println("Gua gua gua");
	}
	
	@Override 
	public void setRaza(int raza) {
		if(raza>=10 && raza<=14)
			super.setRaza(raza);
	}

}
