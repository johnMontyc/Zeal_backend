package com.zeal.controller;

import com.zeal.model.ReviewsModel;
import com.zeal.service.ReviewsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Controlador REST para gestionar operaciones CRUD sobre la entidad {@link ReviewsModel}.
 * Expone endpoints para consultar, crear, actualizar y eliminar reseñas.
 *
 * Ruta base: /api/v1/reviews
 * 
 * @author John Montoya
 * @author Juan Gil
 * @author Issa Cooper
 * @author Luis Martinez
 */
@RestController
@RequestMapping("/api/v1/reviews")
public class ReviewsController {

    @Autowired
    private ReviewsService reviewsService;

    /**
     * Obtiene todas las reseñas registradas.
     * 
     * @return Lista de reseñas.
     */
    @GetMapping
    public List<ReviewsModel> findAll() {
        return reviewsService.findAll();
    }

    /**
     * Obtiene una reseña por su ID.
     * 
     * @param id ID de la reseña.
     * @return Reseña correspondiente al ID.
     */
    @GetMapping("/{id}")
    public ReviewsModel findById(@PathVariable Integer id) {
        return reviewsService.findById(id);
    }

    /**
     * Crea una nueva reseña.
     * 
     * @param reviewsModel Datos de la reseña a crear.
     * @return Reseña creada.
     */
    @PostMapping
    public ReviewsModel save(@RequestBody ReviewsModel reviewsModel) {
        return reviewsService.save(reviewsModel);
    }

    /**
     * Actualiza una reseña existente.
     * 
     * @param id ID de la reseña a actualizar.
     * @param reviewsModel Datos nuevos de la reseña.
     * @return Reseña actualizada.
     */
    @PutMapping("/{id}")
    public ReviewsModel update(@PathVariable Integer id, @RequestBody ReviewsModel reviewsModel) {
        return reviewsService.update(id, reviewsModel);
    }

    /**
     * Elimina una reseña por su ID.
     * 
     * @param id ID de la reseña a eliminar.
     */
    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable Integer id) {
        reviewsService.deleteById(id);
    }
}




