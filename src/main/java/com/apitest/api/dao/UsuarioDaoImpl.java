package com.apitest.api.dao;

import com.apitest.api.models.Usuario;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import java.util.List;

@Repository
@Transactional
public class UsuarioDaoImpl implements UsuarioDao {

    @PersistenceContext
    EntityManager entityManager;

    @Override
    @Transactional
    public List<Usuario> getUsuarios() {
        String query = "FROM Usuario";
        return entityManager.createQuery(query).getResultList();
    }

    @Override
    @Transactional
    public Usuario getUsuario(Long id) {
        return entityManager.find(Usuario.class, id);
    }

    @Override
    public void registrar(Usuario usuario) {
        entityManager.merge(usuario);
    }

}
