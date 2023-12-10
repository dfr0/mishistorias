package com.bolsadeidead.springboot.app.springbootwebcurso2023.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/variables")
public class EjemploVariablesRutaController {
    @GetMapping("/string/{texto}") //texto es la parte dinamica
    //pathvariable es mas limpio que httpservlet
    public String variables(@PathVariable String texto, Model model) { //normalmente primitivos //anotacion con parte variable //si es diferente en getMapping podemos meter un name (name="name")
        model.addAttribute("titulo","Recibir parametro de la ruta (@PathVariable)");
        model.addAttribute("resultado","El texto enviado en la ruta es: " + texto); //%20 en la ruta es equivalente a espacio en blanco
        return "variables/ver";
    }
}
