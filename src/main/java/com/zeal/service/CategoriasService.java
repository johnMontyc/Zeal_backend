package com.zeal.service;

import com.zeal.model.CategoriasModel;
import com.zeal.repository.CategoriasRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

/**
 * Servicio que gestiona las operaciones relacionadas con la entidad {@link CategoriasModel}.
 * Ofrece métodos para obtener, guardar, actualizar y eliminar categorías.
 * Utiliza {@link CategoriasRepository} para interactuar con la base de datos.
 * 
 * @author John Montoya
 * @author Juan Gil
 * @author Issa Cooper
 * @author Luis Martinez
 */
@Service
public class CategoriasService {

    @Autowired
    private CategoriasRepository categoriasRepository;

    /**
     * Obtiene todas las categorías registradas.
     * 
     * @return Lista de todas las categorías.
     */
    public List<CategoriasModel> findAll() {
        return categoriasRepository.findAll();
    }

    /**
     * Busca una categoría por su ID.
     * 
     * @param id ID de la categoría.
     * @return Categoría encontrada o null si no existe.
     */
    public CategoriasModel findById(Integer id) {
        return categoriasRepository.findById(id).orElse(null);
    }

    /**
     * Guarda una nueva categoría en la base de datos.
     * 
     * @param categoriasModel Objeto de categoría a guardar.
     * @return Categoría guardada.
     */
    public CategoriasModel save(CategoriasModel categoriasModel) {
        return categoriasRepository.save(categoriasModel);
    }

    /**
     * Elimina una categoría por su ID.
     * 
     * @param id ID de la categoría a eliminar.
     */
    public void deleteById(Integer id) {
        categoriasRepository.deleteById(id);
    }

    /**
     * Actualiza una categoría existente.
     * 
     * @param id ID de la categoría a actualizar.
     * @param categoriasModel Objeto de categoría con los nuevos datos.
     * @return Categoría actualizada o null si no se encontró.
     */
    public CategoriasModel update(Integer id, CategoriasModel categoriasModel) {
        if (categoriasRepository.existsById(id)) {
            categoriasModel.setId(id);
            return categoriasRepository.save(categoriasModel);
        } else {
            return null;
        }
    }

}


