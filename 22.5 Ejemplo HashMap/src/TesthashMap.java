import java.util.HashMap;

public class TesthashMap {
	
	public static void main(String[] args) {
		HashMap<Integer,String> hm1 = new HashMap<>();
		
		hm1.put(1,"José Luis");
		hm1.put(2,"José Luis");
		hm1.put(3,"José Luis");
		hm1.put(3,"Abraham");
		
		System.out.println(hm1);
		
		HashMap<String,String> hm2 = new HashMap<>();
		
		hm2.put("jluis@iteso.mx","José Luis");
		hm2.put("abraham.deleon@iteso.mx","Abraham");
		hm2.put("lorena.ruelas@iteso.mx","Lorena");
		hm2.put("emiliano.arroyo@iteso.mx","Emiliano");
		
		System.out.println(hm2);

	}

}
