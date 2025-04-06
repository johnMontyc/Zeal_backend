package com.zeal.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.zeal.model.ServiciosModel;
import com.zeal.service.ServiciosService;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * Controlador REST para gestionar operaciones CRUD sobre la entidad {@link ServiciosModel}.
 * Expone endpoints para consultar, crear, actualizar y eliminar servicios.
 * 
 * Ruta base: /api/v1/servicios
 * 
 * @author John Montoya
 * @author Juan Gil
 * @author Issa Cooper
 * @author Luis Martinez
 */
@RestController
@RequestMapping("/api/v1/servicios")
public class ServiciosController {

    @Autowired
    private ServiciosService servicioService;

    /**
     * Obtiene todos los servicios registrados.
     * 
     * @return Lista de todos los servicios disponibles.
     */
    @GetMapping
    public List<ServiciosModel> obtenerServicios() {
        return servicioService.findAll();
    }

    /**
     * Crea un nuevo servicio.
     * 
     * @param servicioModel Datos del servicio a crear.
     * @return El servicio recién creado.
     */
    @PostMapping
    public ServiciosModel createServicio(@RequestBody ServiciosModel servicioModel) {
        return servicioService.save(servicioModel);
    }

    /**
     * Obtiene un servicio específico por su ID.
     * 
     * @param id ID del servicio a buscar.
     * @return El servicio correspondiente al ID proporcionado.
     */
    @GetMapping("/{id}")
    public ServiciosModel obtenerServicio(@PathVariable Integer id) {
        return servicioService.findById(id);
    }

    /**
     * Actualiza un servicio existente.
     * 
     * @param id ID del servicio a actualizar.
     * @param serviciosModel Datos actualizados del servicio.
     * @return El servicio actualizado.
     */
    @PutMapping("/{id}")
    public ServiciosModel update(@PathVariable Integer id, @RequestBody ServiciosModel serviciosModel) {
        return servicioService.update(id, serviciosModel);
    }

    /**
     * Elimina un servicio por su ID.
     * 
     * @param id ID del servicio a eliminar.
     */
    @DeleteMapping("/{id}")
    public void deleteServicio(@PathVariable Integer id) {
        servicioService.deleteById(id);
    }
}