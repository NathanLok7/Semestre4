package Act17;

public abstract class Person {
    private int edad;
    private int sexo;
    public static final int MALE = 0;
    public static final int FEMALE = 1;

    public abstract void work();

    public void setEdad(int edad){
        this.edad = edad;
    }
    
    public void setSexo(int sexo){
        this.sexo = sexo;
    }
 
}

