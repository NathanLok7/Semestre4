package shapes;

public class Box extends Shape3D {
	// Atributos de la clase box
	private double width,height,depth;
	
	// Constructor
	public Box(double x,double y,double z, double width,double height,double depth) {
		super(x,y,z); 
		setWidth(width);
		setHeight(height);
		setDepth(depth);
	}
	
	// Setters
	public void setWidth(double width) {
		this.width=width;
	}
	public void setHeight(double height) {
		this.height=height;
	}
	public void setDepth(double depth) {
		this.depth=depth;
	}

	//Getters
	public double getWidth() {
		return(width);
	}
	public double getHeight() {
		return(height);
	}
	public double getDepth() {
		return(depth);
	}
	
	public String toString() {
		return("Caja\n"+super.toString()+
				"\nAncho :"+width+
				"\nAltura :"+height+
				"\nProfundidad :"+depth+
				"\nArea :"+area()+
				"\nVolumen :"+volume()+
				"\n");
	}
	
	// Implementación de los métodos abstractos
	public double area() {
		return(2*width*height+2*width*depth+2*height*depth);
	}
	public double volume() {
		return(width*height*depth);
	}
}
