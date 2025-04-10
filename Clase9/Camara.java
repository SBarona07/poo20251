package Clase9;

public class Camara extends Producto {

    //Atributos
    private String Marca;
    private String modelo;
    private double codigo;

    //Constructor
    public Camara(String marca, String modelo, double codigo, int numero, String nombre, double precio,
            String referencia, double ancho, double alto) {
        super(numero, nombre, precio, referencia, ancho, alto); // Llamada al constructor de la clase padre
        this.Marca = marca;
        this.modelo = modelo;
        this.codigo = codigo;
    }
    //Metodos
    // get se usa para retornar informacion puntual
    public String getMarca() {
        return Marca;
    }
    public String getModelo() {
        return modelo;
    }
    public double getCodigo() {
        return codigo;
    }


    
}
