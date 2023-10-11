package org.iesvdm;

import org.iesvdm.modelo.Empleado;
import org.iesvdm.modelo.Empresa;

public class Main
{
    public static void main(String[] args)
    {
        Empresa empresa = new Empresa();

        empresa.cargadorDeContexto();

        for (Empleado empleado : empresa.getEmpleadoSet())
        {
            System.out.println(empleado);
        }

        System.out.println("Directivos: " + empresa.getDirectivoSet().size());
        System.out.println("Operarios: " + empresa.getOperarioSet().size());
        System.out.println("Tecnicos: " + empresa.getTecnicoSet().size());
        System.out.println("Oficial: " + empresa.getOficialSet().size());

    }
}