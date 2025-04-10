package Clase9;

public class Cliente {

    //Atributos
    private String cedula;
    private String nombre;
    private String numeroTelefono;
    private String correoElectronico;

    //Constructor
    public Cliente(String cedula, String nombre, String numeroTelefono, String correoElectronico) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.numeroTelefono = numeroTelefono;
        this.correoElectronico = correoElectronico;
    }
    //Metodos
    public String getCedula() {
        return cedula;
    }
    public String getNombre() {
        return nombre;
    }
    public String getNumeroTelefono() {
        return numeroTelefono;
    }
    public String getCorreoElectronico() {
        return correoElectronico;
    }




}
