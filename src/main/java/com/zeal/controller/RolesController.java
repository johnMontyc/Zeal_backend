package com.zeal.controller;

import java.sql.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
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

@RestController
@RequestMapping("/api/v1/rol")
public class RolesController {

    @Autowired
    private RolesService rolService;

    @GetMapping
    public List<RolesModel> getAllRoles() {
        return rolService.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<RolesModel> getRolById(@PathVariable(value = "id") Integer id) {
        return rolService.findById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public RolesModel createRol(@RequestBody RolesModel rol) {
        rol.setCreado_rol(new Date(System.currentTimeMillis())); // Establece la fecha de creación
        rol.setModificado_rol(new Date(System.currentTimeMillis())); // Establece la fecha de modificación
        return rolService.save(rol);
    }

    @PutMapping("/{id}")
    public ResponseEntity<RolesModel> updateRol(@PathVariable(value = "id") Integer id, @RequestBody RolesModel rolDetails) {
        return rolService.findById(id)
                .map(existingRol -> {
                    existingRol.setModificado_rol(new Date(System.currentTimeMillis())); // Actualiza la fecha de modificación
                    RolesModel updatedRol = rolService.save(existingRol);
                    return ResponseEntity.ok(updatedRol);
                })
                .orElse(ResponseEntity.notFound().build());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Object> deleteRol(@PathVariable(value = "id") Integer id) {
        return rolService.findById(id)
                .map(_ -> {
                    rolService.deleteById(id);;
                    return ResponseEntity.noContent().build();
                })
                .orElse(ResponseEntity.notFound().build());
    }
}