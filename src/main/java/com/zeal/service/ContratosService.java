package com.zeal.service;

import com.zeal.model.ContratosModel;
import com.zeal.repository.ContratosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

/**
 * Servicio que gestiona las operaciones relacionadas con la entidad {@link ContratosModel}.
 * Ofrece métodos para obtener, guardar, actualizar y eliminar contratos.
 * Utiliza {@link ContratosRepository} para interactuar con la base de datos.
 * 
 * @author John Montoya
 * @author Juan Gil
 * @author Issa Cooper
 * @author Luis Martinez
 */
@Service
public class ContratosService {

    @Autowired
    private ContratosRepository contratoRepository;

    /**
     * Obtiene todos los contratos registrados.
     * 
     * @return Lista de todos los contratos.
     */
    public List<ContratosModel> findAll() {
        return contratoRepository.findAll();
    }

    /**
     * Busca un contrato por su ID.
     * 
     * @param id ID del contrato.
     * @return Contrato encontrado dentro de un Optional.
     */
    public Optional<ContratosModel> findById(Integer id) {
        return contratoRepository.findById(id);
    }

    /**
     * Guarda un nuevo contrato en la base de datos.
     * 
     * @param contrato Objeto de contrato a guardar.
     * @return Contrato guardado.
     */
    public ContratosModel save(ContratosModel contrato) {
        return contratoRepository.save(contrato);
    }

    /**
     * Elimina un contrato por su ID.
     * 
     * @param id ID del contrato a eliminar.
     */
    public void deleteById(Integer id) {
        contratoRepository.deleteById(id);
    }

    /**
     * Elimina un contrato específico.
     * 
     * @param contrato Objeto de contrato a eliminar.
     */
    public void delete(ContratosModel contrato) {
        contratoRepository.delete(contrato);
    }

    /**
     * Actualiza un contrato existente.
     * 
     * @param id ID del contrato a actualizar.
     * @param contrato Objeto de contrato con los nuevos datos.
     * @return Contrato actualizado o null si no se encontró.
     */
    public ContratosModel update(Integer id, ContratosModel contrato){
        ContratosModel contratoExistente = contratoRepository.findById(id).orElse(null);
        
        if (contratoExistente != null){
            contrato.setCreado(contratoExistente.getCreado());
            contrato.setId(id);
            return contratoRepository.save(contrato);
        }
        return null;
    }
}