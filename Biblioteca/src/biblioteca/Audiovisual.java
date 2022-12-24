package biblioteca;


import biblioteca.Material;


public class Audiovisual extends Material{
  private int duracion;

    public Audiovisual(int duracion, int codigo, String titulo) {
        super(codigo, titulo);
        this.duracion = duracion;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    @Override
    public String toString() {
        return "Audiovisual{" + "duracion=" + duracion + '}';
    }
  
}
   