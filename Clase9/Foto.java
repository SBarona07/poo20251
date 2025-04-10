package Clase9;

public class Foto {

    //Atributos
    private String fichero;
    private String fotoColor;
    private String fotoBlancoNegro;
    private int numeroCopias;

    //Constructor
    public Foto(String fichero, String fotoColor, String fotoBlancoNegro, int numeroCopias) {
        this.fichero = fichero;
        this.fotoColor = fotoColor;
        this.fotoBlancoNegro = fotoBlancoNegro;
        this.numeroCopias = numeroCopias;
    }
    //Metodos
    public void setFichero(String fichero) {
        this.fichero = fichero;
    }
    public String getFichero() {
        return fichero;
    }
    public void setFotoColor(String fotoColor) {
        this.fotoColor = fotoColor;
    }
    public String getFotoColor() {
        return fotoColor;
    }
    public void setFotoBlancoNegro(String fotoBlancoNegro) {
        this.fotoBlancoNegro = fotoBlancoNegro;
    }
    public String getFotoBlancoNegro() {
        return fotoBlancoNegro;
    }
    public void setNumeroCopias(int numeroCopias) {
        this.numeroCopias = numeroCopias;
    }
    public int getNumeroCopias() {
        return numeroCopias;
    }
    public String toString() {
        return "Foto{" +
                "fichero='" + fichero + '\'' +
                ", fotoColor='" + fotoColor + '\'' +
                ", fotoBlancoNegro='" + fotoBlancoNegro + '\'' +
                ", numeroCopias=" + numeroCopias +
                '}';
    }
    
    }

    
