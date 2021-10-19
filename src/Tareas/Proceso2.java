package Tareas;

public class Proceso2 extends Procesador implements Tarea{

    int[] listaNum = new int[2];

    protected Proceso2 (String nombreTarea, int[] listaNum){
        super(nombreTarea);
        this.listaNum = listaNum;
    }

    @Override
    public void ejecutar() {
        for(int num : this.listaNum){
            System.out.print(num*2 + " ");
        }
        System.out.println();
        for(int num : this.listaNum){
            System.out.print(num+10 + " ");
        }
        System.out.println();
    }

    @Override
    public String getNombre() {
        return super.nombreTarea;
    }
}
