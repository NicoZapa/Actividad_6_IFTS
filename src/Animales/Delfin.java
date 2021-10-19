package Animales;

public class Delfin extends Animal implements Acuatico{

    public Delfin(String nombre){
        super(nombre);
    }

    @Override
    public void nadar(){
        System.out.println("Me sumerjo en la pileta y salto muy alto ");
    }

    @Override
    protected void describir(){
        System.out.println("Soy un Delfin");
    }

}
