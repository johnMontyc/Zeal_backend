package com.zeal.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.zeal.model.ContratosModel;
import com.zeal.service.ContratosService;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.DeleteMapping;

/**
 * Controlador REST para gestionar operaciones CRUD sobre la entidad {@link ContratosModel}.
 * Expone endpoints para consultar, crear, actualizar y eliminar contratos.
 * 
 * Ruta base: /api/v1/contratos
 * 
 * @author John Montoya
 * @author Juan Gil
 * @author Issa Cooper
 * @author Luis Martinez
 */
@RestController
@RequestMapping("/api/v1/contratos")
public class ContratosController {

    @Autowired
    private ContratosService contratoService;

    /**
     * Crea un nuevo contrato.
     * 
     * @param contratosModel Datos del contrato a crear.
     * @return Contrato creado.
     */
    @PostMapping
    public ContratosModel save(@RequestBody ContratosModel contratosModel) {
        return contratoService.save(contratosModel);
    }
        
    /**
     * Obtiene todos los contratos registrados.
     * 
     * @return Lista de contratos.
     */
    @GetMapping
    public List<ContratosModel> findAll() {
        return contratoService.findAll();
    }

    /**
     * Obtiene un contrato por su ID.
     * 
     * @param id ID del contrato.
     * @return Contrato correspondiente al ID, envuelto en un Optional.
     */
    @GetMapping("/{id}")
    public Optional<ContratosModel> findById(@PathVariable Integer id) {
        return contratoService.findById(id);
    }

    /**
     * Actualiza un contrato existente.
     * 
     * @param id ID del contrato a actualizar.
     * @param contratosModel Datos nuevos del contrato.
     * @return Contrato actualizado.
     */
    @PutMapping("/{id}")
    public ContratosModel update(@PathVariable Integer id, @RequestBody ContratosModel contratosModel) {
        return contratoService.update(id, contratosModel);
    }

    /**
     * Elimina un contrato por su ID.
     * 
     * @param id ID del contrato a eliminar.
     */
    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable Integer id) {
        contratoService.deleteById(id);
    }
}
    
    
    
        
        
    
    



    
    
    
 
