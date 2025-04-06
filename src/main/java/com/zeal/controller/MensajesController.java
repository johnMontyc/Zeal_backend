package com.zeal.controller;

import java.util.List;

import com.zeal.model.MensajesModel;
import com.zeal.service.MensajesService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;




@RestController
@RequestMapping("/api/v1/mensajes")
public class MensajesController {

    @Autowired
    private MensajesService mensajesService;

    @GetMapping
    public List<MensajesModel> findAll(){
        return mensajesService.findAll();
    }
    

    @GetMapping("/{id}")
    public MensajesModel findById(@PathVariable(value = "id") Integer id) {
        return mensajesService.findById(id);
    }

    @PostMapping
    public MensajesModel createMensaje(@RequestBody MensajesModel mensaje) {
        return mensajesService.save(mensaje);
    }

    @PutMapping("/{id}")
    public MensajesModel update(@PathVariable Integer id, @RequestBody MensajesModel mensaje) {
        return mensajesService.update(id, mensaje);
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable Integer id) {
        mensajesService.deleteById(id);
    }
}