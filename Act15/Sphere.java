package iteso.libs.shape3D;

public class Sphere extends Shape3D {

	private double radio = 0;

	public Sphere(double x, double y, double z, double radio) {
		super(x, y, z);
		setRadius(radio);
	}
	
	public void setRadio(double radio) {
		if(radio > 0 || radio >= 100)
			this.radio = radio;
	}

	public double getRadio() {
		return(radio);
	}

	@Override
	public double getPerimeter() {
		return 2 * Math.PI * radio;
	}

	public String toString() {
		return("Esfera\n"+
				super.toString()+
				"\nRadio :"+radio+
				"\nArea :"+area()+
				"\nVolumen :"+volume()+
				"\n");
	}
	
	@Override
	public double getArea() {
		return 4 * Math.PI * Math.pow(radio, 2);
	}
	public double Volume() {
		return (4.0/3.0) * Math.PI * Math.pow(radius, 3);
	}

}


