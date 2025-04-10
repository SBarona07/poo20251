package Clase9;

public class Cliente {

    //Atributos
    private int cedula;
    private String nombre;
    private int numeroTelefono;
    private String correoElectronico;

    //Constructor
    public Cliente(int cedula, String nombre, int numeroTelefono, String correoElectronico) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.numeroTelefono = numeroTelefono;
        this.correoElectronico = correoElectronico;
    }
    //Metodos
    public int getCedula() {
        return cedula;
    }
    public String getNombre() {
        return nombre;
    }
    public int getNumeroTelefono() {
        return numeroTelefono;
    }
    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public String toString() {
        return "Cliente[" +
                "Cedula: '" + cedula + '\'' +
                ", Nombre: '" + nombre + '\'' +
                ", NumeroTelefono: '" + numeroTelefono + '\'' +
                ", CorreoElectronico: '" + correoElectronico + '\'' +
                ']';
    }




}
