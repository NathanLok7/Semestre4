package iteso.libs.pets;

public class Mascota {
	private String nombre;
	public int edad;
	private int peso;
	private int raza;
	
	static {
		System.out.println("Constructor de la clase mascota");
	}

	
	public Mascota() {
	}
	
	public Mascota(String nombre,int edad,int peso) {
		setNombre(nombre);
		setEdad(edad);
		setPeso(peso);
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	public void setPeso(int peso) {
		this.peso = peso;
	}
	
	public void setRaza(int raza) {
		this.raza = raza;
	}
	
	public int getEdad() {
		return edad;
	}
	
	public void comer() {
		System.out.println("Mascota Comiendo");
	}
	public void dormir() {
		System.out.println("Zzzzzzz");
	}

}
