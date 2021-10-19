package Sorting;

class Persona implements Ordenable{
    protected int dni;
    protected boolean sexo;

    public Persona(int dni){
        this.dni = dni;
    }

    public int getDni() {
        return dni;
    }

    @Override
    public boolean esMayor(Ordenable o) {
        Persona p = (Persona) o;
        return this.dni > p.dni;
    }
}
