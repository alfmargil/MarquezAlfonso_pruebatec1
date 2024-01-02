package com.marquezalfonso_pruebatec1.persistencia;

import com.marquezalfonso_pruebatec1.modelos.Empleado;
import com.marquezalfonso_pruebatec1.persistencia.exceptions.NonexistentEntityException;
import java.util.List;

/**
 * Esta clase se encarga de conectar la Controladora con el JPA controller
 * 
 * @author Alfonso
 */
public class ControladoraPersistencia {

    EmpleadoJpaController empJpa = new EmpleadoJpaController();

    // Crea empleado
    public void crearEmpleado(Empleado empleado) {

        empJpa.create(empleado);

    }

    // Devuelve una lista con los empleados
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
    
    // Devuelve el empleado con la id proporcionada
    public Empleado buscarEmpleado(int id)
    {
       return empJpa.findEmpleado(id);
    }
    
    // Modifica el empleado pasado por parámetro
    public void modificarEmpleado(Empleado emp) throws Exception
    {
        empJpa.edit(emp);
    }

}
