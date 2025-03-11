
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

    
    