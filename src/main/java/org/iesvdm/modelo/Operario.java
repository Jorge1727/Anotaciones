package org.iesvdm.modelo;

public class Operario extends Empleado
{
    //Atr
    private int codTaller;

    //Const
    public Operario(String nombre, String apellido, String dni, String direccion, int telefono, int codTaller)
    {
        super(nombre, apellido, dni, direccion, telefono);
        this.codTaller = codTaller;
    }

    //Met

    public int getCodTaller() {
        return codTaller;
    }

    public void setCodTaller(int codTaller) {
        this.codTaller = codTaller;
    }

    @Override
    public String toString() {
        return super.toString() +
                ", codTaller=" + codTaller;
    }
}
