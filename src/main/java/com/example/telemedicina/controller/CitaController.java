package com.example.telemedicina.controller;

import com.example.telemedicina.dao.CitaDao;
import com.example.telemedicina.dao.MedicoDao;
import com.example.telemedicina.dao.PacienteDao;
import com.example.telemedicina.domain.Cita;
import com.example.telemedicina.domain.Medico;
import com.example.telemedicina.domain.Paciente;
import com.example.telemedicina.servicio.CitaService;
import com.example.telemedicina.servicio.PacienteService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

    @Controller
    public class CitaController {

        @Autowired
        private CitaService citaService;

        @Autowired
        private MedicoDao medicoDao;
        @Autowired
        private PacienteDao pacienteDao;

        @GetMapping("/cita")
        public String citas(Model model) {
            var cita= citaService.listarCita();
            model.addAttribute("cita", cita);
            return "cita";
        }

        @GetMapping("/agregar/cita")
        public String agregar(Cita cita, Model model) {
            List<Medico> medicos = (List<Medico>) medicoDao.findAll();
            List<Paciente> pacientes = (List<Paciente>) pacienteDao.findAll();
            model.addAttribute("pacientes", pacientes);
            model.addAttribute("medicos", medicos);
            return "citas_modificar";
        }

        @PostMapping("/guardar/cita")
        public String guardar( @Valid Cita cita, Errors errores){

            if (errores.hasErrors()){
                return "citas_modificar";
            }
            citaService.guardar(cita);
            return "redirect:/cita";
        }

        @GetMapping("/editar/{id_cita}")
        public String editar(Cita cita, Model model) {
            cita = citaService.encontrarCita(cita);
            model.addAttribute("cita",cita);
            return "citas_modificar";
        }

        @GetMapping("/eliminar/{id_cita}")
        public String eliminar(Cita cita){
            citaService.eliminar(cita);
            return "redirect:/cita";
        }

    }

