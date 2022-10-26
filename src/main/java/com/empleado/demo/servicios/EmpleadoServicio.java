package com.empleado.demo.servicios;

import java.util.List;
import java.util.Optional;

import com.empleado.demo.interfaceServicios.IEmpleadoServicio;
import com.empleado.demo.interfaces.IEmpleado;
import com.empleado.demo.modelo.Empleado;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmpleadoServicio implements IEmpleadoServicio {

    @Autowired
    private IEmpleado data;

    @Override
    public List<Empleado> listarEmpleados() {
        return (List<Empleado>) data.findAll();
    }

    @Override
    public Optional<Empleado> editar(int id) {
        return data.findById(id);
    }

    @Override
    public int guardar(Empleado empleado) {
        int res = 0;
        Empleado empleado2 = data.save(empleado);

        if (!empleado2.equals(null)) {
            res = 1;
        }
        return res;
    }

    @Override
    public void eliminar(int id) {
        data.deleteById(id);
    }
    
}