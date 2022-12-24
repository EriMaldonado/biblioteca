package biblioteca;


import java.util.Objects;

public class Carrera {
    private String nombreCarrera;
    private int duracion;
    private String nombreDirector ;

    public Carrera(String nombreCarrera, int duracion, String nombreDirector) {
        this.nombreCarrera = nombreCarrera;
        this.duracion = duracion;
        this.nombreDirector = nombreDirector;
    }

    public String getNombreCarrera() {
        return nombreCarrera;
    }

    public void setNombreCarrera(String nombreCarrera) {
        this.nombreCarrera = nombreCarrera;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public String getNombreDirector() {
        return nombreDirector;
    }

    public void setNombreDirector(String nombreDirector) {
        this.nombreDirector = nombreDirector;
    }

}