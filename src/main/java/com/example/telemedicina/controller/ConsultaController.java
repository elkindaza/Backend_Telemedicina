package com.example.telemedicina.controller;

import com.example.telemedicina.dao.ConsultaDao;
import com.example.telemedicina.domain.Consulta;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ConsultaController {

    @Autowired
    private ConsultaDao consultaDao;

    @GetMapping("/consulta")
    public String consultas(Model model){
        var consulta= consultaDao.findAll();
        model.addAttribute("consulta",consulta);
        return "consulta";
    }
}
