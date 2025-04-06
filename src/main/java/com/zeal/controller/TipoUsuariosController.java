package com.zeal.controller;

import com.zeal.model.*;
import com.zeal.service.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import java.util.List;

/**
 * Controlador REST para gestionar operaciones CRUD sobre la entidad {@link TipoUsuariosModel}.
 * Expone endpoints para consultar, crear, actualizar y eliminar tipos de usuarios.
 * 
 * Ruta base: /api/v1/tipo_usuarios
 * 
 * @author John Montoya
 * @author Juan Gil
 * @author Issa Cooper
 * @author Luis Martinez
 */
@RestController
@RequestMapping("/api/v1/tipo_usuarios")
public class TipoUsuariosController {
    @Autowired
    private TipoUsuariosService tipoUserService;

    /**
     * Crea un nuevo tipo de usuario.
     * 
     * @param tipoUsuario Datos del tipo de usuario a crear.
     * @return El tipo de usuario recién creado.
     */
    @PostMapping
    public TipoUsuariosModel creatTipoUsuario(@RequestBody TipoUsuariosModel tipoUsuario) {
        return tipoUserService.saveTipoUser(tipoUsuario);
    }

    /**
     * Elimina un tipo de usuario por su ID.
     * 
     * @param id ID del tipo de usuario a eliminar.
     */
    @DeleteMapping("/{id}")
    public void deleteTipoUsuario(@PathVariable Integer id) {
        tipoUserService.deleteTipoUser(id);
    }
    
    /**
     * Obtiene todos los tipos de usuarios registrados.
     * 
     * @return Lista de todos los tipos de usuarios disponibles.
     */
    @GetMapping
    public List<TipoUsuariosModel> getAllTipoUsuarios() {
        return tipoUserService.listAll();
    }
    
    /**
     * Actualiza un tipo de usuario existente.
     * 
     * @param id ID del tipo de usuario a actualizar.
     * @param tipoUsuario Datos actualizados del tipo de usuario.
     * @return El tipo de usuario actualizado.
     */
    @PutMapping("/{id}")
    public TipoUsuariosModel updateTipoUsuario(@PathVariable Integer id, @RequestBody TipoUsuariosModel tipoUsuario) {
        return tipoUserService.update(id, tipoUsuario);
    }

    /**
     * Obtiene un tipo de usuario específico por su ID.
     * 
     * @param id ID del tipo de usuario a buscar.
     * @return El tipo de usuario correspondiente al ID proporcionado.
     */
    @GetMapping("/{id}")
    public TipoUsuariosModel getTipoUsuarioById(@PathVariable Integer id) {
        return tipoUserService.findById(id);
    }
}