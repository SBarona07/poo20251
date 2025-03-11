
import java.util.Scanner;

public class EjecutarM {

    private static Motocicletas bajocc[] = new Motocicletas[20];
    private static Motocicletas altocc[] = new Motocicletas[10];
    private static Scanner entrada = new Scanner(System.in);

    public static void main(String[] args) {
        
        int opcion;
    

       do {
        System.out.println("Menu principal: ");
        System.out.println("1. Registro de moto");
        System.out.println("2. Cobro del parqueadero ");
        System.out.println("3. Cerrar la aplicacion ");
        System.out.println("4. Mostrar estado del parqueadero ");
        System.out.println("5. Cerrar la opcion: ");
        System.out.println("Seleccione una opcion");
        opcion = entrada.nextInt();

           switch (opcion) {
            case 1:
            registrarMotocicleta(bajocc, 250, "bajo cilindraje");
            break;
            case 2:
            registrarMotocicleta(altocc, 400, "alto cilindraje");
            break;
            case 3:
            cobrarTarifa();
            break;
            case 4:
            mostrarEstadoParqueadero();
            break;
            case 5:
            System.out.println("Cerrando la aplicacion...");
            break;
            default: 
            System.out.println("Opcion no valida. Intente de nuevo");

        }
    } while (opcion !=5); 
        
}
// Metodo para registrar una moto
public static void registrarMoto(Motocicletas[]motos,double cilindrajeLimite, String tipo){
    System.out.println("Registro de moto(" + tipo + ") ");
    System.out.println("Ingrese placa de la moto");
    String placa = entrada.next();

    placa=placa.toUpperCase();

    //Verificar si la moto ya esta registrada

if (buscarMoto(placa) != null) {
    System.out.println("Error la moto con placa "+ placa + "ya esta registrada");
    return;
    }
    System.out.println("Ingrese el cilindraje de la moto: ");
    double cilindraje = entrada.nextDouble();
    System.out.println("Ingrese la marca de la moto:");
    String marca = entrada.next();

    //Validad cilindraje segun el tipo de parqueadero
    if (tipo.equals("bajo cilindraje")) {
        if (cilindraje > 400) {
            System.out.println("Error : esa moto debe registrarse en el parqueadero de alto cilindraje ");
            return;
            
        }
        
    }else if (tipo.equals("alto cilindraje")) {
        if (cilindraje < 401) {
            System.out.println("Error: Esta moto debe registrarse en el parqueadero de bajo cilindraje: ");
            return;
            
        }
        
    }
    Motocicletas moto = new Motocicletas(placa, cilindraje, marca, 0);

    //Mostrar puestos disponibles
    System.out.println("Puestos disponibles: ");
    for (int i = 0; i < motos.length; i++){
        if (motos[i]== null) {
            System.out.println((i + 1)+ " " );
            
        }
    }
    System.out.println();

    //Seleccionar puesto
    System.out.println("seleccione un puesto:");
    int puesto = entrada.nextInt()-1;

    if (puesto < 0 || puesto >= motos.length) {
        System.out.println("Error puesto no valido. ");
        return;
    }

    if  (motos[puesto] !=null){
        System.out.println("Error en el puesto" +(puesto + 1)+ "ya esta ocupado.");
        return;
    }
    motos[puesto] = moto;
    System.out.println("moto registrada en el puesto" +(puesto + 1)"ya esta ocupado.");
}

//Metodo para cobrar la tarifa
public static void cobrarTarifa(){
    System.out.println("-- Cobro de la tarifa");
    System.out.println("Ingrese la placa de la moto: ");
    String placa = entrada.next();

    placa = placa.toUpperCase();

    Motocicletas moto = buscarMoto(placa);

    if (moto != null) {
        System.out.println("ingrese el tiempo del estacionamiento en minutos");
        int tiempo = entrada.next.nextInt();

        double tarifa = calcularTarifa(tiempo);
        System.out.println(" la tarifa a pagar es :$ ");

        
    }
}


}

    
    