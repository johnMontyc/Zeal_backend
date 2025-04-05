package com.zeal.service;

import com.zeal.model.ContratosModel;
import com.zeal.repository.ContratosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ContratosService {

    @Autowired
    private ContratosRepository contratoRepository;

    public List<ContratosModel> findAll() {
        return contratoRepository.findAll();
    }

    public Optional<ContratosModel> findById(Integer id) {
        return contratoRepository.findById(id);
    }

    public ContratosModel save(ContratosModel contrato) {
        return contratoRepository.save(contrato);
    }

    public void deleteById(Integer id) {
        contratoRepository.deleteById(id);
    }

    public void delete(ContratosModel contrato) {
        contratoRepository.delete(contrato);
    }
}