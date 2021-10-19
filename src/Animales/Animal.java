package Animales;

import Vehiculos.Volador;

abstract public class Animal {
    private String nombre;

    //--CONSTRUCTOR
    public Animal(String nombre){
        this.nombre = nombre;
    }

    //--METODO ABSTRACTO DESCRIBIR
    abstract protected void describir();

    //--GET NOMBRE
    public String getNombre() {
        return nombre;
    }


    //--DAME ACUATICOS
    protected static Acuatico[] dameAcuatico(Animal[] listaAnimales){
        int cantAcua = 0;
        int i = 0;

        for(Animal animal: listaAnimales){
            if(animal instanceof Acuatico){
                cantAcua++;
            }
        }

        Acuatico[] listaAcuaticos = new Acuatico[cantAcua];

        for(Animal animal: listaAnimales){
            if(animal instanceof Acuatico){
                Acuatico animal_acua = (Acuatico) animal;
                listaAcuaticos[i] = animal_acua;
                i++;
            }
        }
        return listaAcuaticos;
    }


    //--SHOW DE ANIMALES
    protected static void showDeAnimales(Animal[] listaAnimales){
        System.out.println();
        for(Animal animal: listaAnimales){
            if(animal instanceof Acuatico){
                ((Acuatico)animal).nadar();
            }else if(animal instanceof Volador){
                ((Volador)animal).volar();
            }else{
                System.out.println(animal.getNombre() + " no hace nada");
            }
        }
    }

}
