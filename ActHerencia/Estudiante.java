public class Estudiante extends Persona {
    private String planDeEstudios;
    private int creditosCursados;
    private int semestreCursados;

    public Estudiante(String nombre, String apellidoPaterno, String apellidoMaterno, String genero, int edad, String planDeEstudios) {
        super(nombre, apellidoPaterno, apellidoMaterno, genero, edad);
        this.planDeEstudios = planDeEstudios;
    }

    public void setPlanDeEstudios(String planDeEstudios) {
        this.planDeEstudios = planDeEstudios;
    }

    public void setCreditosCursados(int creditosCursados) {
        this.creditosCursados = creditosCursados;
    }

    public void setSemestreCursados(int semestreCursados) {
        this.semestreCursados = semestreCursados;
    }

    public String getPlanDeEstudios() {
        return planDeEstudios;
    }

    public int getCreditosCursados() {
        return creditosCursados;
    }

    public int getSemestreCursados() {
        return semestreCursados;
    }
}
