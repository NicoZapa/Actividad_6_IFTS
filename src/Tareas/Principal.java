package Tareas;

public class Principal {
    public static void main(String[] args){

        String cadenaChar = "Soy una cadena de caracteres";
        Proceso1 tarea1 = new Proceso1("printString", cadenaChar);
        tarea1.ejecutar();

        int[] numeros = {1, 2, 3, 4, 5};
        Proceso2 tarea2 = new Proceso2("Matematico", numeros);
        tarea2.ejecutar();

        Proceso3 tarea3 = new Proceso3("Modif_Global");
        tarea3.ejecutar();

    }
}
