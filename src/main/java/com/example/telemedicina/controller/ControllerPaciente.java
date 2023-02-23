package com.example.telemedicina.controller;


import com.example.telemedicina.dao.PacienteDao;
import com.example.telemedicina.domain.Paciente;
import com.example.telemedicina.servicio.PacienteService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@org.springframework.stereotype.Controller

public class ControllerPaciente {


    @Autowired
    private PacienteService pacienteService;

    @GetMapping("/paciente")
    public String verpacientes(Model model) {
        var paciente= pacienteService.listarPacientes();
        model.addAttribute("paciente",paciente);
        return "index2";
    }

    @GetMapping("/agregar")
    public String agregar(Paciente paciente) {
        return "modificar";
    }
    @PostMapping("/guardar")
    public String guardar( @Valid Paciente paciente, Errors errores){

        if (errores.hasErrors()){
            return "modificar";
        }
        pacienteService.guardar(paciente);
        return "redirect:/paciente";
    }

    @GetMapping("/editar/{id_paciente}")
    public String editar(Paciente paciente, Model model) {
        paciente = pacienteService.encontrarPaciente(paciente);
        model.addAttribute("paciente",paciente);
        return "modificar";
    }

    @GetMapping("/eliminar/{id_paciente}")
    public String eliminar(Paciente paciente){
        pacienteService.eliminar(paciente);
        return "redirect:/paciente";
    }
}
