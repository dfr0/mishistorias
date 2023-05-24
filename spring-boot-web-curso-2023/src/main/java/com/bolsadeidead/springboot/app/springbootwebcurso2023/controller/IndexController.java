package com.bolsadeidead.springboot.app.springbootwebcurso2023.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;

@Controller //componente de spring tipo controlador
@RequestMapping("/app") //ruta de primer nivel, metodos handler rutas de segundo nivel.
public class IndexController {

    //para mapear
    //por defecto GET podemos usar GetMapping también etc..o Post
    //el value= se puede omitir
    @RequestMapping({"/index","/","/home"}) //como tenemos / poner al final del primer nivel /app con otro "" vacio
    //metodo
    public String index(Model model) {
        model.addAttribute("titulo,Hola spring framework");
        return "index"; //se mete la pagina en src estaticos

    }

    /*podemos usar el map de utils para lo mismo, también puede usarse modelandview
    @GetMapping("/index2")
    public String index2(Map<String, Object> map) {
        map.put("titulo,Hola spring framework con MAP");
        return "index"; //se mete la pagina en src estaticos
*/
}
