package iteso.libs.pets;

public class Gato extends Mascota {
	private String color;

	public double edad;
	
	public static final int COMUN_EUROPEO = 0;
	public static final int SIAMES = 1;
	public static final int PERSA = 2;
		
	static {
		System.out.println("Constructor de la clase gato");
	}
	
	public Gato() {
	}
	
	public Gato(String nombre,int edad,int peso,String color,int raza) {
		super(nombre,edad,peso);
		setColor(color);
		setRaza(raza);
	}
	public void setColor(String color) {
		this.color = color;
	}
	
	public String getColor() {
		return color;
	}
	
	public void maullar() {
		System.out.println("miau");
	}
	
	@Override 
	public void setRaza(int raza) {
		if(raza == COMUN_EUROPEO ||
				raza == SIAMES ||
				raza == PERSA)
			super.setRaza(raza);;
		
	}
	
	public static Gato mascotaToGato(Mascota m) {
		Gato g = null;
		if(m instanceof Mascota && !(m instanceof Perro)) {
			g = new Gato();
			g.setColor("Sin especificar");
			g.setRaza(COMUN_EUROPEO);
		}
		return g;
	}
	
	public void comer() {
		System.out.println("Que ricas están las wiskas!");
	}
	
	public void incrementaEdadGato() {
		setEdad(getEdad()+1);
		
	}
}
