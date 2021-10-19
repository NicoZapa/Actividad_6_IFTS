package Tareas;

abstract public class Procesador{

    protected String nombreTarea;
    protected static String variableGlobal = "Soy una variable global";

    protected Procesador(String nombreTarea) {
        this.nombreTarea = nombreTarea;
    }

    protected void procesarBatch(Tarea[] listaTareas){

    }
}
