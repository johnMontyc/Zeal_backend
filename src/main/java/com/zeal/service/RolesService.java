package com.zeal.service;

import com.zeal.model.RolesModel;
import com.zeal.repository.RolesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class RolesService {

    @Autowired
    private RolesRepository rolRepository;

    public List<RolesModel> findAll() {
        return rolRepository.findAll();
    }

    public Optional<RolesModel> findById(Integer id) {
        return rolRepository.findById(id);
    }

    public RolesModel save(RolesModel rol) {
        return rolRepository.save(rol);
    }

    public void deleteById(Integer id) {
        rolRepository.deleteById(id);
    }
}
