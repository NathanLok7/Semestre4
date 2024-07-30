public class GDrawer<T> {
    private T contenido;
  
    public GDrawer() {
      contenido = null;
    }
  
    public GDrawer(T contenido) {
      this.contenido = contenido;
    }
  
    public void setContenido(T contenido) {
      this.contenido = contenido;
    }
  
    public T getContenido() {
      return contenido;
    }
  
    public String toString() {
      if (contenido == null) {
        return "El cajón está vacío.";
      } else {
        return "Contenido del cajón: " + contenido.toString();
      }
    }
  
    public static void main(String[] args) {
      GDrawer<GDrawer<ColorRGB>> drawer1 = new GDrawer<>();
      GDrawer<ColorRGB> drawer2 = new GDrawer<>(new ColorRGB(0, 0, 255));
      drawer1.setContenido(drawer2);
  
      GDrawer<GDrawer<ColorRGB>> drawer3 = new GDrawer<>();
      GDrawer<ColorRGB> drawer4 = new GDrawer<>(new ColorRGB(255, 255, 255));
      drawer3.setContenido(drawer4);
  
      System.out.println(drawer1);
      System.out.println(drawer2);
      System.out.println(drawer3);
      System.out.println(drawer4);
    }
  }
  
  class ColorRGB {
    private int red;
    private int green;
    private int blue;
  
    public ColorRGB(int red, int green, int blue){
      this.red = red;
      this.green = green;
      this.blue = blue;
    }
  
    public String toString() {
      return "Color RGB ("+ red + ", " + green + ", " + blue + ")";
    }

  }