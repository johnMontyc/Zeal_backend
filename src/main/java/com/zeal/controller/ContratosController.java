package com.zeal.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.zeal.model.ContratosModel;
import com.zeal.service.ContratosService;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.DeleteMapping;

@RestController
@RequestMapping("/api/v1/contratos")
public class ContratosController {

    @Autowired
    private ContratosService contratoService;

    @PostMapping
    public ContratosModel save(@RequestBody ContratosModel contratosModel) {
        return contratoService.save(contratosModel);
    }
        
    @GetMapping
    public List<ContratosModel> findAll() {
        return contratoService.findAll();
    }

    @GetMapping("/{id}")
    public Optional<ContratosModel> findById(@PathVariable Integer id) {
        return contratoService.findById(id);
    }

    @PutMapping("/{id}")
    public ResponseEntity<ContratosModel> update(@PathVariable Integer id, @RequestBody ContratosModel contratosModel) {
        return contratoService.findById(id)
                .map(existingContrato -> {
                    existingContrato.setEstado(contratosModel.getEstado());
                    existingContrato.setCreado(contratosModel.getCreado());
                    existingContrato.setCompletado(contratosModel.getCompletado());
                    ContratosModel updatedContrato = contratoService.save(existingContrato);
                    return ResponseEntity.ok(updatedContrato);
                })
                .orElse(ResponseEntity.notFound().build());


            }
            @DeleteMapping("/{id}")
            public ResponseEntity<String> delete(@PathVariable Integer id) {
                if (contratoService.findById(id).isPresent()) {
                    contratoService.deleteById(id);
                    return ResponseEntity.ok("Contrato eliminado con éxito.");
                } else {
                    return ResponseEntity.notFound().build();
                }
            }

        }
 
    
    
    
        
        
    
    



    
    
    
 
