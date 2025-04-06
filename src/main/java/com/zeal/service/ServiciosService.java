package com.zeal.service;

import com.zeal.model.ServiciosModel;
import com.zeal.repository.ServiciosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Servicio que gestiona las operaciones relacionadas con la entidad {@link ServiciosModel}.
 * Ofrece métodos para obtener, guardar, actualizar y eliminar servicios.
 * Utiliza {@link ServiciosRepository} para interactuar con la base de datos.
 * 
 * @author John Montoya
 * @author Juan Gil
 * @author Issa Cooper
 * @author Luis Martinez
 */
@Service
public class ServiciosService {

    @Autowired
    private ServiciosRepository serviciosRepository;

    /**
     * Obtiene todos los servicios registrados.
     * 
     * @return Lista de todos los servicios.
     */
    public List<ServiciosModel> findAll() {
        return serviciosRepository.findAll();
    }

    /**
     * Busca un servicio por su ID.
     * 
     * @param id ID del servicio.
     * @return Servicio encontrado o null si no existe.
     */
    public ServiciosModel findById(Integer id) {
        return serviciosRepository.findById(id).orElse(null);
    }

    /**
     * Guarda un nuevo servicio en la base de datos.
     * Si el servicio ya existe (tiene ID), actualiza el registro existente.
     * 
     * @param servicio Objeto de servicio a guardar o actualizar.
     * @return Servicio guardado o actualizado.
     */
    public ServiciosModel save(ServiciosModel servicio) {
        return serviciosRepository.save(servicio);
    }

    /**
     * Elimina un servicio por su ID.
     * 
     * @param id ID del servicio a eliminar.
     */
    public void deleteById(Integer id) {
        serviciosRepository.deleteById(id);
    }

    /**
     * Actualiza un servicio existente conservando la fecha de creación original.
     * 
     * @param id ID del servicio a actualizar.
     * @param servicio Objeto de servicio con los nuevos datos.
     * @return Servicio actualizado o null si no se encontró.
     */
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