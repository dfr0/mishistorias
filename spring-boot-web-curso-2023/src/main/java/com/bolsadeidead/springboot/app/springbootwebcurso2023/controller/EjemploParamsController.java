package com.bolsadeidead.springboot.app.springbootwebcurso2023.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/params")
public class EjemploParamsController {
        @GetMapping("/string")
    public String param(String model) {
            return ("params/ver");
        }
}
