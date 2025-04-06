package com.zeal.service;

import com.zeal.model.TipoUsuariosModel;
import com.zeal.repository.TipoUsuariosRepository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Servicio que gestiona las operaciones CRUD para los tipos de usuario.
 * Proporciona métodos para crear, leer, actualizar y eliminar registros
 * de la entidad {@link TipoUsuariosModel}.
 * 
 * @author John Montoya
 * @author Juan Gil
 * @author Issa Cooper
 * @author Luis Martinez
 */
@Service
public class TipoUsuariosService {
    @Autowired 
    private TipoUsuariosRepository tipoUsuarioRepo;

    /**
     * Guarda un nuevo tipo de usuario en la base de datos.
     * 
     * @param tipoUsuario Objeto TipoUsuariosModel a guardar
     * @return El tipo de usuario guardado
     */
    public TipoUsuariosModel saveTipoUser(TipoUsuariosModel tipoUsuario){
        return tipoUsuarioRepo.save(tipoUsuario);
    }

    /**
     * Obtiene todos los tipos de usuario registrados.
     * 
     * @return Lista con todos los tipos de usuario
     */
    public List<TipoUsuariosModel> listAll(){
        return tipoUsuarioRepo.findAll();
    }

    /**
     * Elimina un tipo de usuario por su ID.
     * 
     * @param id ID del tipo de usuario a eliminar
     */
    public void deleteTipoUser(Integer id){
        tipoUsuarioRepo.deleteById(id);
    }

    /**
     * Busca un tipo de usuario por su ID.
     * 
     * @param id ID del tipo de usuario a buscar
     * @return El tipo de usuario encontrado o null si no existe
     */
    public TipoUsuariosModel findById(Integer id){
        return tipoUsuarioRepo.findById(id).orElse(null);
    }

    /**
     * Actualiza la información de un tipo de usuario existente.
     * 
     * @param id ID del tipo de usuario a actualizar
     * @param tipoUsuario Objeto con los nuevos datos del tipo de usuario
     * @return El tipo de usuario actualizado o null si no se encontró el registro
     */
    public TipoUsuariosModel update(Integer id, TipoUsuariosModel tipoUsuario) {
        if (tipoUsuarioRepo.existsById(id)) {
            tipoUsuario.setId(id);
            return tipoUsuarioRepo.save(tipoUsuario);
        } else {
            return null;
        }
    }
}