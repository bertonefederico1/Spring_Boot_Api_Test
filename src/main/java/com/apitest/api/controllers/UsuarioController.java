package com.apitest.api.controllers;

import com.apitest.api.dao.UsuarioDao;
import com.apitest.api.models.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class UsuarioController {

    @Autowired
    private UsuarioDao usuarioDAO;

    @RequestMapping(value = "usuarios", method = RequestMethod.GET)
    public List<Usuario> getUsuarios() {
        return usuarioDAO.getUsuarios();
    }

    @RequestMapping(value = "usuario/{id}", method = RequestMethod.GET)
    public Usuario getUsuario(@PathVariable Long id) {
        return usuarioDAO.getUsuario(id);
    }

    @RequestMapping(value = "registrar", method = RequestMethod.POST)
    public String registrarUsuario(@RequestBody Usuario usuario) {
        usuarioDAO.registrar(usuario);
        return "Registrado correctamente";
    }


}
