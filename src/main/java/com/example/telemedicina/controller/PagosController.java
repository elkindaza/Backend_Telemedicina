package com.example.telemedicina.controller;

import com.example.telemedicina.dao.PagosDao;
import com.example.telemedicina.domain.Pagos;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PagosController {

    @Autowired
    private PagosDao pagosDao;

    @GetMapping("/pagos")
    public String verpagos(Model model){
        var pagos= pagosDao.findAll();
        model.addAttribute("pagos",pagos);
        return "pagos";

    }
}
