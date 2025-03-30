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

    public Optional<MensajesModel> findById(Long id) {
        return mensajeRepository.findById(id);
    }

    public MensajesModel save(MensajesModel mensaje) {
        return mensajeRepository.save(mensaje);
    }

    public void deleteById(Long id) {
        mensajeRepository.deleteById(id);
    }
}
