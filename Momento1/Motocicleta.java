
 //Atributos de la clase
 public class Motocicleta {
    private String placa;
    private double cilindraje;
    private String marca;
    private int tiempo;

    //Contructor de la clase
    public Motocicleta(String placa, double cilindraje, String marca, int tiempo){
        this.placa = placa;
        this.cilindraje = cilindraje;
        this.marca = marca;
        this.tiempo = tiempo;

    }

    public String getPlaca() {
        return placa;
    }
    public double getCilindraje() {
        return cilindraje;
    }
    public String getMarca() {
        return marca;
    }
    public int getTiempo() {
        return tiempo;
    }

    
        public String setPlaca() {
        return placa;
    }
    public double setCilindraje() {
        return cilindraje;
    }
    public String setMarca() {
        return marca;
    }
    public int setTiempo() {
        return tiempo;
    }

    }

