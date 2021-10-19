package Vehiculos;

abstract public class Vehiculo {

    private String marca;
    private String modelo;

    //--METODOS
    public static boolean esVolador(Vehiculo vehi){
        if(vehi instanceof Volador){
            return true;
        }else{
            return false;
        }
    }

    public static void hacerVolar(Vehiculo vehi){
        if(esVolador(vehi)){
            System.out.println("Estamos volando porque " + vehi.getClass());
        }else{
            System.out.println("Este vehiculo no vuela porque es un " + vehi.getClass());
        }
    }
}
