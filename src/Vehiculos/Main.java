package Vehiculos;

public class Main {
    public static void main(String[] args) {

        //--INSTANCIAS
        Auto miAuto = new Auto();
        Avion miAvion = new Avion();
        Helicoptero miHeli = new Helicoptero();
        Lancha miLancha = new Lancha();

        //--CASTEO
        Vehiculo mercedez = (Vehiculo) miAuto;
        Vehiculo boeing = (Vehiculo) miAvion;
        Vehiculo heli = (Vehiculo) miHeli;
        Vehiculo lancha = (Vehiculo) miLancha;

        //--CHEQUEO INSTANCE OF
        Vehiculo.hacerVolar(mercedez);
        Vehiculo.hacerVolar(boeing);
        Vehiculo.hacerVolar(heli);
        Vehiculo.hacerVolar(lancha);

    }
}
