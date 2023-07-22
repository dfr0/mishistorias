package com.bolsadeidead.springboot.app.springbootwebcurso2023.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/params")
public class EjemploParamsController {

    @GetMapping("/")
    public String index(){
        return "params/index";
    }


        @GetMapping("/string")
    public String param(@RequestParam(required=false,defaultValue = "algun valor") String texto, Model model) { //todos los paramtros se llaman por nombre
            model.addAttribute("resultado","El texto enviado es: " + texto);
            return "params/ver"; //sirve para pasar parametros en la url
        }
}
