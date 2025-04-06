package com.zeal.service;

import com.zeal.model.ServiciosModel;
import com.zeal.repository.ServiciosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServiciosService {

    @Autowired
    private ServiciosRepository serviciosRepository;

    // Obtener todos los registros
    public List<ServiciosModel> findAll() {
        return serviciosRepository.findAll();
    }

    // Buscar un registro por ID
    public ServiciosModel findById(Integer id) {
        return serviciosRepository.findById(id).orElse(null);
    }

    // Guardar o actualizar un registro
    public ServiciosModel save(ServiciosModel servicio) {
        return serviciosRepository.save(servicio);
    }

    // Eliminar un registro por ID
    public void deleteById(Integer id) {
        serviciosRepository.deleteById(id);
    }

    public ServiciosModel update(Integer id, ServiciosModel servicio) {
        ServiciosModel servicioExistente = serviciosRepository.findById(id).orElse(null);

        if (servicioExistente != null) {
            servicio.setCreado(servicioExistente.getCreado());
            servicio.setId(id);
            return serviciosRepository.save(servicio);
        }
        return null;
    }
}
