package com.zeal.service;

import com.zeal.model.ServiciosModel;
import com.zeal.repository.ServiciosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ServiciosService {

    @Autowired
    private ServiciosRepository serviciosRepository;

    // Obtener todos los registros
    public List<ServiciosModel> findAll() {
        return serviciosRepository.findAll();
    }

    // Buscar un registro por ID
    public Optional<ServiciosModel> findById(Integer id) {
        return serviciosRepository.findById(id);
    }

    // Guardar o actualizar un registro
    public ServiciosModel save(ServiciosModel servicio) {
        return serviciosRepository.save(servicio);
    }

    // Eliminar un registro por ID
    public void deleteById(Integer id) {
        serviciosRepository.deleteById(id);
    }
}
