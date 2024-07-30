package shapes;

public class Sphere extends Shape3D {
	// Atributo de la esfera
	private double radius;
	
	// Constructor de la esfera
	public Sphere(double x,double y,double z,double radius) {
		super(x,y,z);
		setRadius(radius);
	}
	
	// Setters 
	public void setRadius(double radius) {
		this.radius=radius;
	}
	
	// Getters
	public double getRadius() {
		return(radius);
	}
	public void resize(double dr) {
		this.radius+=dr;
	}
	
	public String toString() {
		return("Esfera\n"+
				super.toString()+
				"\nRadio :"+radius+
				"\nArea :"+area()+
				"\nVolumen :"+volume()+
				"\n");
	}
	
	// Implementación de los métodos abstractos
	public double area() {
		return(4.0*Math.PI*Math.pow(radius, 2));
	}
	public double volume() {
		return((4.0/3.0)*Math.PI*Math.pow(radius, 3));
	}

}
