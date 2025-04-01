package com.zeal.service;

import com.zeal.model.TipoDocumentosModel;
import com.zeal.repository.TipoDocumentosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class TipoDocumentosService {

    @Autowired
    private TipoDocumentosRepository tipoDocumentosRepository;

    public List<TipoDocumentosModel> findAll() {
        return tipoDocumentosRepository.findAll();
    }

    public TipoDocumentosModel findById(Integer id) {
        return tipoDocumentosRepository.findById(id).orElse(null);
    }

    public TipoDocumentosModel save(TipoDocumentosModel tipoDocumentosModel) {
        return tipoDocumentosRepository.save(tipoDocumentosModel);
    }

    public TipoDocumentosModel update(Integer id, TipoDocumentosModel tipoDocumentosModel) {
        if (tipoDocumentosRepository.existsById(id)) {
            tipoDocumentosModel.setId(id);
            return tipoDocumentosRepository.save(tipoDocumentosModel);
        } else {
            return null;
        }
    }

    public void deleteById(Integer id) {
        tipoDocumentosRepository.deleteById(id);
    }

}
