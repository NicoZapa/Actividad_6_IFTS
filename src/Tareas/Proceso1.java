package Tareas;

public class Proceso1 extends Procesador implements Tarea{
    protected String cadenaCaracteres;

    public Proceso1(String nombreTarea, String cadenaCaracteres){
        super(nombreTarea);
        this.cadenaCaracteres = cadenaCaracteres;
    }

    @Override
    public void ejecutar(){
        System.out.println(cadenaCaracteres);
    }

    @Override
    public String getNombre(){
        return super.nombreTarea;
    }


}
