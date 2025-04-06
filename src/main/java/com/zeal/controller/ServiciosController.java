package com.zeal.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.zeal.model.ServiciosModel;
import com.zeal.service.ServiciosService;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.PathVariable;




@RestController
@RequestMapping("/api/v1/servicios")

public class ServiciosController {

    @Autowired
    private ServiciosService servicioService;

    @GetMapping
    public List<ServiciosModel> obtenerServicios() {
        return servicioService.findAll();
    }

    @PostMapping
    public ServiciosModel createServicio(@RequestBody ServiciosModel servicioModel) {
        return servicioService.save(servicioModel);
    }

    @GetMapping("/{id}")
    public ServiciosModel obtenerServicio(@PathVariable Integer id) {
        return servicioService.findById(id);
    }

    @PutMapping("/{id}")
    public ServiciosModel update(@PathVariable Integer id, @RequestBody ServiciosModel serviciosModel){
        return servicioService.update(id, serviciosModel);
    }

    @DeleteMapping("/{id}")
    public void deleteServicio(@PathVariable Integer id) {
        servicioService.deleteById(id);
    

    }
}