package org.iesvdm.modelo;

import org.iesvdm.anotaciones.Empleado;
import org.iesvdm.anotaciones.Empleados;

import java.lang.annotation.Annotation;
import java.util.HashSet;
import java.util.Set;

@Empleado(
        nombre = "Jorge",
        apellido = "Empleado",
        dni = "3334445w",
        direccion = "calle adiosadios",
        telefono = 555444333,
        tipo = "empleado"
)
@Empleado(
        nombre = "Ana",
        apellido = "Empleada",
        dni = "1234567x",
        direccion = "calle holahola",
        telefono = 123456789,
        tipo = "empleado"
)
@Empleado(
        nombre = "David",
        apellido = "Directivo",
        dni = "1234567xxxxxx",
        direccion = "calle holahxola",
        telefono = 123456789,
        tipo = "directivo",
        codDespacho = 85231
)
@Empleado(
        nombre = "Juan",
        apellido = "Oper",
        dni = "1234567xxxxxx",
        direccion = "calle holahxola",
        telefono = 123456789,
        tipo = "operario",
        codTaller = 77777
)
@Empleado(
        nombre = "Pepe",
        apellido = "Operar",
        dni = "1234567xxxxxx",
        direccion = "calle holahxola",
        telefono = 123456789,
        tipo = "operario",
        codTaller = 11111
)
@Empleado(
        nombre = "Roberto",
        apellido = "Tecnico",
        dni = "1234567xxxxxx",
        direccion = "calle holahxola",
        telefono = 123456789,
        tipo = "tecnico",
        codTaller = 77777,
        perfil = "mecanico"
)
@Empleado(
        nombre = "Lucas",
        apellido = "oficial",
        dni = "1234567xxxxxx",
        direccion = "calle holahxola",
        telefono = 123456789,
        tipo = "oficial",
        codTaller = 77777,
        categoria = "primero"
)
@Empleado(
        nombre = "Lucas",
        apellido = "oficial",
        dni = "1234567xxxxxx",
        direccion = "calle holahxola",
        telefono = 123456789,
        tipo = "oficial",
        codTaller = 66666,
        categoria = "segundo"
)
public class Empresa
{
    private static Set<org.iesvdm.modelo.Empleado> empleadoSet;
    private static Set<org.iesvdm.modelo.Directivo> directivoSet;
    private static Set<org.iesvdm.modelo.Operario> operarioSet;
    private static Set<org.iesvdm.modelo.Oficial> oficialSet;
    private static Set<org.iesvdm.modelo.Tecnico> tecnicoSet;

    public Empresa()
    {
        empleadoSet = new HashSet<>();
        directivoSet = new HashSet<>();
        operarioSet = new HashSet<>();
        oficialSet = new HashSet<>();
        tecnicoSet = new HashSet<>();
    }

    public Set<org.iesvdm.modelo.Empleado> getEmpleadoSet() {
        return empleadoSet;
    }

    public void setEmpleadoSet(HashSet<org.iesvdm.modelo.Empleado> empleadoSet) {
        this.empleadoSet = empleadoSet;
    }

    public static Set<Directivo> getDirectivoSet() {
        return directivoSet;
    }

    public static void setDirectivoSet(Set<Directivo> directivoSet) {
        Empresa.directivoSet = directivoSet;
    }

    public static Set<Operario> getOperarioSet() {
        return operarioSet;
    }

    public static void setOperarioSet(Set<Operario> operarioSet) {
        Empresa.operarioSet = operarioSet;
    }

    public static Set<Oficial> getOficialSet() {
        return oficialSet;
    }

    public static void setOficialSet(Set<Oficial> oficialSet) {
        Empresa.oficialSet = oficialSet;
    }

    public static Set<Tecnico> getTecnicoSet() {
        return tecnicoSet;
    }

    public static void setTecnicoSet(Set<Tecnico> tecnicoSet) {
        Empresa.tecnicoSet = tecnicoSet;
    }

    public static void cargadorDeContexto()
    {
        Empleados anotaciones = Empresa.class.getAnnotation(Empleados.class);

        for (Empleado anotacion : anotaciones.value())
        {
            String nombre = anotacion.nombre();
            String apellido = anotacion.apellido();
            String dni = anotacion.dni();
            String direccion = anotacion.direccion();
            int telefono = anotacion.telefono();
            String tipo = anotacion.tipo();
            int codDespacho = anotacion.codDespacho();
            int codTaller = anotacion.codTaller();
            String perfil = anotacion.perfil();
            String categoria = anotacion.categoria();

            switch(tipo)
            {
                case "empleado":
                    empleadoSet.add(new org.iesvdm.modelo.Empleado(nombre, apellido, dni, direccion, telefono));
                    break;

                case "directivo":
                    empleadoSet.add(new org.iesvdm.modelo.Directivo(nombre, apellido, dni, direccion, telefono, codDespacho));
                    directivoSet.add(new org.iesvdm.modelo.Directivo(nombre, apellido, dni, direccion, telefono, codDespacho));
                    break;

                case "operario":
                    empleadoSet.add(new org.iesvdm.modelo.Operario(nombre, apellido, dni, direccion, telefono, codTaller));
                    operarioSet.add(new org.iesvdm.modelo.Operario(nombre, apellido, dni, direccion, telefono, codTaller));
                    break;

                case "tecnico":
                    empleadoSet.add(new org.iesvdm.modelo.Tecnico(nombre, apellido, dni, direccion, telefono, codTaller, perfil));
                    tecnicoSet.add(new org.iesvdm.modelo.Tecnico(nombre, apellido, dni, direccion, telefono, codTaller, perfil));
                    break;

                case "oficial":
                    empleadoSet.add(new org.iesvdm.modelo.Oficial(nombre, apellido, dni, direccion, telefono, codTaller, categoria));
                    oficialSet.add(new org.iesvdm.modelo.Oficial(nombre, apellido, dni, direccion, telefono, codTaller, categoria));
                    break;

                default:
                    System.out.println("tipo incorrecto.");
                    break;
            }



        }
    }
}

