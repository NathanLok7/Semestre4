package iteso.libs;

public class RGBColor {
	private int red=0,green=0,blue=0;
	
	public RGBColor() {
		
	}
	
	public RGBColor(int red,int green,int blue) throws InvalidColorValueException {
		setRed(red);
		setGreen(green);
		setBlue(blue);
	}
	
	public void setRed(int red) throws InvalidColorValueException  {
		if(red>=0 && red<=255)
			this.red = red;
		else
			throw new InvalidColorValueException("red",red);
	}
	
	public void setGreen(int green) throws InvalidColorValueException {
		if(green>=0 && green<=255)
			this.green = green;
		else
			throw new InvalidColorValueException("green",green);
	}

	public void setBlue(int blue) throws InvalidColorValueException {
		if(blue>=0 && blue<=255)
			this.blue = blue;
		else
			throw new InvalidColorValueException("blue",blue);
	}

	public int getRed() {
		return red;
	}
	
	public int getGreen() {
		return green;
	}
	
	public int getBlue() {
		return blue;
	}
	
	public String toString() {
		return 	"{\n" +
				"\t\"red\":"+red+",\n"+
				"\t\"green\":"+green+",\n"+
				"\t\"blue\":"+blue+"\n"+
				"}";
	}

}
