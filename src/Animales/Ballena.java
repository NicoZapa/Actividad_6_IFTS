package Animales;

public class Ballena extends Animal implements Acuatico{
    public Ballena(String nombre){
        super(nombre);
    }

    @Override
    public void nadar(){
        System.out.println("Estoy nadando en Puerto Madryn");
    }

    @Override
    protected void describir(){
        System.out.println("Soy una Ballena");
    }
}
