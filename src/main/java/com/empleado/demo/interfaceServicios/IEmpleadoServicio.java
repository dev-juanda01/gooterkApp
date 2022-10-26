package com.empleado.demo.interfaceServicios;

import java.util.List;
import java.util.Optional;

import com.empleado.demo.modelo.Empleado; 

public interface IEmpleadoServicio {

    public List<Empleado> listarEmpleados();

    public Optional<Empleado> editar(int id);

    public int guardar(Empleado empleado);

    public void eliminar(int id);
}
