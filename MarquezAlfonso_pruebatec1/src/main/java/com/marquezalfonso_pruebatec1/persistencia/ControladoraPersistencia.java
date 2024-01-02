package com.marquezalfonso_pruebatec1.persistencia;

import com.marquezalfonso_pruebatec1.modelos.Empleado;
import java.util.List;

/**
 *
 * @author Alfonso
 */
public class ControladoraPersistencia {

    EmpleadoJpaController empJpa = new EmpleadoJpaController();

    public void crearEmpleado(Empleado empleado) {

        empJpa.create(empleado);

    }

    public List<Empleado> listarEmpleados() {
        return empJpa.findEmpleadoEntities();

    }
    
    public List<Empleado> listarEmpleadosCargo(String cargo){
        return empJpa.findEmpleadosCargo(cargo);
    }

}
