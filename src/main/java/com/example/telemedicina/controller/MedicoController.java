package com.example.telemedicina.controller;

import com.example.telemedicina.dao.MedicoDao;
import com.example.telemedicina.dao.PacienteDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MedicoController {
    @Autowired
    private MedicoDao medicoDao;

    @GetMapping("/medico")
    public String vermedicos(Model model) {

        var medico = medicoDao.findAll();
        model.addAttribute("medico", medico);
        return "index2";
    }
}

