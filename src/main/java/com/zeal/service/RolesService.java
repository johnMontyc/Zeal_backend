package com.zeal.service;

import com.zeal.model.RolesModel;
import com.zeal.repository.RolesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Timestamp;
import java.util.List;

@Service
public class RolesService {

    @Autowired
    private RolesRepository rolRepository;

    public List<RolesModel> findAll() {
        return rolRepository.findAll();
    }

    public RolesModel findById(Integer id) {
        return rolRepository.findById(id).orElse(null);
    }

    public RolesModel save(RolesModel rol) {
        return rolRepository.save(rol);
    }

    public void deleteById(Integer id) {
        rolRepository.deleteById(id);
    }

    public RolesModel update(Integer id, RolesModel rol){
        RolesModel rolExistente = rolRepository.findById(id).orElse(null);
        
        if (rolExistente != null){

            rol.setCreado(rolExistente.getCreado());
            rol.setModificado(new Timestamp(System.currentTimeMillis()));
            rol.setId(id);
            return rolRepository.save(rol);
        }
        return null;
    }
}
