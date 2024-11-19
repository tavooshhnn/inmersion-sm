package modelo;

public class Titulo {
    private String nombre;
    private int fechaDeLAnzamiento;
    private double evaluacion;
    private boolean incluidoEnElPlanBasico;
    private String sinopsis;
    private int tiempoDeDuracionEnMinutos;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getFechaDeLAnzamiento() {
        return fechaDeLAnzamiento;
    }

    public void setFechaDeLAnzamiento(int fechaDeLAnzamiento) {
        this.fechaDeLAnzamiento = fechaDeLAnzamiento;
    }

    public boolean isIncluidoEnElPlanBasico() {
        return incluidoEnElPlanBasico;
    }

    public void setIncluidoEnElPlanBasico(boolean incluidoEnElPlanBasico) {
        this.incluidoEnElPlanBasico = incluidoEnElPlanBasico;
    }

    public String getSinopsis() {
        return sinopsis;
    }

    public void setSinopsis(String sinopsis) {
        this.sinopsis = sinopsis;
    }

    public int getTiempoDeDuracionEnMinutos() {
        return tiempoDeDuracionEnMinutos;
    }

    public void setTiempoDeDuracionEnMinutos(int tiempoDeDuracionEnMinutos) {
        this.tiempoDeDuracionEnMinutos = tiempoDeDuracionEnMinutos;
    }

    public void muetraFichaTecnica (){
        System.out.println(" ");
        System.out.println("#### FICHA TÉCNICA ####");
        System.out.println("Nombre del titulo: " + nombre);
        System.out.println("Fecha de lanzamiento: " + fechaDeLAnzamiento);
        System.out.println("tiempo de duración: " + getTiempoDeDuracionEnMinutos() + " minutos");


    }
}
