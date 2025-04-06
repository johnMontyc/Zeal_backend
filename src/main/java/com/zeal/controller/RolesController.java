package com.zeal.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.zeal.model.RolesModel;
import com.zeal.service.RolesService;

/**
 * Controlador REST para gestionar operaciones CRUD sobre la entidad {@link RolesModel}.
 * Expone endpoints para consultar, crear, actualizar y eliminar roles.
 * 
 * Ruta base: /api/v1/rol
 * 
 * @author John Montoya
 * @author Juan Gil
 * @author Issa Cooper
 * @author Luis Martinez
 */
@RestController
@RequestMapping("/api/v1/rol")
public class RolesController {

    @Autowired
    private RolesService rolService;

    /**
     * Obtiene todos los roles registrados.
     * 
     * @return Lista de todos los roles.
     */
    @GetMapping
    public List<RolesModel> getAllRoles() {
        return rolService.findAll();
    }

    /**
     * Obtiene un rol específico por su ID.
     * 
     * @param id ID del rol a buscar.
     * @return Rol correspondiente al ID especificado.
     */
    @GetMapping("/{id}")
    public RolesModel getRolById(@PathVariable Integer id) {
        return rolService.findById(id);
    }

    /**
     * Crea un nuevo rol.
     * 
     * @param rol Datos del rol a crear.
     * @return Rol creado.
     */
    @PostMapping
    public RolesModel createRol(@RequestBody RolesModel rol) {
        return rolService.save(rol);
    }

    /**
     * Actualiza un rol existente.
     * 
     * @param id ID del rol a actualizar.
     * @param rol Datos actualizados del rol.
     * @return Rol actualizado.
     */
    @PutMapping("/{id}")
    public RolesModel update(@PathVariable Integer id, @RequestBody RolesModel rol) {
        return rolService.update(id, rol);
    }

    /**
     * Elimina un rol por su ID.
     * 
     * @param id ID del rol a eliminar.
     */
    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable Integer id) {
        rolService.deleteById(id);
    }
}