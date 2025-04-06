package com.zeal.service;

import com.zeal.model.MensajesModel;
import com.zeal.repository.MensajesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MensajesService {

    @Autowired
    private MensajesRepository mensajeRepository;

    public List<MensajesModel> findAll() {
        return mensajeRepository.findAll();
    }

    public MensajesModel findById(Integer id) {
        return mensajeRepository.findById(id).orElse(null);
    }

    public MensajesModel save(MensajesModel mensaje) {
        return mensajeRepository.save(mensaje);
    }

    public void deleteById(Integer id) {
        mensajeRepository.deleteById(id);
    }

    public MensajesModel update(Integer id, MensajesModel mensaje){
        MensajesModel mensajeExistente = mensajeRepository.findById(id).orElse(null);
        
        if (mensajeExistente != null){

            mensaje.setEnviado(mensajeExistente.getEnviado());
            mensaje.setId(id);
            return mensajeRepository.save(mensaje);
        }
        return null;
    }
}
