package iteso.libs.shape3D;

public class Box extends Shape3D {

	private double wide = 0, height = 0, large = 0;

	public Box(double x, double y, double z, double wide, double height, double large) {
		super(x, y, z); 
		setWide(wide);
		setHeight(height);
		setDepth(large);
	}
	
	public void setWide(double wide) {
		if(wide > 0 || wide >= 100)
			this.wide = wide;
	}

    public void setHeight(double h) {
        if(h > 0 || h >= 100){
            this.h = h;
        }
    }

    public void setLarge(double large) {
		if(large > 0 || large >= 100)
			this.large = large;
	}

	// Getters
	public double getWide() {
		return(wide);
	}
	public double getHeight() {
		return(height);
	}
	public double getLarge() {
		return(large);
	}

	public String toString() {
		return("Caja\n"+super.toString()+
				"\nAncho :"+wide+
				"\nAltura :"+height+
				"\nProfundidad :"+large+
				"\nArea :"+area()+
				"\nVolumen :"+volume()+
				"\n");
	}
	
	@Override
	public double getArea() {
		return large * wide * 6;
	}

	public double volume() {
		return wide * height * large;
	}

}
