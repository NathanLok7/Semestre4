public class GDrawer<T> {
    private T content;
  
    public GDrawer() {
      content = null;
    }
  
    public GDrawer(T content) {
      this.content = content;
    }
  
    public void setContent(T content) {
      this.content = content;
    }
  
    public T getContent() {
      return content;
    }
  
    public String toString() {
      if (content == null) {
        return "El cajón vacío";
      } else {
        return "Contenido del cajón: " + content.toString();
      }
    }
  
    public static void main(String[] args) {
      GDrawer<GDrawer<ColorRGB>> drawer1 = new GDrawer<>();
      GDrawer<ColorRGB> drawer2 = new GDrawer<>(new ColorRGB(0, 255, 255));
      drawer1.setContent(drawer2);
  
      GDrawer<GDrawer<GDrawer>> drawer3 = new GDrawer<>();
      drawer3.setContent(drawer3);
  
      System.out.println(drawer1);
      System.out.println(drawer2);
      System.out.println(drawer3);
    }
  }
  
  class ColorRGB {
    private int red;
    private int green;
    private int blue;
  
    public ColorRGB(int red, int green, int blue) {
      this.red = red;
      this.green = green;
      this.blue = blue;
    }
  
    public String toString() {
      return "Color RGB (" + red + ", " + green + ", " + blue + ")";
    }
  }
  
  
  public class GDrawer<T> {
    private T content;
  
    public GDrawer() {
      content = null;
    }
  
    public GDrawer(T content) {
      this.content = content;
    }
  
    public void setContent(T content) {
      this.content = content;
    }
  
    public T getContent() {
      return content;
    }
  
    public String toString() {
      if (content == null) {
        return "El cajón vacío";
      } else {
        return "Contenido del cajón: " + content.toString();
      }
    }
  
    public static void main(String[] args) {
      //Cajón para guardar cualquier tipo de objeto
      GDrawer<Object> drawer1 = new GDrawer<>();
      drawer1.setContent("Este es un cajón de cadenas");
  
      //Cajón que se almacena a sí mismo
      GDrawer<GDrawer<GDrawer>> drawer2 = new GDrawer<>();
      drawer2.setContent(drawer2);
  
      //Imprimir los cajones
      System.out.println(drawer1);
      System.out.println(drawer2);
    }
  }
  