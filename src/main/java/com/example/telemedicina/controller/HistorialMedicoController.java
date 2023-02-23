package com.example.telemedicina.controller;

import com.example.telemedicina.dao.HistorialMedicoDao;
import com.example.telemedicina.dao.MedicoDao;
import com.example.telemedicina.domain.HistorialMedico;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HistorialMedicoController {
    @Autowired
    private HistorialMedicoDao historialMedicoDao;

    @GetMapping("/historial_medico")
    public String verhistorial(Model model) {

        var historial_medico = historialMedicoDao.findAll();
        model.addAttribute("historial_medico", historial_medico);
        return "index2";

    }
}
