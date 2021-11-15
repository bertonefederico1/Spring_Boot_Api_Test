package com.apitest.api.dao;

import com.apitest.api.models.Usuario;

import java.util.List;

public interface UsuarioDao {

    List<Usuario> getUsuarios();


    Usuario getUsuario(Long id);

    void registrar(Usuario usuario);
}
