package Sorting;

public class Numero implements Ordenable{

    protected int num;

    public Numero(int num){
        this.num = num;
    }

    @Override
    public boolean esMayor(Ordenable o) {
        Numero n = (Numero) o;
        return this.num > n.num;
    }

    public boolean esIgual(Ordenable o){
        Numero n = (Numero) o;
        return this.num == n.num;
    }
}
