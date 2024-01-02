
package com.marquezalfonso_pruebatec1.modelos;

import com.marquezalfonso_pruebatec1.persistencia.ControladoraPersistencia;

/**
 *
 * @author Alfonso
 */
public class Controladora {
    
    ControladoraPersistencia controlPersis = new ControladoraPersistencia();

    public void crearEmpleado(Empleado empleado) {
        controlPersis.crearEmpleado(empleado);
    }
    
}
