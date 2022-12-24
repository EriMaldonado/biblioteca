package biblioteca;


import biblioteca.Material;


public class Libro extends  Material{

    static String getIdioma;
    private String idioma;
    private String areaPertenece;

    public Libro(String idioma, String areaPertenece, int codigo, String titulo) {
        super(codigo, titulo);
        this.idioma = idioma;
        this.areaPertenece = areaPertenece;
    }

    public String getIdioma() {
        return idioma;
    }

    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }

    public String getAreaPertenece() {
        return areaPertenece;
    }

    public void setAreaPertenece(String areaPertenece) {
        this.areaPertenece = areaPertenece;
    }

    @Override
    public String toString() {
        return "Libro{" + "idioma=" + idioma + ", areaPertenece=" + areaPertenece + '}';
    }
    static String getArea() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
   

    

}
