package org.example;

public @interface Empleado
{
    String nombre();
    String apellido();
    String dni();
    String direccion();
    String telefono();
    Directivo directivo();

    int codigoDespacho();

}

@MyCustomAnnotation(
        nombre="Diego.",
        direccion="C/ Portugal, Nº 12"
)
public class MyClase {
...
}

/*int edad() default 18;
    String nombre();
    String dirección();
    String curso() default "2º DAW";*/