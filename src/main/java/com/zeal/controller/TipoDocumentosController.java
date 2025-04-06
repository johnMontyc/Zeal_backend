package com.zeal.controller;

import com.zeal.model.TipoDocumentosModel;
import com.zeal.service.TipoDocumentosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/tipo_documentos")
public class TipoDocumentosController {
    
    @Autowired
    private TipoDocumentosService tipoDocumentosService;

    @GetMapping
    public List<TipoDocumentosModel> findAll() {
        return tipoDocumentosService.findAll();
    }

    @GetMapping("/{id}")
    public TipoDocumentosModel findById(@PathVariable Integer id) {
        return tipoDocumentosService.findById(id);
    }

    @PostMapping
    public TipoDocumentosModel save(@RequestBody TipoDocumentosModel tipoDocumentosModel) {
        return tipoDocumentosService.save(tipoDocumentosModel);
    }
    
    @PutMapping("/{id}")
    public TipoDocumentosModel update(@PathVariable Integer id, @RequestBody TipoDocumentosModel tipoDocumentosModel) {
        return tipoDocumentosService.update(id, tipoDocumentosModel);
    }
  
    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable Integer id) {
        tipoDocumentosService.deleteById(id);
    }

}
