package com.bolsadeidead.springboot.app.springbootwebcurso2023.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;

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

    @GetMapping("/mix-params")
    public String param(@RequestParam String saludo, @RequestParam Integer numero, Model model) { //todos los paramtros se llaman por nombre
        model.addAttribute("resultado","el saludo es '" + saludo + "'y el numero es '" + numero + "''");
        return "params/ver"; //sirve para pasar parametros en la url
    }
    //Usando parseInt hay que usar try catch para manejo de errores, por si no se mete un integer en este caso
    @GetMapping("/mix-params-request")
    public String param(HttpServletRequest request, Model model) {
        String saludo = request.getParameter("saludo"); //tipo string por defecto
        Integer numero = null;
        try {
            numero = Integer.parseInt(request.getParameter("numero"));
        } catch (NumberFormatException e) {
            numero = 0;
        }
        model.addAttribute("resultado","el saludo es '" + saludo + "'y el numero es '" + numero + "''");
        return "params/ver"; //sirve para pasar parametros en la url
    }

}
