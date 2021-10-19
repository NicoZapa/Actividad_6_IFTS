package Animales;

public class Main {

    public static void main(String[] args){
        Tigre tigre = new Tigre("Jose");
        Paloma paloma = new Paloma("Vero");
        Delfin delfin = new Delfin("Flipper");
        Ballena ballena = new Ballena("Moby");

        Animal[] animales = {tigre, paloma, delfin, ballena};
        Acuatico[] acuaticos = Animal.dameAcuatico(animales);

       for(Acuatico acuatico: acuaticos){
           System.out.println("Soy acuatico ya que " + acuatico.getClass());
        }

        Animal.showDeAnimales(animales);

    }

}
