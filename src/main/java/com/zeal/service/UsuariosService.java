package com.zeal.service;

import com.zeal.model.UsuariosModel;
import com.zeal.repository.UsuariosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class UsuariosService {

    @Autowired
    private UsuariosRepository usuariosRepository;

    public List<UsuariosModel> findAll() {
        return usuariosRepository.findAll();
    }

    public UsuariosModel findById(Integer id) {
        return usuariosRepository.findById(id).orElse(null);
    }

    public UsuariosModel save(UsuariosModel usuariosModel) {
        return usuariosRepository.save(usuariosModel);
    }

    public void deleteById(Integer id) {
        usuariosRepository.deleteById(id);
    }

    public UsuariosModel update(Integer id, UsuariosModel usuariosModel) {
        if (usuariosRepository.existsById(id)) {
            usuariosModel.setId(id);
            return usuariosRepository.save(usuariosModel);
        } else {
            return null;
        }
    }

}
