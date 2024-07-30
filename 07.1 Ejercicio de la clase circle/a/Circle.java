package a;

public class Circle {
public double Radio;

		public  double getArea(double Radio) {
			
			double area = Math.PI*Radio*Radio;
			
			return area;
		}
		
	public  double getPerimeter(double Radio) {
			
			double perimetro = 2*Math.PI*Radio;
			
			return perimetro;
			
		}

	 public void print(Circle circulo) {
		   System.out.println("El area es: "  + String.format("%.4f", circulo.getArea(Radio)) + " El perimetro es: " + String.format("%.4f", circulo.getPerimeter(Radio)
				 ) + " El radio es: " + circulo.Radio);
	   }
	   
	 
	   
	gvxfd
	
}
