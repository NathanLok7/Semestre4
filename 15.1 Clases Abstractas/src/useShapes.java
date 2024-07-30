import shapes.*;


public class useShapes {

	public static void main(String[] args) {
		Shape3D[] aShape= new Shape3D[3];
		aShape[0]= new Box(1,2,3,4,5,6);
		System.out.println(aShape[0]);
		aShape[1]= new Sphere(1,2,3,4);
		System.out.println(aShape[1]);
		aShape[2]= new Cilinder(1,2,3,4,5);
		System.out.println(aShape[2]);
	}

}
