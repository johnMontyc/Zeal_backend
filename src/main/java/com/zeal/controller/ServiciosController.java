package com.zeal.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.zeal.model.ServiciosModel;
import com.zeal.repository.ServiciosRepository;

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
    private ServiciosRepository servicioRepository;

    @GetMapping
    public List<ServiciosModel> obtenerServicios() {
        return servicioRepository.findAll();
    }

    @PostMapping
    public ServiciosModel createServicio(@RequestBody ServiciosModel servicioModel) {
        return servicioRepository.save(servicioModel);
    }

    @GetMapping("/{id}")
    public ServiciosModel obtenerServicio(@PathVariable Integer id) {
        return servicioRepository.findById(id).orElse(null);
    }

    @PutMapping("/{id}")
    public ServiciosModel updateServicio(@PathVariable Integer id, @RequestBody ServiciosModel servicioModel) {
        servicioModel.setId_servicio(id);
        return servicioRepository.save(servicioModel);
    }

    @DeleteMapping("/{id}")
    public void deleteServicio(@PathVariable Integer id) {
        servicioRepository.deleteById(id);
    

    }
}