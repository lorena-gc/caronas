package com.logcy.caronas.controller;

import com.logcy.caronas.model.Usuario;
import com.logcy.caronas.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/user")
public class UsuarioController {

    @Autowired
    UsuarioService usuarioService;

    @RequestMapping(value = "/{cpf}", method = RequestMethod.GET)
    public Usuario consultaUsuario(@PathVariable("cpf") String id){
        return usuarioService.consultaUsuario(id);
    }

    @RequestMapping(value = "/inserir", method = RequestMethod.POST)
    public String inserirUsuario(@RequestBody Usuario cadastro){
        return usuarioService.inserirUsuario(cadastro);
    }
}
