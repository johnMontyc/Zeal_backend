package com.zeal.service;

import com.zeal.model.RolesModel;
import com.zeal.repository.RolesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Timestamp;
import java.util.List;

/**
 * Servicio que gestiona las operaciones relacionadas con la entidad {@link RolesModel}.
 * Ofrece métodos para obtener, guardar, actualizar y eliminar roles.
 * Utiliza {@link RolesRepository} para interactuar con la base de datos.
 * 
 * @author John Montoya
 * @author Juan Gil
 * @author Issa Cooper
 * @author Luis Martinez
 */
@Service
public class RolesService {

    @Autowired
    private RolesRepository rolRepository;

    /**
     * Obtiene todos los roles registrados.
     * 
     * @return Lista de todos los roles.
     */
    public List<RolesModel> findAll() {
        return rolRepository.findAll();
    }

    /**
     * Busca un rol por su ID.
     * 
     * @param id ID del rol.
     * @return Rol encontrado o null si no existe.
     */
    public RolesModel findById(Integer id) {
        return rolRepository.findById(id).orElse(null);
    }

    /**
     * Guarda un nuevo rol en la base de datos.
     * 
     * @param rol Objeto de rol a guardar.
     * @return Rol guardado.
     */
    public RolesModel save(RolesModel rol) {
        return rolRepository.save(rol);
    }

    /**
     * Elimina un rol por su ID.
     * 
     * @param id ID del rol a eliminar.
     */
    public void deleteById(Integer id) {
        rolRepository.deleteById(id);
    }

    /**
     * Actualiza un rol existente.
     * 
     * @param id ID del rol a actualizar.
     * @param rol Objeto de rol con los nuevos datos.
     * @return Rol actualizado o null si no se encontró.
     */
    public RolesModel update(Integer id, RolesModel rol){
        RolesModel rolExistente = rolRepository.findById(id).orElse(null);
        
        if (rolExistente != null){

            rol.setCreado(rolExistente.getCreado());
            rol.setModificado(new Timestamp(System.currentTimeMillis()));
            rol.setId(id);
            return rolRepository.save(rol);
        }
        return null;
    }
}