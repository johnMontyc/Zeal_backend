package com.zeal.controller;

import com.zeal.model.*;
import com.zeal.service.*;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@RequestMapping("/api/v1/tipo_usuario")
public class TipoUsuarioController {
    @Autowired
    private TipoUsuarioService tipoUserService;

    //Metodos del CRUD
    @PostMapping
    public TipoUsuarioModel creatTipoUsuario(@RequestBody TipoUsuarioModel tipoUsuario) {
        return tipoUserService.saveTipoUser(tipoUsuario);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Object> deleteTipoUsuario(@PathVariable Integer id) {
        tipoUserService.deleteTipoUser(id);
        return ResponseEntity.noContent().build();
    } 
    
    @GetMapping
    public ResponseEntity<Object> getAllTipoUsuario() {
        return ResponseEntity.ok(tipoUserService.listAll());
    }

}
