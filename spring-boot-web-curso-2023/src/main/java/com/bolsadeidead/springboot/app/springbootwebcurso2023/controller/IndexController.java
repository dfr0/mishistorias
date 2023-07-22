package com.bolsadeidead.springboot.app.springbootwebcurso2023.controller;

import com.bolsadeidead.springboot.app.springbootwebcurso2023.models.Usuario;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
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
        model.addAttribute("titulo", "Hola spring framework");
        return "index"; //se mete la pagina en src estaticos

    }

    @RequestMapping("/perfil")
    public String perfil(Model model) {
        Usuario usuario = new Usuario();
        usuario.setNombre("David");
        usuario.setApellido("Faro");
        usuario.setEmail("davidfaro@gmail.com");
        model.addAttribute("usuario",usuario);
        model.addAttribute("titule","Perfil del usuario es: ".concat(usuario.getNombre()));
        return "perfil";
    }

    @RequestMapping("/listar")
    public String listar(Model model){
        List<Usuario> usuarios = new ArrayList<>(); //metodo
        //usuarios.add(new Usuario("andres","pollas","andres@joe.mail")); //comented due modelattribute list.
        //usuarios.add(new Usuario("paco","palote","paco@joe.mail")); //comented due modelattribute list.
        //usuarios.add(new Usuario("guille","moñas","guille@joe.mail")); //comented due modelattribute list.
        model.addAttribute("titulo","Listado de usuarios");
        //model.addAttribute("usuarios",usuarios); //comented due modelattribute list.
        return "listar";
    }

    @ModelAttribute("usuarios") //aplicable a todos los metodos del controlador. usado normalmente para pasar datos a la vista y poblar clos SELECT
    public List<Usuario> poblarUsuarios() {
        List<Usuario> usuarios = Arrays.asList(new Usuario("David","guzman","guzman@yahoo.es"),
        new Usuario("juan","guzma","david@jaja.com"),
        new Usuario("manolo","guzman","manolo@jaja.com"),
        new Usuario("pipiolo","guzman","pipiolo@jaja.com"));
        return usuarios;
    }

    /*podemos usar el map de utils para lo mismo, también puede usarse modelandview
    @GetMapping("/index2")
    public String index2(Map<String, Object> map) {
        map.put("titulo,Hola spring framework con MAP");
        return "index"; //se mete la pagina en src estaticos
*/
}
