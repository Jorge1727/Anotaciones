package org.iesvdm;

import org.iesvdm.modelo.Empresa;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class AnotacionesTest
{


    @Test
    public void empleadosDeEmpresa()
    {
        //Creamos la empresa y cargamos sus empleados.
        Empresa empresa = new Empresa();

        empresa.cargadorDeContexto();

        //Si nos vamos a la clase Empresa y vemos las anotaciones de Empleado, podemos comprobar que los siguientes Assertions son correctos.
        Assertions.assertEquals(8, empresa.getEmpleadoSet().size());
        Assertions.assertEquals(1, empresa.getDirectivoSet().size());
        Assertions.assertEquals(2, empresa.getOperarioSet().size());
        Assertions.assertEquals(2, empresa.getOficialSet().size());
        Assertions.assertEquals(1, empresa.getTecnicoSet().size());
    }
}
