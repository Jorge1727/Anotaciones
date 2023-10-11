package org.iesvdm.modelo;

public class Oficial extends Operario
{
    //Atr
    private String categoria;

    //Cons

    public Oficial(String nombre, String apellido, String dni, String direccion, int telefono, int codTaller, String categoria)
    {
        super(nombre, apellido, dni, direccion, telefono, codTaller);
        this.categoria = categoria;
    }

    //Met
    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    @Override
    public String toString() {
        return super.toString() +", categoria='" + categoria + '\'';
    }
}
