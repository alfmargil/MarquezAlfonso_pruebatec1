/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.marquezalfonso_pruebatec1.persistencia;

import com.marquezalfonso_pruebatec1.modelos.Empleado;

/**
 *
 * @author Alfonso
 */
public class ControladoraPersistencia {
    
    EmpleadoJpaController empJpa = new EmpleadoJpaController();

    public void crearEmpleado(Empleado empleado) {
        
         empJpa.create(empleado);
        
    }
    
    
}
