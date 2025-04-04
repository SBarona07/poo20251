package Clase9;

import java.sql.Date;

public class Pedido extends Producto {

    //Atributos
    private Cliente cliente;
    private Producto[] producto;
    private Date fecha;
    private int numeroTarjetaCredito;

    //Constructor
    public Pedido(Cliente cliente, Producto[] producto, Date fecha, int numeroTarjetaCredito){
        this.cliente = cliente;
        this.producto = producto;
        this.fecha = fecha;
        this.numeroTarjetaCredito = numeroTarjetaCredito;
    }


    //Metodos
    public Cliente getCliente(){
        return cliente;
    }

    public Producto[] getProducto(){
        return producto;
    }

    public Date getFecha(){
        return fecha;
    }

    public int getnumeroTarjetaCredito(){
        return numeroTarjetaCredito;
    }

    
}
