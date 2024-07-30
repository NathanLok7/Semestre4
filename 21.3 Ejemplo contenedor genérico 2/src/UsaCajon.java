import iteso.libs.*;
public class UsaCajon {

	public static void main(String[] args) {
		Cajon<String> c1 = new Cajon();
		Cajon<Integer> c2 = new Cajon();
		Cajon<Double> c3 = new Cajon();
		Cajon<RGBColor> c4 = new Cajon();
		
		c1.guardar("Hola");
		c2.guardar(10);
		c3.guardar(1.5);
		
		c4.guardar(new RGBColor(100,120,140));
		
		Integer i1 =  c2.remover();
		
		System.out.println(c3.remover());

		// System.out.println(c4.getContenido());
		System.out.println(c4);
		
		/*
		Cajon<Cajon> c6 = new Cajon();
		c6.guardar(c6);
		System.out.println(c6);
		*/
	}

}
