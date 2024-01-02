package com.marquezalfonso_pruebatec1.persistencia;

import com.marquezalfonso_pruebatec1.modelos.Empleado;
import com.marquezalfonso_pruebatec1.persistencia.exceptions.NonexistentEntityException;
import java.util.List;

/**
 *
 * @author Alfonso
 */
public class ControladoraPersistencia {

    EmpleadoJpaController empJpa = new EmpleadoJpaController();

    // Crea empleado
    public void crearEmpleado(Empleado empleado) {

        empJpa.create(empleado);

    }

    // Lista todos los empleados
    public List<Empleado> listarEmpleados() {
        return empJpa.findEmpleadoEntities();

    }
    
    // Lista todos los empleados con el cargo pasado por parámetro
    public List<Empleado> listarEmpleadosCargo(String cargo){
        
        return empJpa.findEmpleadosCargo(cargo);
    }
    
    
    // Elimina el empleado cuya id se proporciona
    public void eliminarEmpleado(int id) throws NonexistentEntityException
    {
        empJpa.destroy(id);
    }
    
    public Empleado buscarEmpleado(int id)
    {
       return empJpa.findEmpleado(id);
    }
    
    public void modificarEmpleado(Empleado emp) throws Exception
    {
        empJpa.edit(emp);
    }

}
