package com.zeal.controller;

import java.util.List;

import com.zeal.model.MensajesModel;
import com.zeal.repository.MensajesRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
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
    private MensajesRepository mensajeRepository;

    @GetMapping
    public List<MensajesModel> findAll(){
        return mensajeRepository.findAll();
    }
    

    @GetMapping("/{id}")
    public ResponseEntity<MensajesModel> getMensajeById(@PathVariable(value = "id") Integer id) {
        MensajesModel mensaje = mensajeRepository.findById(id).orElse(null);
        if (mensaje == null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(mensaje);
    }

    @PostMapping
    public MensajesModel createMensaje(@RequestBody MensajesModel mensaje) {
        return mensajeRepository.save(mensaje);
    }

    @PutMapping("/{id}")
    public ResponseEntity<MensajesModel> updateMensaje(@PathVariable(value = "id") Integer id,
            @RequestBody MensajesModel mensajeDetails) {
        MensajesModel mensaje = mensajeRepository.findById(id).orElse(null);
        if (mensaje == null) {
            return ResponseEntity.notFound().build();
        }
        mensaje.setMensaje(mensajeDetails.getMensaje());
        mensaje.setLeido(mensajeDetails.getLeido());
        mensaje.setEnviado(mensajeDetails.getEnviado());
        final MensajesModel updatedMensaje = mensajeRepository.save(mensaje);
        return ResponseEntity.ok(updatedMensaje);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteMensaje(@PathVariable(value = "id") Integer id) {
        MensajesModel mensaje = mensajeRepository.findById(id).orElse(null);
        if (mensaje == null) {
            return ResponseEntity.notFound().build();
        }
        mensajeRepository.delete(mensaje);
        return ResponseEntity.noContent().build();
    }
}