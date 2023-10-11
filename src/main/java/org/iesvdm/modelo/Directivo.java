package org.iesvdm.modelo;

public class Directivo extends Empleado
{
    //Atr
    private int codDespaccho;

    //Cons
    public Directivo(String nombre, String apellido, String dni, String direccion, int telefono, int codDespaccho)
    {
        super(nombre, apellido, dni, direccion, telefono);
        this.codDespaccho = codDespaccho;
    }

    //Met

    public int getCodDespaccho() {
        return codDespaccho;
    }

    public void setCodDespaccho(int codDespaccho) {
        this.codDespaccho = codDespaccho;
    }

    @Override
    public String toString() {
        return super.toString() +
                ", codDespaccho=" + codDespaccho;
    }
}
