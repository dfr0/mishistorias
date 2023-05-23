package com.bolsadeidead.springboot.app.springbootwebcurso2023.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller //componente de spring tipo controlador
public class IndexController {

    //para mapear
    @RequestMapping(value="/index") //por defecto GET

    //metodo
    public Static index(){

        return "index"; //se mete en estaticos

    }
}
