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
        System.out.println();

        
    }
}

}