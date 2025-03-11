
import java.util.Scanner;

public class EjecutarMoto {

    private static Motocicletas bajocc[] = new Motocicletas[20];
    private static Motocicletas altocc[] = new Motocicletas[10];
    private static Scanner entrada = new Scanner(System.in);

    public static void main(String[] args) {

        int opcion;

        do {
            System.out.println("Menu principal: ");
            System.out.println("1. Registrar moto bajo cilindraje");
            System.out.println("2. registrar moto alto cilindraje ");
            System.out.println("3. Generar cobro ");
            System.out.println("4. Mostrar estado del parqueadero ");
            System.out.println("5. Cerrar la opcion: ");
            System.out.println("Seleccione una opcion");
            opcion = entrada.nextInt();

            switch (opcion) {
                case 1:
                    registrarMoto(bajocc, 250, "bajo cilindraje");
                    break;
                case 2:
                    registrarMoto(altocc, 400, "alto cilindraje");
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
        } while (opcion != 5);

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

    //Validar cilindraje segun el tipo de parqueadero
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
        System.out.println("Error en el puesto" +(puesto + 1 )+ " ya esta ocupado.");
        return;
    }
    motos[puesto] = moto;
    System.out.println("moto registrada en el puesto " +(puesto + 1 )+" ya esta ocupado.");
}

    // Metodo para cobrar la tarifa
    public static void cobrarTarifa() {
        System.out.println("-- Cobro de la tarifa");
        System.out.println("Ingrese la placa de la moto: ");
        String placa = entrada.next();

        placa = placa.toUpperCase();

        Motocicletas moto = buscarMoto(placa);

        if (moto != null) {
            System.out.println("ingrese el tiempo del estacionamiento en minutos: ");
            int tiempo = entrada.nextInt();

            double tarifa = calcularTarifa(tiempo);
            System.out.println(" la tarifa a pagar es :$ " + tarifa);

            liberarPuesto(moto);

        }else{
            System.out.println("moto no encontrada.");
            
        }
    }

    // Metodo para calcular la tarifa
    private static double calcularTarifa(int tiempo) {
        if (tiempo <= 30) {
            return 0;
        } else if (tiempo <= 60) {
            return 800;
        } else {
            return 2000;
        }
    }

    // Metodo para liberar un puesto
private static void liberarPuesto(Motocicletas moto){
    for(int i = 0; i < bajocc.length; i++){
        if (bajocc[i] != null && bajocc[i].getPlaca().equals(moto.getPlaca())){
            bajocc[i] = null;
            System.out.println("puesto liberado en el parqueadero de bajo cilindraje");
            return;
        }
    }
    for(int i = 0; i< altocc.length; i++){
        if (altocc[i] != null && altocc[i].getPlaca().equals(moto.getPlaca())) {
            altocc[i] = null;
            System.out.println("puesto liberado en el parqueadero de alto cilindraje");
            
        }
    }
}

    // Metodo mostrar estado del parqueadero
    private static void mostrarEstadoParqueadero() {
        System.out.println("--Estado del parqueadero--");
        System.out.println("Bajo cilindraje (20 puestos): ");
        for (int i = 0; i < bajocc.length; i++) {
            System.out.println("puesto" + (i + 1) + ":" + (bajocc[i] == null ? "disponible" : "ocupado"));
        }

        System.out.println("Alto cilindraje (10 puestos):");
        for (int i = 0; i < altocc.length; i++) {
            System.out.println("puesto" + (i + 1) + ":" + (altocc[i] == null ? "disponible" : "ocupado"));
        }
    }

    // Metodo para buscar una moto por su placa
private static Motocicletas buscarMoto(String placa){
    for(Motocicletas moto : bajocc){
        if (moto != null && moto.getPlaca().equals(placa)) {
            return moto;
            
        }
    }
    for(Motocicletas moto : altocc){
        if  (moto != null && moto.getPlaca().equals(placa)){
            return moto;
        }
    }
    return null;
}
}
