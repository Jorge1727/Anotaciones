package org.iesvdm.modelo;

public class Tecnico extends Operario
{
    //Atr
    private String perfil;

    //Cons

    public Tecnico(String nombre, String apellido, String dni, String direccion, int telefono, int codTaller, String perfil)
    {
        super(nombre, apellido, dni, direccion, telefono, codTaller);
        this.perfil = perfil;
    }

    //Met

    public String getPerfil() {
        return perfil;
    }

    public void setPerfil(String perfil) {
        this.perfil = perfil;
    }

    @Override
    public String toString() {
        return super.toString() +", perfil='" + perfil + '\'';
    }
}
