package Tareas;

public class Proceso3 extends Procesador implements Tarea{

    protected Proceso3(String nombreTarea){
        super(nombreTarea);
    }

    @Override
    public void ejecutar() {
        System.out.println(super.variableGlobal = "Modificamos la variable global");
    }

    @Override
    public String getNombre() {
        return super.nombreTarea;
    }
}
