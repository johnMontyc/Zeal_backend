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


@RestController
@RequestMapping("/api/v1/tipo_usuarios")
public class TipoUsuariosController {
    @Autowired
    private TipoUsuariosService tipoUserService;

    //Metodos del CRUD
    @PostMapping
    public TipoUsuariosModel creatTipoUsuario(@RequestBody TipoUsuariosModel tipoUsuario) {
        return tipoUserService.saveTipoUser(tipoUsuario);
    }

    @DeleteMapping("/{id}")
    public void deleteTipoUsuario(@PathVariable Integer id) {
        tipoUserService.deleteTipoUser(id);
    }
    
    @GetMapping
    public List<TipoUsuariosModel> getAllTipoUsuarios() {
        return tipoUserService.listAll();
    }
    
    @PutMapping("/{id}")
    public TipoUsuariosModel updateTipoUsuario(@PathVariable Integer id, @RequestBody TipoUsuariosModel tipoUsuario) {
        return tipoUserService.update(id, tipoUsuario);
    }

    @GetMapping("/{id}")
    public TipoUsuariosModel getTipoUsuarioById(@PathVariable Integer id) {
        return tipoUserService.findById(id);
                
    }
}
