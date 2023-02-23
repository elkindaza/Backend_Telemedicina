package com.example.telemedicina.controller;

import com.example.telemedicina.dao.RecetaMedicaDao;
import com.example.telemedicina.domain.RecetaMedica;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class RecetaMedicaController {

    @Autowired
    private RecetaMedicaDao recetaMedicaDao;

    @GetMapping("/receta_medica")
    public String receta_medica(Model model){
        var receta_medica= recetaMedicaDao.findAll();
        model.addAttribute("receta_medica",receta_medica);
        return "receta_medica";
    }
}
