package Animales;
import Vehiculos.Volador;

public class Paloma extends Animal implements Volador {

    public Paloma(String nombre) {
        super(nombre);
    }

    @Override
    protected void describir(){
        System.out.println("Soy una paloma");
    }

    @Override
    public void volar(){
        System.out.println("Sali volando e hice piruetas");
    }
}
