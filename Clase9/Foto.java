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
    //Getters
    public String getFichero() {
        return fichero;
    }
    public String getFotoColor() {
        return fotoColor;
    }
    public String getFotoBlancoNegro() {
        return fotoBlancoNegro;
    }
    public int getNumeroCopias() {
        return numeroCopias;
    }

    //Metodo
    public void print(){
        
    }

    
}
