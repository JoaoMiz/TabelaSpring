package com.fullstack.Mizael.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
public class TabelaController {

    //COMEÇAR POR AQUI
    @GetMapping("/information")
    public String getInformation() {

            return "";
    }
}
