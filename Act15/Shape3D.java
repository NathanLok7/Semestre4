package iteso.libs.shape3D;

public abstract class Shape3D {
	public abstract double getPerimeter();
	public abstract double getArea();
	public abstract double getVolume();
	
	public static final int Sphere = 0;
	public static final int Cylinder = 1;
    public static final int Box = 2;

    //public static final int x = 0 , y= 0, z = 0;

	public Shape3D(double x, double y, double z) {
		this.x = x;
        this.y = y;
        this.z = z;
	}
	
	public static Shape3D getInstance(int figureType) {
		Shapes3D retVal = null;
		
		if(figureType == Sphere) 
			retVal = new Sphere();
		if(figureType == Cylinder) 
			retVal = new Cylinder();
        if(figureType == Box) 
	    	retVal = new Box();
		
		return retVal;
	}
	
	public void setX(double x) {this.x = x;}
	public void setY(double y) {this.y = y;}
    public void setZ(double z) {this.z = z;}

	public double getX() {return this.x;}
    public double getY() {return this.y;}
    public double getZ() {return this.z;}
    


    public static Sphere createSphere(double x, double y, double z, double radio) {
        return new Sphere(x, y, z, radio);
    }

    public static Cylinder createCylinder(double x, double y, double z, double radio, double h) {
        return new Cylinder(x, y, z, radio, h);
    }

    public static Box createBox(double x, double y, double z, double wide, double large, double h) {
        return new Box(x, y, z, wide, large, h);
    }

}