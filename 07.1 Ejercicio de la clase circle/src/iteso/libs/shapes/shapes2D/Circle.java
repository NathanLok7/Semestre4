package iteso.libs.shapes.shapes2D;

public class Circle {
	private double radio = 1.0;
	
	// Setter
	public void setRadio(double r) {
		if(r>=1.0 && r<=10)
			radio = r;
	}
	
	public double getArea() {
		return Math.PI * Math.pow(radio,2);
	}
	
	public double getPerimeter() {
		return 2 * Math.PI * radio;
	}

}
