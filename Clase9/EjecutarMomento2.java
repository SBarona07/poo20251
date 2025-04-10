package Clase9;

public class EjecutarMomento2 {
    public static void main(String[] args) {
        Cliente[] cliente = new Cliente[3];
        cliente[0] = new Cliente(102221454, "Rafael Perez", 32344412, "rafaelperez@hotmail.com");
        cliente[1] = new Cliente(98248631, "Carlos Pez", 31045632, "carlospaez@gmail.com");
        cliente[2] = new Cliente(85654223, "Carolina Fuentes", 35254789, "carolfuentes@gmail.com");
        // Crear un objeto de la clase Cliente
        Cliente objCliente = new Cliente(0, null, 0, null);
        Cliente objCliente1 = new Cliente(0, null, 0, null);
        Cliente objCliente2 = new Cliente(0, null, 0, null);

        // Crear un arreglo de productos
        Producto[] producto = new Producto[3];
        producto[0] = new Producto(1, "Rafael", 25000.0, "FJ21", 15.0, 20.0);
        producto[1] = new Producto(2, "Carlos", 15000.0, "RM54", 35.0, 255.0);
        producto[2] = new Producto(3, "Carolina", 54000.0, "F003", 39.0, 27.0);
        // Crear un objeto de la clase Producto
        Producto objProducto = new Producto(0, null, 0, null, 0, 0);
        Producto objProducto1 = new Producto(0, null, 0, null, 0, 0);
        Producto objProducto2 = new Producto(0, null, 0, null, 0, 0);

        // Crear un arreglo de pedidos
        Pedido[] pedido = new Pedido[3];
        pedido[0] = new Pedido(cliente[0], producto, null, 123456789, 1, "Rafael perez", 25000.0, "FJ21", 15.0, 20.0);
        pedido[1] = new Pedido(cliente[1], producto, null, 987654321, 2, "Carlos Paez", 15000.0, "RM54", 35.0, 255.0);
        pedido[2] = new Pedido(cliente[2], producto, null, 456789123, 3, "Foto", 54000.0, "F003", 39.0, 27.0);
        // Crear un objeto de la clase Pedido
        Pedido objPedido = new Pedido(cliente[0], producto, null, 0, 0, null, 0, null, 0, 0);
        Pedido objPedido1 = new Pedido(cliente[1], producto, null, 0, 0, null, 0, null, 0, 0);
        Pedido objPedido2 = new Pedido(cliente[2], producto, null, 0, 0, null, 0, null, 0, 0);

        // Crear un arreglo para las cámaras
        Camara[] camara = new Camara[3];
        camara[0] = new Camara("Canon", "EOS 5D", 123456, 1, "Rafael", 25000.0, "FJ21", 15.0, 20.0);
        camara[1] = new Camara("Nikon", "D850", 654321, 2, "Carlos", 15000.0, "RM54", 35.0, 255.0);
        camara[2] = new Camara("Sony", "A7R III", 789456, 3, "Carolina", 54000.0, "F003", 39.0, 27.0);
        // Crear un objeto de la clase Camara
        Camara objCamara = new Camara("Canon", "E05 5D", 123456, 1, "Rafael", 25000., "FJ21", 15.0, 20.0);
        Camara objCamara1 = new Camara(null, null, 0, 0, null, 0, null, 0, 0);
        Camara objCamara2 = new Camara(null, null, 0, 0, null, 0, null, 0, 0);
        

        // Crear un arreglo de fotos
        Foto[] foto = new Foto[3];
        foto[0] = new Foto(null, null, null, 0);
        foto[1] = new Foto(null, null, null, 0);
        foto[2] = new Foto(null, null, null, 0);
        // Crear un objeto de la clase Foto
        Foto objFoto = new Foto(null, null, null, 0);
        Foto objFoto1 = new Foto(null, null, null, 0);
        Foto objFoto2 = new Foto(null, null, null, 0);

        //crear un arreglo de fotos
        Foto[] fotos = new Foto[3];
        fotos[0] = new Foto("foto1.jpg", "Color", null, 1);
        fotos[1] = new Foto("foto1.jpg", "Color", null, 1);
        fotos[2] = new Foto("foto1.jpg", "Color", null, 1);


        // Crear un objeto de la clase Impresion
        Impresion[] impresion = new Impresion[3];
        impresion[0] = new Impresion(foto, "Color", 1, "Rafael", 25000.0, "FJ21", 15.0, 20.0);
        impresion[1] = new Impresion(foto, null, 0, null, 0, null, 0, 0);
        impresion[2] = new Impresion(foto, null, 0, null, 0, null, 0, 0);
        //Crear un objeto de la clase Impresion
        Impresion objImpresion = new Impresion(foto, "Color", 1, "Rafael", 25000.0, "FJ21", 15.0, 20.0);
        Impresion objImpresion1 = new Impresion(foto, null, 0, null, 0, null, 0, 0);
        Impresion objImpresion2 = new Impresion(foto, null, 0, null, 0, null, 0, 0);


        // Imprimir los pedidos
        for (int i = 0; i < pedido.length; i++) {
            System.out.println("Pedido " + (i + 1) + ":");
            System.out.println("Cliente: " + pedido[i].getCliente());
            System.out.println("Producto: " + pedido[i].getProducto()[0]);
            System.out.println("Fecha: " + pedido[i].getFecha());
            System.out.println("Número de tarjeta de crédito: " + pedido[i].getnumeroTarjetaCredito());
            System.out.println();
        }
        // Imprimir los productos
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
        // Imprimir los clientes
        for (int i = 0; i < cliente.length; i++) {
            System.out.println("Cliente " + (i + 1) + ":");
            System.out.println("Nombre: " + cliente[i].getNombre());
            System.out.println("Cédula: " + cliente[i].getCedula());
            System.out.println("Número de teléfono: " + cliente[i].getNumeroTelefono());
            System.out.println("Correo electrónico: " + cliente[i].getCorreoElectronico());
            System.out.println();
        }
        // Imprimir las fotos
        for (int i = 0; i < producto.length; i++) {
            if (producto[i] instanceof Impresion) {
                Impresion impresionLocal = (Impresion) producto[i];
                System.out.println("Impresión " + (i + 1) + ":");
                System.out.println("Color: " + impresionLocal.getColor());
                System.out.println("Foto: " + java.util.Arrays.toString(impresionLocal.getFoto()));
                System.out.println();
            }
        }
        // Imprimir las cámaras
        for (int i = 0; i < camara.length; i++) {
            System.out.println("Cámara " + (i + 1) + ":");
            System.out.println("Marca: " + camara[i].getMarca());
            System.out.println("Modelo: " + camara[i].getModelo());
            System.out.println("Código: " + camara[i].getCodigo());
            System.out.println();
        }
        //Imprimir la impresion
        for (int i = 0; i < impresion.length; i++) {
            System.out.println("Impresión " + (i + 1) + ":");
            System.out.println("Color: " + impresion[i].getColor());
            System.out.println("Foto: " + java.util.Arrays.toString(impresion[i].getFoto()));
            System.out.println();
        }


    

    }
}
