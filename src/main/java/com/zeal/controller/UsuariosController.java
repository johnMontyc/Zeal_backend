package com.zeal.controller;

import com.zeal.model.UsuariosModel;
import com.zeal.service.UsuariosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
@RequestMapping("/api/v1/usuarios")
public class UsuariosController {

    @Autowired
    private UsuariosService usuariosService;

    @GetMapping("/listausuarios")
    public List<UsuariosModel> findAll() {
        return usuariosService.findAll();
    }

    @GetMapping("/{id}")
    public UsuariosModel findById(@PathVariable Integer id) {
        return usuariosService.findById(id);
    }

    @PostMapping
    public UsuariosModel save(@RequestBody UsuariosModel usuariosModel) {
        return usuariosService.save(usuariosModel);
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable Integer id) {
        usuariosService.deleteById(id);
    }
}
