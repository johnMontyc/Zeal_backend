package com.zeal.service;

import com.zeal.model.TipoUsuarioModel;
import com.zeal.repository.TipoUsuarioRepository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TipoUsuarioService {
    @Autowired 
    private TipoUsuarioRepository tipoUsuarioRepo;

    // Métodos del CRUD
    public TipoUsuarioModel saveTipoUser(TipoUsuarioModel tipoUsuario){
        return tipoUsuarioRepo.save(tipoUsuario);
    }

    // Método para ver todos los tipos de usuario
    public List<TipoUsuarioModel> listAll(){
        return tipoUsuarioRepo.findAll();
    }

    public void deleteTipoUser(Integer id){
        tipoUsuarioRepo.deleteById(id);
    }
}
