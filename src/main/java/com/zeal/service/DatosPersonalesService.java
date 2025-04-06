package com.zeal.service;

import com.zeal.model.DatosPersonalesModel;
import com.zeal.repository.DatosPersonalesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

/**
 * Servicio que gestiona las operaciones relacionadas con la entidad {@link DatosPersonalesModel}.
 * Ofrece métodos para obtener, guardar, actualizar y eliminar registros de datos personales.
 * Utiliza {@link DatosPersonalesRepository} para interactuar con la base de datos.
 * 
 * @author John Montoya
 * @author Juan Gil
 * @author Issa Cooper
 * @author Luis Martinez
 */
@Service
public class DatosPersonalesService {

    @Autowired
    private DatosPersonalesRepository datosPersonalesRepository;

    /**
     * Obtiene todos los registros de datos personales.
     * 
     * @return Lista de todos los registros de {@link DatosPersonalesModel}.
     */
    public List<DatosPersonalesModel> findAll() {
        return datosPersonalesRepository.findAll();
    }

    /**
     * Busca un registro de datos personales por su ID.
     * 
     * @param id ID del registro a buscar.
     * @return Registro encontrado o null si no existe.
     */
    public DatosPersonalesModel findById(Integer id) {
        return datosPersonalesRepository.findById(id).orElse(null);
    }

    /**
     * Guarda un nuevo registro de datos personales.
     * 
     * @param datosPersonalesModel Objeto a guardar.
     * @return Registro guardado.
     */
    public DatosPersonalesModel save(DatosPersonalesModel datosPersonalesModel) {
        return datosPersonalesRepository.save(datosPersonalesModel);
    }

    /**
     * Elimina un registro de datos personales por su ID.
     * 
     * @param id ID del registro a eliminar.
     */
    public void deleteById(Integer id) {
        datosPersonalesRepository.deleteById(id);
    }

    /**
     * Actualiza un registro de datos personales existente.
     * 
     * @param id ID del registro a actualizar.
     * @param datosPersonalesModel Objeto con los nuevos datos.
     * @return Registro actualizado o null si no existe.
     */
    public DatosPersonalesModel update(Integer id, DatosPersonalesModel datosPersonalesModel) {
        if (datosPersonalesRepository.existsById(id)) {
            datosPersonalesModel.setId(id);
            return datosPersonalesRepository.save(datosPersonalesModel);
        } else {
            return null;
        }
    }
}



