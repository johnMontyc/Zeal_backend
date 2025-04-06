package com.zeal.controller;

import com.zeal.model.TipoDocumentosModel;
import com.zeal.service.TipoDocumentosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Controlador REST para gestionar operaciones CRUD sobre la entidad {@link TipoDocumentosModel}.
 * Expone endpoints para consultar, crear, actualizar y eliminar tipos de documentos.
 *
 * Ruta base: /api/v1/tipo_documentos
 * 
 * @author John Montoya
 * @author Juan Gil
 * @author Issa Cooper
 * @author Luis Martinez
 */
@RestController
@RequestMapping("/api/v1/tipo_documentos")
public class TipoDocumentosController {

    @Autowired
    private TipoDocumentosService tipoDocumentosService;

    /**
     * Obtiene todos los tipos de documento registrados.
     * 
     * @return Lista de tipos de documento.
     */
    @GetMapping
    public List<TipoDocumentosModel> findAll() {
        return tipoDocumentosService.findAll();
    }

    /**
     * Obtiene un tipo de documento por su ID.
     * 
     * @param id ID del tipo de documento.
     * @return Tipo de documento correspondiente al ID.
     */
    @GetMapping("/{id}")
    public TipoDocumentosModel findById(@PathVariable Integer id) {
        return tipoDocumentosService.findById(id);
    }

    /**
     * Crea un nuevo tipo de documento.
     * 
     * @param tipoDocumentosModel Datos del tipo de documento a crear.
     * @return Tipo de documento creado.
     */
    @PostMapping
    public TipoDocumentosModel save(@RequestBody TipoDocumentosModel tipoDocumentosModel) {
        return tipoDocumentosService.save(tipoDocumentosModel);
    }

    /**
     * Actualiza un tipo de documento existente.
     * 
     * @param id ID del tipo de documento a actualizar.
     * @param tipoDocumentosModel Datos nuevos del tipo de documento.
     * @return Tipo de documento actualizado.
     */
    @PutMapping("/{id}")
    public TipoDocumentosModel update(@PathVariable Integer id, @RequestBody TipoDocumentosModel tipoDocumentosModel) {
        return tipoDocumentosService.update(id, tipoDocumentosModel);
    }

    /**
     * Elimina un tipo de documento por su ID.
     * 
     * @param id ID del tipo de documento a eliminar.
     */
    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable Integer id) {
        tipoDocumentosService.deleteById(id);
    }

}

