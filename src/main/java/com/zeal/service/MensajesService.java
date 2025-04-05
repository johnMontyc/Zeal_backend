package com.zeal.service;

import com.zeal.model.MensajesModel;
import com.zeal.repository.MensajesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MensajesService {

    @Autowired
    private MensajesRepository mensajeRepository;

    public List<MensajesModel> findAll() {
        return mensajeRepository.findAll();
    }

    public Optional<MensajesModel> findById(Integer id) {
        return mensajeRepository.findById(id);
    }

    public MensajesModel save(MensajesModel mensaje) {
        return mensajeRepository.save(mensaje);
    }

    public void deleteById(Integer id) {
        mensajeRepository.deleteById(id);
    }

    public MensajesModel update(Integer id, MensajesModel mensaje) {
        if (mensajeRepository.existsById(id)) {
            mensaje.setId(id);
            return mensajeRepository.save(mensaje);
        } else {
            return null;
        }
    }
}
