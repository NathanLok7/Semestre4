package shapes;

public abstract class Shape3D {
	//Atributos que van a tener todos los objetos
	private double x,y,z;
	
	// Constructor
	public Shape3D(double x,double y,double z) {
		setX(x);
		setY(y);
		setZ(z);
	}
	
	// Setters
	public void setX(double x) {
		this.x=x;
	}
	public void setY(double y) {
		this.y=y;
	}
	public void setZ(double z) {
		this.z=z;
	}
	
	// Getters
	public double getX() {
		return(this.x);
	}
	public double getY() {
		return(this.y);
	}
	public double getZ() {
		return(this.z);
	}

	// Lo que van a poder hacer todos los objetos de 
	// las clases que son figuras 3D
	
	public void move(double dx,double dy,double dz) {
		this.x+=dx;
		this.y+=dy;
		this.z+=dz;
	}
	
	public String toString() {
		return("Coordenadas <"+x+","+y+","+z+">");
	}
	
	// Métodos abstractos deben ser implementados 
	// en las clases derivadas
	public abstract double area();
	public abstract double volume();
}
