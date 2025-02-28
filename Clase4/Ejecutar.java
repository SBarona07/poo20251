package Clase4;

public class Ejecutar {
    public static void main(String[] args) {

        //Creacion de los objetos de la clase Vehiculo

        //Forma1
        Vehiculo objVehiculo1 = new Vehiculo("Toyota", "Blanco", 4500.0, "TS45335WE", 2.3, "150HP");


        //Forma2
        Vehiculo objVehiculo2;
        objVehiculo2 = new Vehiculo("Ferrari", "rojo", 5000.0, "SWREF345", 1.8, "450HP");

        //Mostrar la marca del vehiculo del objeto Vehiculo
        System.out.println(objVehiculo1.getMarca());

        //Se va modificar la marca del vehiculo del objeto objVehiculo1
        objVehiculo1.setMarca("Chevrolet");

        //Mostrar todo el objeto
        System.out.println(objVehiculo1.toString());
        System.out.println(objVehiculo2);


        System.out.println(objVehiculo1.getMarca());
        objVehiculo1.acelerar();
        System.out.println(objVehiculo2.getMarca());
        objVehiculo2.frenar();
    }
}