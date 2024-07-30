package iteso.libs.shape3D;

public class Cylinder extends ShapesD {

	private double radio = 0, h = 0;

	public Cylinder(double x, double y, double z, double radio, double h) {
		super(x, y, z); //Clase padre
		setRadio(radio);
		setHeight(h);
	}
	
	
	public void setRadio(double radio) {
		if(radio > 0 || radio >= 100)
			this.radio = radio;
	}

    public void setHeight(double h) {
        if(h > 0 || h >= 100){
            this.h = h;
        }
    }
	
	public String toString() {
		return("Cilindro\n"+
				super.toString()+
				"\nRadio :"+radio+
				"\nAltura :"+h+
				"\nÁrea :"+area()+
				"\nVolumen :"+volume()+
				"\n");
	}
 
	@Override
	public double getPerimeter() {
		return 2 * Math.PI * radio;
	}

	@Override
	public double getArea() {
		return 2 * Math.PI * radio + 2 * Math.PI * Math.pow(radio, 2);
	}

}


