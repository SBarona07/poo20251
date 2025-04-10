package Clase9;

public class EjecutarMomento2 {
    public static void main(String[] args) {
        Cliente[] cliente = new Cliente[3];
        cliente[0] = new Cliente(null, null, null, null);
        cliente[1] = new Cliente(null, null, null, null);
        cliente[2] = new Cliente(null, null, null, null);
        Producto[] producto = new Producto[3];
        producto[0] = new Producto(1, "Foto", 100.0, "F001", 10.0, 15.0);
        producto[1] = new Producto(2, "Foto", 200.0, "F002", 20.0, 25.0); 
        producto[2] = new Producto(3, "Foto", 300.0, "F003", 30.0, 35.0);
        Pedido[] pedido = new Pedido[3];
        pedido[0] = new Pedido(cliente[0], producto, null, 123456789, 1, "Foto", 100.0, "F001", 10.0, 15.0);
        pedido[1] = new Pedido(cliente[1], producto, null, 987654321, 2, "Foto", 200.0, "F002", 20.0, 25.0);
        pedido[2] = new Pedido(cliente[2], producto, null, 456789123, 3, "Foto", 300.0, "F003", 30.0, 35.0);
        //Imprimir los pedidos
        for (int i = 0; i < pedido.length; i++) {
            System.out.println("Pedido " + (i + 1) + ":");
            System.out.println("Cliente: " + pedido[i].getCliente());
            System.out.println("Producto: " + pedido[i].getProducto()[0]);
            System.out.println("Fecha: " + pedido[i].getFecha());
            System.out.println("Número de tarjeta de crédito: " + pedido[i].getnumeroTarjetaCredito());
            System.out.println();
        }
        //Imprimir los productos
        for (int i = 0; i < producto.length; i++) {
            System.out.println("Producto " + (i + 1) + ":");
            System.out.println("Número: " + producto[i].getNumero());
            System.out.println("Nombre: " + producto[i].getNombre());
            System.out.println("Precio: " + producto[i].getPrecio());
            System.out.println("Referencia: " + producto[i].getReferencia());
            System.out.println("Ancho: " + producto[i].getAncho());
            System.out.println("Alto: " + producto[i].getAlto());
            System.out.println();
        }
        //Imprimir los clientes
        for (int i = 0; i < cliente.length; i++) {
            System.out.println("Cliente " + (i + 1) + ":");
            System.out.println("Nombre: " + cliente[i].getNombre());
            System.out.println();
        }
        //Imprimir las fotos
        for (int i = 0; i < producto.length; i++) {
            if (producto[i] instanceof Impresion) {
                Impresion impresion = (Impresion) producto[i];
                System.out.println("Impresión " + (i + 1) + ":");
                System.out.println("Color: " + impresion.getColor());
                System.out.println("Foto: " + java.util.Arrays.toString(impresion.getFoto()));
                System.out.println();
            }
        }
        //Imprimir las fotos

    }
}
