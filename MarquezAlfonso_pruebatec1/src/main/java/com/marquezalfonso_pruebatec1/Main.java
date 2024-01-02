
package com.marquezalfonso_pruebatec1;

import com.marquezalfonso_pruebatec1.modelos.Controladora;
import com.marquezalfonso_pruebatec1.modelos.Empleado;
import java.time.LocalDate;

/**
 *
 * @author Alfonso
 */
public class Main {

    public static void main(String[] args) {
            
        Controladora control = new Controladora();
        
        
        Empleado e1 = new Empleado("Alfonso", "Marquez", "Programador", 1800.0, LocalDate.now());
        
        control.crearEmpleado(e1);
        
    }
}
