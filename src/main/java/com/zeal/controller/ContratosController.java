package com.zeal.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.zeal.model.ContratosModel;
import com.zeal.service.ContratosService;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
@RequestMapping("/api/v1/contrato")
public class ContratosController {

    @Autowired
    private ContratosService contratoService;

    @PostMapping
    public ResponseEntity<ContratosModel> createContrato(@RequestBody ContratosModel contratoModel) {
        return ResponseEntity.ok(contratoService.save(contratoModel));
    }
    
    @GetMapping
    public ResponseEntity<List<ContratosModel>> obtenerContratos() {
        return ResponseEntity.ok(contratoService.findAll());
    }
}
