package com.zeal.service;

import com.zeal.model.CategoriasModel;
import com.zeal.repository.CategoriasRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class CategoriasService {

    @Autowired
    private CategoriasRepository categoriasRepository;

    public List<CategoriasModel> findAll() {
        return categoriasRepository.findAll();
    }

    public CategoriasModel findById(Integer id) {
        return categoriasRepository.findById(id).orElse(null);
    }

    public CategoriasModel save(CategoriasModel categoriasModel) {
        return categoriasRepository.save(categoriasModel);
    }

    public void deleteById(Integer id) {
        categoriasRepository.deleteById(id);
    }
}
