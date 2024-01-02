package com.marquezalfonso_pruebatec1;

import com.marquezalfonso_pruebatec1.modelos.Controladora;
import com.marquezalfonso_pruebatec1.modelos.Empleado;
import java.io.Console;
import java.time.LocalDate;
import java.util.Scanner;

/**
 *
 * @author Alfonso
 */
public class Main {

    public static void main(String[] args) {

        Controladora control = new Controladora();
       
        int opc = 0;
        Scanner sc = new Scanner(System.in);

        while (opc != 6) {

            dibujarMenu();
            opc = sc.nextInt();
            switch (opc) {
                case 1: control.crearEmpleado();
                    break;
                case 2: control.eliminarEmpleado();
                    break;
                case 3: control.modificarEmpleado();
                    break;
                case 4: control.listarEmpleados();
                    break;
                case 5: control.listarEmpleadosCargo();
                    break;
                case 6:
                    System.out.println("Cerrando ...");
                    break;
                default:
                    System.out.println("Opción no valida, por favor ingrese una opcion valida\n\n");
            
            }

        }
    }

    public static void dibujarMenu() {
        System.out.println("***************************************");
        System.out.println("*        GESTION DE EMPLEADOS         *");
        System.out.println("***************************************");
        System.out.println("*    1.- Insertar empleado            *");
        System.out.println("*    2.- Eliminar empleado            *");
        System.out.println("*    3.- Modificar empleado           *");
        System.out.println("*    4.- Listar empleados             *");
        System.out.println("*    5.- Listar empleados por cargo   *");
        System.out.println("*    6.- Salir                        *");
        System.out.println("***************************************");

    }
}
