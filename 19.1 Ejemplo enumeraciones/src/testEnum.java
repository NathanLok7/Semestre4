import iteso.libs.autos.*;

public class testEnum {

	public static void main(String[] args) {
		marcasAutos m1 = marcasAutos.HONDA;
		
		System.out.println(m1);
		System.out.println(m1.getPaisOrigen());
		
		System.out.println(marcasAutos.AUDI.getPaisOrigen());
		
		System.out.println(Pais.MEXICO);
		System.out.println(Pais.ARGENTINA.ordinal());

	}

}
