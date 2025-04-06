package com.zeal.service;

import com.zeal.model.UsuariosModel;
import com.zeal.repository.UsuariosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

/**
 * Servicio que gestiona las operaciones relacionadas con la entidad {@link UsuariosModel}.
 * Ofrece métodos para obtener, guardar, actualizar y eliminar usuarios.
 * Utiliza {@link UsuariosRepository} para interactuar con la base de datos.
 * 
 * @author John Montoya
 * @author Juan Gil
 * @author Issa Cooper
 * @author Luis Martinez
 */
@Service
public class UsuariosService {

    @Autowired
    private UsuariosRepository usuariosRepository;

    /**
     * Obtiene todos los usuarios registrados.
     * 
     * @return Lista de todos los usuarios.
     */
    public List<UsuariosModel> findAll() {
        return usuariosRepository.findAll();
    }

    /**
     * Busca un usuario por su ID.
     * 
     * @param id ID del usuario.
     * @return Usuario encontrado o null si no existe.
     */
    public UsuariosModel findById(Integer id) {
        return usuariosRepository.findById(id).orElse(null);
    }

    /**
     * Guarda un nuevo usuario en la base de datos.
     * 
     * @param usuariosModel Objeto de usuario a guardar.
     * @return Usuario guardado.
     */
    public UsuariosModel save(UsuariosModel usuariosModel) {
        return usuariosRepository.save(usuariosModel);
    }

    /**
     * Elimina un usuario por su ID.
     * 
     * @param id ID del usuario a eliminar.
     */
    public void deleteById(Integer id) {
        usuariosRepository.deleteById(id);
    }

    /**
     * Actualiza un usuario existente.
     * 
     * @param id ID del usuario a actualizar.
     * @param usuariosModel Objeto con los nuevos datos del usuario.
     * @return Usuario actualizado o null si no se encontró.
     */
    public UsuariosModel update(Integer id, UsuariosModel usuariosModel) {
        if (usuariosRepository.existsById(id)) {
            usuariosModel.setId(id);
            return usuariosRepository.save(usuariosModel);
        } else {
            return null;
        }
    }

}


