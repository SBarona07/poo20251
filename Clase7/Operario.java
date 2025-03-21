package Clase7;

public class Operario extends Trabajador {

    private double horas;
    public final double SALARIO_BASE = 100.0; // Solamente las constantes van en mayuscula

    //Constructor --> Heredfa de la superclase idTrabajador, nombre , apellido
    public Operario(int idTrabajador, String nombre, String apellido, double horas) {
        super(idTrabajador, nombre, apellido);
        this.horas = horas;

    }

    public double pagar(){
        return SALARIO_BASE * horas;
    }


    public String toString() {
        return "Operario{ idTrabajador: " + super.getIdTrabajador() +
                " Nombre: " + super.getNombre() +
                " Apellido: " + super.getApellido() +
                " Horas Laboradas: " + horas + "}";
    }

}
