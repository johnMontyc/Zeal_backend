package com.zeal.service;

import com.zeal.model.ReviewsModel;
import com.zeal.repository.ReviewsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

/**
 * Servicio que gestiona las operaciones relacionadas con la entidad {@link ReviewsModel}.
 * Ofrece métodos para obtener, guardar, actualizar y eliminar reseñas.
 * Utiliza {@link ReviewsRepository} para interactuar con la base de datos.
 * 
 * @author John Montoya
 * @author Juan Gil
 * @author Issa Cooper
 * @author Luis Martinez
 */
@Service
public class ReviewsService {

    @Autowired
    private ReviewsRepository reviewsRepository;

    /**
     * Obtiene todas las reseñas registradas.
     * 
     * @return Lista de todas las reseñas.
     */
    public List<ReviewsModel> findAll() {
        return reviewsRepository.findAll();
    }

    /**
     * Busca una reseña por su ID.
     * 
     * @param id ID de la reseña.
     * @return Reseña encontrada o null si no existe.
     */
    public ReviewsModel findById(Integer id) {
        return reviewsRepository.findById(id).orElse(null);
    }

    /**
     * Guarda una nueva reseña en la base de datos.
     * 
     * @param reviewsModel Objeto de reseña a guardar.
     * @return Reseña guardada.
     */
    public ReviewsModel save(ReviewsModel reviewsModel) {
        return reviewsRepository.save(reviewsModel);
    }

    /**
     * Elimina una reseña por su ID.
     * 
     * @param id ID de la reseña a eliminar.
     */
    public void deleteById(Integer id) {
        reviewsRepository.deleteById(id);
    }

    /**
     * Actualiza una reseña existente.
     * 
     * @param id ID de la reseña a actualizar.
     * @param reviewsModel Objeto de reseña con los nuevos datos.
     * @return Reseña actualizada o null si no se encontró.
     */
    public ReviewsModel update(Integer id, ReviewsModel reviewsModel){
        ReviewsModel reviewsModelExistente = reviewsRepository.findById(id).orElse(null);
        
        if (reviewsModelExistente != null){
            reviewsModel.setCreado(reviewsModelExistente.getCreado());
            reviewsModel.setId(id);
            return reviewsRepository.save(reviewsModel);
        }
        return null;
    }

}

