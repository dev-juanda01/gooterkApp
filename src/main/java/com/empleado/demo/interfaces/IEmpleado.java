package com.empleado.demo.interfaces;

import com.empleado.demo.modelo.Empleado;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IEmpleado extends CrudRepository<Empleado, Integer> {
    
}
