package com.zeal.service;

import com.zeal.model.DatosPersonalesModel;
import com.zeal.repository.DatosPersonalesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class DatosPersonalesService {

    @Autowired
    private DatosPersonalesRepository datosPersonalesRepository;

    public List<DatosPersonalesModel> findAll() {
        return datosPersonalesRepository.findAll();
    }

    public DatosPersonalesModel findById(Integer id) {
        return datosPersonalesRepository.findById(id).orElse(null);
    }

    public DatosPersonalesModel save(DatosPersonalesModel datosPersonalesModel) {
        return datosPersonalesRepository.save(datosPersonalesModel);
    }

    public void deleteById(Integer id) {
        datosPersonalesRepository.deleteById(id);
    }

    public DatosPersonalesModel update(Integer id, DatosPersonalesModel datosPersonalesModel) {
        if (datosPersonalesRepository.existsById(id)) {
            datosPersonalesModel.setId(id);
            return datosPersonalesRepository.save(datosPersonalesModel);
        } else {
            return null;
        }
    }
}
