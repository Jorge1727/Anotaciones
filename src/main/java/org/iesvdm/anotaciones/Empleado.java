package org.iesvdm.anotaciones;

import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@Repeatable(Empleados.class)

public @interface Empleado
{
    String nombre();

    String apellido();

    String dni();

    String direccion();

    int telefono();
    String tipo();

    int codDespacho() default 0;

    int codTaller() default 0;

    String perfil() default "void";

    String categoria() default "void";

}
