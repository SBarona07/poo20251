package Clase9;

public class Impresion extends Producto {

    // Atributos
    private String color;
    private Foto[] foto; // Arreglo de fotos

    // Constructor
    public Impresion(Foto[] foto, String color, int numero, String nombre, double precio,
            String referencia, double ancho, double alto) {
        super(numero, nombre, precio, referencia, ancho, alto); // El super es la herencia de la clase padre|
    
        // Inicializa los atributos de la clase hija
        this.color = color;
        this.foto = foto;
    }

    // Metodos
    // get se usa para retornar informacion puntual
    public String getColor() {
        return color;
    }

    public Foto[] getFoto() {
        return foto;
    }

    // Set encapsula la informacion
    // metodos set y get se realizan solo a los atributos.

    public void setColor(String color) {
        this.color = color;
    }

    public void setFoto(Foto[] foto) {
        this.foto = foto;
    }

    // El toString es el metodo que se usa para mostrar la info de la clase.
    public String toString() {
        return "Impresion[" +
                " Color=" + color + '\'' +
                " Foto=" + java.util.Arrays.toString(foto) +
                ']';
    }
}
