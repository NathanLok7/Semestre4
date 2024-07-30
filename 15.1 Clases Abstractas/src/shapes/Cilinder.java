package shapes;

public class Cilinder extends Shape3D {
	private double radius,height;
	
	public Cilinder(double x,double y,double z,double radius,double height) {
		super(x,y,z);
		setRadius(radius);
		setHeight(height);
	}
	
	// Setters 
	public void setRadius(double radius) {
		this.radius=radius;
	}
	public void setHeight(double height) {
		this.height=height;
	}
	
	public String toString() {
		return("Cilindro\n"+
				super.toString()+
				"\nRadio :"+radius+
				"\nAltura :"+height+
				"\nArea :"+area()+
				"\nVolumen :"+volume()+
				"\n");
	}
 
	
	// Implementación de los métodos abstractos
	public double area() {
		return(2.0*Math.PI*Math.pow(radius, 2)+2*Math.PI*height*radius);
	}
	public double volume() {
		return(height*Math.PI*Math.pow(radius,2));
	}
}
