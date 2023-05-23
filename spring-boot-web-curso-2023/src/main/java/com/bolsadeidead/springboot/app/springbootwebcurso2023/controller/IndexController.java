package com.bolsadeidead.springboot.app.springbootwebcurso2023.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller //componente de spring tipo controlador
public class IndexController {

    //para mapear
    //por defecto GET podemos usar GetMapping también etc..o Post
    //el value= se puede omitir
    @RequestMapping({"/index","/","/home"})

    //metodo
    public String index(Model model) {
        model.addAttribute("titulo,Hola spring framework");
        return "index"; //se mete la pagina en src estaticos

    }
}
