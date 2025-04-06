package com.zeal.controller;

import com.zeal.model.CategoriasModel;
import com.zeal.service.CategoriasService;
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
 * Controlador REST para gestionar operaciones CRUD sobre la entidad {@link CategoriasModel}.
 * Expone endpoints para consultar, crear, actualizar y eliminar categorías.
 * 
 * Ruta base: /api/v1/categorias
 * 
 * @author John Montoya
 * @author Juan Gil
 * @author Issa Cooper
 * @author Luis Martinez
 */
@RestController
@RequestMapping("/api/v1/categorias")
public class CategoriasController {

    @Autowired
    private CategoriasService categoriasService;

    /**
     * Obtiene todas las categorías registradas.
     * 
     * @return Lista de categorías.
     */
    @GetMapping
    public List<CategoriasModel> findAll() {
        return categoriasService.findAll();
    }

    /**
     * Obtiene una categoría por su ID.
     * 
     * @param id ID de la categoría.
     * @return Categoría correspondiente al ID.
     */
    @GetMapping("/{id}")
    public CategoriasModel findById(@PathVariable Integer id) {
        return categoriasService.findById(id);
    }

    /**
     * Crea una nueva categoría.
     * 
     * @param categoriasModel Datos de la categoría a crear.
     * @return Categoría creada.
     */
    @PostMapping
    public CategoriasModel save(@RequestBody CategoriasModel categoriasModel) {
        return categoriasService.save(categoriasModel);
    }

    /**
     * Actualiza una categoría existente.
     * 
     * @param id ID de la categoría a actualizar.
     * @param categoriasModel Datos nuevos de la categoría.
     * @return Categoría actualizada.
     */
    @PutMapping("/{id}")
    public CategoriasModel update(@PathVariable Integer id, @RequestBody CategoriasModel categoriasModel) {
        return categoriasService.update(id, categoriasModel);
    }

    /**
     * Elimina una categoría por su ID.
     * 
     * @param id ID de la categoría a eliminar.
     */
    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable Integer id) {
        categoriasService.deleteById(id);
    }

}
