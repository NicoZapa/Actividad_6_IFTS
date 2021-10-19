package Animales;

public class Tigre extends Animal{

    public Tigre(String nombre){
        super(nombre);
    }

    @Override
    protected void describir(){
        System.out.println("Soy un Tigre");
    }
}
