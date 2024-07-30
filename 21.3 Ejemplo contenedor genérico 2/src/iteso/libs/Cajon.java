package iteso.libs;

public class Cajon<Type> {
	private Type contenido = null;
	
	public void guardar(Type contenido) {
		Object o = contenido;
		if(o instanceof Cajon) {
			Cajon c = (Cajon) o;
			this.contenido = (Type) c.getContenido();
		} else if(this.contenido==null)
			this.contenido = contenido;
	}
	
	public Type getContenido() {
		return contenido;
	}
	
	public Type remover() {
		Type toReturn = contenido;
		contenido = null;
		return toReturn;
	}

	public String toString() {
		if(contenido==null)
			return "[]";
		else		
			return "[\t"+contenido+"\t]";
	}
}
