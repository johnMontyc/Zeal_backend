package com.zeal.controller;

import com.zeal.model.UsuariosModel;
import com.zeal.service.UsuariosService;
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
 * Controlador REST para gestionar operaciones CRUD sobre la entidad {@link UsuariosModel}.
 * Expone endpoints para consultar, crear, actualizar y eliminar usuarios.
 *
 * Ruta base: /api/v1/usuarios
 * 
 * @author John Montoya
 * @author Juan Gil
 * @author Issa Cooper
 * @author Luis Martinez
 */
@RestController
@RequestMapping("/api/v1/usuarios")
public class UsuariosController {

    @Autowired
    private UsuariosService usuariosService;

    /**
     * Obtiene todos los usuarios registrados.
     *
     * @return Lista de usuarios.
     */
    @GetMapping
    public List<UsuariosModel> findAll() {
        return usuariosService.findAll();
    }

    /**
     * Obtiene un usuario por su ID.
     *
     * @param id ID del usuario.
     * @return Usuario correspondiente al ID.
     */
    @GetMapping("/{id}")
    public UsuariosModel findById(@PathVariable Integer id) {
        return usuariosService.findById(id);
    }

    /**
     * Crea un nuevo usuario.
     *
     * @param usuariosModel Datos del usuario a crear.
     * @return Usuario creado.
     */
    @PostMapping
    public UsuariosModel save(@RequestBody UsuariosModel usuariosModel) {
        return usuariosService.save(usuariosModel);
    }

    /**
     * Actualiza un usuario existente.
     *
     * @param id ID del usuario a actualizar.
     * @param usuariosModel Datos nuevos del usuario.
     * @return Usuario actualizado.
     */
    @PutMapping("/{id}")
    public UsuariosModel update(@PathVariable Integer id, @RequestBody UsuariosModel usuariosModel) {
        return usuariosService.update(id, usuariosModel);
    }

    /**
     * Elimina un usuario por su ID.
     *
     * @param id ID del usuario a eliminar.
     */
    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable Integer id) {
        usuariosService.deleteById(id);
    }
}

