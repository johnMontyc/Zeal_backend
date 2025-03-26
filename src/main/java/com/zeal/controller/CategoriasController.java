package com.zeal.controller;

import com.zeal.model.CategoriasModel;
import com.zeal.service.CategoriasService;
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
@RequestMapping("/api/v1/categorias")
public class CategoriasController {

    @Autowired
    private CategoriasService categoriasService;

    @GetMapping("/listacategorias")
    public List<CategoriasModel> findAll() {
        return categoriasService.findAll();
    }

    @GetMapping("/{id}")
    public CategoriasModel findById(@PathVariable Integer id) {
        return categoriasService.findById(id);
    }

    @PostMapping
    public CategoriasModel save(@RequestBody CategoriasModel categoriasModel) {
        return categoriasService.save(categoriasModel);
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable Integer id) {
        categoriasService.deleteById(id);
    }

}
