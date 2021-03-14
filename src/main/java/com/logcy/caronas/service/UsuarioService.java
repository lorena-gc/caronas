package com.logcy.caronas.service;

import com.logcy.caronas.model.Usuario;
import com.logcy.caronas.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsuarioService {

    @Autowired
    UsuarioRepository usuarioRepository;

       public Usuario consultaUsuario (String id){
        return usuarioRepository.findById(id).get();
    }

    public String inserirUsuario(Usuario cadastro) {
        usuarioRepository.save(cadastro);
        return "Usuario salvo com sucesso!";
    }
}
