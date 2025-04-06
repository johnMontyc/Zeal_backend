package com.zeal.service;

import com.zeal.model.TipoUsuariosModel;
import com.zeal.repository.TipoUsuariosRepository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TipoUsuariosService {
    @Autowired 
    private TipoUsuariosRepository tipoUsuarioRepo;

    // Métodos del CRUD
    public TipoUsuariosModel saveTipoUser(TipoUsuariosModel tipoUsuario){
        return tipoUsuarioRepo.save(tipoUsuario);
    }

    // Método para ver todos los tipos de usuario
    public List<TipoUsuariosModel> listAll(){
        return tipoUsuarioRepo.findAll();
    }

    public void deleteTipoUser(Integer id){
        tipoUsuarioRepo.deleteById(id);
    }

    public TipoUsuariosModel findById(Integer id){
        return tipoUsuarioRepo.findById(id).orElse(null);
    }

    public TipoUsuariosModel update(Integer id, TipoUsuariosModel tipoUsuario) {
        if (tipoUsuarioRepo.existsById(id)) {
            tipoUsuario.setId(id);
            return tipoUsuarioRepo.save(tipoUsuario);
        } else {
            return null;
        }
    }
}
