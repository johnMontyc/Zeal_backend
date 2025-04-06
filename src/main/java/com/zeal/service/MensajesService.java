package com.zeal.service;

import com.zeal.model.MensajesModel;
import com.zeal.repository.MensajesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Servicio que gestiona las operaciones relacionadas con la entidad {@link MensajesModel}.
 * Ofrece métodos para obtener, guardar, actualizar y eliminar mensajes.
 * Utiliza {@link MensajesRepository} para interactuar con la base de datos.
 * 
 * @author John Montoya
 * @author Juan Gil
 * @author Issa Cooper
 * @author Luis Martinez
 */
@Service
public class MensajesService {

    @Autowired
    private MensajesRepository mensajeRepository;

    /**
     * Obtiene todos los mensajes registrados.
     * 
     * @return Lista de todos los mensajes.
     */
    public List<MensajesModel> findAll() {
        return mensajeRepository.findAll();
    }

    /**
     * Busca un mensaje por su ID.
     * 
     * @param id ID del mensaje.
     * @return Mensaje encontrado o null si no existe.
     */
    public MensajesModel findById(Integer id) {
        return mensajeRepository.findById(id).orElse(null);
    }

    /**
     * Guarda un nuevo mensaje en la base de datos.
     * 
     * @param mensaje Objeto de mensaje a guardar.
     * @return Mensaje guardado.
     */
    public MensajesModel save(MensajesModel mensaje) {
        return mensajeRepository.save(mensaje);
    }

    /**
     * Elimina un mensaje por su ID.
     * 
     * @param id ID del mensaje a eliminar.
     */
    public void deleteById(Integer id) {
        mensajeRepository.deleteById(id);
    }

    /**
     * Actualiza un mensaje existente.
     * 
     * @param id ID del mensaje a actualizar.
     * @param mensaje Objeto de mensaje con los nuevos datos.
     * @return Mensaje actualizado o null si no se encontró.
     */
    public MensajesModel update(Integer id, MensajesModel mensaje){
        MensajesModel mensajeExistente = mensajeRepository.findById(id).orElse(null);
        
        if (mensajeExistente != null){

            mensaje.setEnviado(mensajeExistente.getEnviado());
            mensaje.setId(id);
            return mensajeRepository.save(mensaje);
        }
        return null;
    }
}