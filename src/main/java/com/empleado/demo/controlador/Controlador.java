package com.empleado.demo.controlador;

import com.empleado.demo.interfaceServicios.IEmpleadoServicio;
import com.empleado.demo.modelo.Empleado;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping
public class Controlador {
    
    @Autowired
    private IEmpleadoServicio servicio;

    @GetMapping("/show")
    public String listar(Model model) {
        List<Empleado> empleados = servicio.listarEmpleados();
        model.addAttribute("empleados", empleados);
        return "home";
    } 

    @GetMapping("/new")
    public String agregar(Model model) {
        model.addAttribute("empleado", new Empleado());
        return "form";
    }

    @PostMapping("/save")
    public String guardar(@Validated Empleado empleado, Model model) {
        servicio.guardar(empleado);
        return "redirect:/show";
    }

    @GetMapping("/edit/{id}")
    public String editar(@PathVariable int id, Model model) {
        Optional<Empleado> empleado = servicio.editar(id);
        model.addAttribute("empleado", empleado);
        return "form";
    }

    @GetMapping("/delete/{id}")
    public String eliminar(Model model, @PathVariable int id) {
        servicio.eliminar(id);
        return "redirect:/show";
    }
}
