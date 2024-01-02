package com.marquezalfonso_pruebatec1.modelos;

import com.marquezalfonso_pruebatec1.persistencia.ControladoraPersistencia;
import java.time.LocalDate;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Alfonso
 */
public class Controladora {

    ControladoraPersistencia controlPersis = new ControladoraPersistencia();

    public void crearEmpleado() {

        Scanner sc = new Scanner(System.in);

        System.out.println("***************************************");
        System.out.println("*        GESTION DE EMPLEADOS         *");
        System.out.println("***************************************");
        System.out.println("* Insertar Empleado                   *");
        System.out.println("* Nombre:                             *");
        String empNombre = sc.nextLine();
        while (comprobarString(empNombre) == false) {
            System.out.println("Por favor, introduzca un nombre:    ");
            empNombre = sc.nextLine();
        }
        empNombre = empNombre.trim();
        System.out.println("Apellido:                           ");
        String empApellido = sc.nextLine();
        while (comprobarString(empApellido) == false) {
            System.out.println("Por favor, introduzca un apellido:  ");
            empApellido = sc.nextLine();
        }
        empApellido = empApellido.trim();
        System.out.println("Cargo:                              ");
        String empCargo = sc.nextLine();
        while (comprobarString(empCargo) == false) {
            System.out.println("Por favor, introduzca un cargo:    ");
            empCargo = sc.nextLine();
        }
        empCargo = empCargo.trim();
        System.out.println("Salario:                            ");
        double empSalario = sc.nextDouble();
        while (comprobarSalario(empSalario) == false) {
            System.out.println("Por favor, introduzca un salario positivo");
            empSalario = sc.nextDouble();
        }
        System.out.println("Fecha de inicio: ");
        LocalDate empFecha = null;
        System.out.println("Año (YYYY): ");
        int año = sc.nextInt();
        while (comprobarAño(año)) {
            System.out.println("Por favor, introduzca un año válido: ");
            año = sc.nextInt();
        }
        System.out.println("Mes (MM): ");
        int mes = sc.nextInt();
        while (comprobarMes(mes)) {
            System.out.println("Por favor, introduzca un mes válido: ");
            mes = sc.nextInt();
        }
        System.out.println("Dia (DD): ");
        int dia = sc.nextInt();
        while (comprobarDia(dia, mes, año) == false) {
            System.out.println("Por favor, introduzca un dia valido");
            dia = sc.nextInt();
        }

        controlPersis.crearEmpleado(new Empleado(empNombre, empNombre, empNombre, empSalario, LocalDate.of(año, mes, dia)));
        sc.close();
    }

    public void listarEmpleados() {

        List<Empleado> listaEmpleados = controlPersis.listarEmpleados();

        System.out.println("***************************************");
        System.out.println("*        GESTION DE EMPLEADOS         *");
        System.out.println("***************************************");
        System.out.println("* Listado de empleados:               *");
        if (listaEmpleados.isEmpty()) {
            System.out.println("No hay empleados en el sistema");
        }
        for (Empleado emp : listaEmpleados) {
            System.out.println(emp.toString());
            System.out.println("---------------------------------------");
        }

    }

    // Este método devuelve TRUE si la cadena no es nula y tiene contenido y devolverá
    // false si la cadena es nula o está vacía
    private Boolean comprobarString(String string) {
        return (string != null && !string.isEmpty());
    }

    // Este método devuelve true si el salario es un número positivo y false si es negativo
    private Boolean comprobarSalario(double salario) {
        return salario > 0;
    }

    // Dando por supuesto que la empresa empezó a funcionar en 2010, no tiene sentido que la fecha de inicio
    // sea de un año anterior a este o posterior al año actual
    private Boolean comprobarAño(int año) {

        return !(2010 <= año && año <= LocalDate.now().getYear());
    }

    // Comprobamos que el mes está entre 1 y 12
    private Boolean comprobarMes(int mes) {
        return !(mes >= 1 && mes <= 12);
    }

    // Comprobamos que el dia esté entre 1 y 31 y que se corresponda con el numero de dias del mes
    private Boolean comprobarDia(int dia, int mes, int año) {

        if (dia < 1 || dia > 31) {
            return false;
        }

        LocalDate fecha = LocalDate.of(año, mes, dia);
        return fecha.getDayOfMonth() == dia;
    }

}
