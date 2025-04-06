package com.zeal.service;

import com.zeal.model.TipoDocumentosModel;
import com.zeal.repository.TipoDocumentosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

/**
 * Servicio que gestiona las operaciones relacionadas con la entidad {@link TipoDocumentosModel}.
 * Ofrece métodos para obtener, guardar, actualizar y eliminar tipos de documentos.
 * Utiliza {@link TipoDocumentosRepository} para interactuar con la base de datos.
 * 
 * @author John Montoya
 * @author Juan Gil
 * @author Issa Cooper
 * @author Luis Martinez
 */
@Service
public class TipoDocumentosService {

    @Autowired
    private TipoDocumentosRepository tipoDocumentosRepository;

    /**
     * Obtiene todos los tipos de documentos registrados.
     * 
     * @return Lista de todos los tipos de documentos.
     */
    public List<TipoDocumentosModel> findAll() {
        return tipoDocumentosRepository.findAll();
    }

    /**
     * Busca un tipo de documento por su ID.
     * 
     * @param id ID del tipo de documento.
     * @return Tipo de documento encontrado o null si no existe.
     */
    public TipoDocumentosModel findById(Integer id) {
        return tipoDocumentosRepository.findById(id).orElse(null);
    }

    /**
     * Guarda un nuevo tipo de documento en la base de datos.
     * 
     * @param tipoDocumentosModel Objeto de tipo de documento a guardar.
     * @return Tipo de documento guardado.
     */
    public TipoDocumentosModel save(TipoDocumentosModel tipoDocumentosModel) {
        return tipoDocumentosRepository.save(tipoDocumentosModel);
    }

    /**
     * Actualiza un tipo de documento existente.
     * 
     * @param id ID del tipo de documento a actualizar.
     * @param tipoDocumentosModel Objeto con los nuevos datos.
     * @return Tipo de documento actualizado o null si no se encontró.
     */
    public TipoDocumentosModel update(Integer id, TipoDocumentosModel tipoDocumentosModel) {
        if (tipoDocumentosRepository.existsById(id)) {
            tipoDocumentosModel.setId(id);
            return tipoDocumentosRepository.save(tipoDocumentosModel);
        } else {
            return null;
        }
    }

    /**
     * Elimina un tipo de documento por su ID.
     * 
     * @param id ID del tipo de documento a eliminar.
     */
    public void deleteById(Integer id) {
        tipoDocumentosRepository.deleteById(id);
    }

}
