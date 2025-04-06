package com.zeal.controller;

import java.util.List;

import com.zeal.model.MensajesModel;
import com.zeal.service.MensajesService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Controlador REST para gestionar operaciones CRUD sobre la entidad {@link MensajesModel}.
 * Expone endpoints para consultar, crear, actualizar y eliminar mensajes.
 * 
 * Ruta base: /api/v1/mensajes
 * 
 * @author John Montoya
 * @author Juan Gil
 * @author Issa Cooper
 * @author Luis Martinez
 */
@RestController
@RequestMapping("/api/v1/mensajes")
public class MensajesController {

    @Autowired
    private MensajesService mensajesService;

    /**
     * Obtiene todos los mensajes registrados.
     * 
     * @return Lista de mensajes.
     */
    @GetMapping
    public List<MensajesModel> findAll(){
        return mensajesService.findAll();
    }
    
    /**
     * Obtiene un mensaje por su ID.
     * 
     * @param id ID del mensaje a buscar.
     * @return Mensaje correspondiente al ID especificado.
     */
    @GetMapping("/{id}")
    public MensajesModel findById(@PathVariable(value = "id") Integer id) {
        return mensajesService.findById(id);
    }

    /**
     * Crea un nuevo mensaje.
     * 
     * @param mensaje Datos del mensaje a crear.
     * @return Mensaje creado.
     */
    @PostMapping
    public MensajesModel createMensaje(@RequestBody MensajesModel mensaje) {
        return mensajesService.save(mensaje);
    }

    /**
     * Actualiza un mensaje existente.
     * 
     * @param id ID del mensaje a actualizar.
     * @param mensaje Datos actualizados del mensaje.
     * @return Mensaje actualizado.
     */
    @PutMapping("/{id}")
    public MensajesModel update(@PathVariable Integer id, @RequestBody MensajesModel mensaje) {
        return mensajesService.update(id, mensaje);
    }

    /**
     * Elimina un mensaje por su ID.
     * 
     * @param id ID del mensaje a eliminar.
     */
    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable Integer id) {
        mensajesService.deleteById(id);
    }
}