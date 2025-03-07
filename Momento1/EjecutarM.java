
import java.util.Scanner;

public class EjecutarM {
    public static void main(String[] args){
        Motocicleta bajocc[] = new Motocicleta[20];
        Motocicleta altocc[] = new Motocicleta[10];

        String placa;
        double cilindraje;
        String marca;

        Scanner entrada = new Scanner(System.in);
        int opcion;
       do {
        System.out.println("Menu principal: ");
        System.out.println("1. Registro de moto");
        System.out.println("2. Cobro del parqueadero");
        System.out.println("3. Cerrar la aplicacion");
        opcion = entrada.nextInt();

        switch (opcion) {
            case 1:

            System.out.println("Ingrese por favor su placa: ");
            placa = entrada.next();
            System.out.println("Ingrese por favor el cilindraje de su moto:");
            cilindraje = entrada.nextDouble();
            System.out.println("Ingrese  por favor la marca de su moto: ");
            marca = entrada.next();
            if (cilindraje <= 400  ) {
                System.out.println("su moto es de bajo cilindraje ");
                
            }
                
           break;
        
            default:
                break;
        }

       } while (true);
        


        

        

    }
}
