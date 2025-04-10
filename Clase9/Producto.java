package Clase9;

public class Producto {

    //Atributos
    private int numero;
    private String nombre;
    private double precio;
    private String referencia;
    private double ancho;
    private double alto;

    //Constructor
    public Producto(int numero, String nombre,double precio, String referencia, double ancho, double alto){
        this.numero = numero;
        this.nombre = nombre;
        this.precio = precio;
        this.referencia = referencia;
        this.ancho = ancho;
        this.alto = alto;
    }

    //Metodos
    public int getNumero(){
        return numero;
    }

    public String getNombre(){
        return nombre;
    }
    public double getPrecio(){
        return precio;
    }

    public String getReferencia(){
        return referencia;
    }

    public double getAncho(){
        return ancho;
    }

    public double getAlto(){
        return alto;
    }


    public String toString(){
        return "Producto[" + 
        " Numero: " + numero +
        ", Nombre: " + nombre +
        ", Precio: " + precio +
        ", Referencia: " + referencia +
        ", Ancho: " + ancho +
        ", Alto: " + alto + "]";
    }
}
