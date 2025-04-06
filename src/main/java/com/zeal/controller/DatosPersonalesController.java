package com.zeal.controller;

import com.zeal.model.DatosPersonalesModel;
import com.zeal.service.DatosPersonalesService;
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
 * Controlador REST para gestionar la entidad {@link DatosPersonalesModel}.
 * Proporciona endpoints para realizar operaciones CRUD sobre datos personales.
 * 
 * URL base: /api/v1/datospersonales
 * 
 * @author John Montoya
 * @author Juan Gil
 * @author Issa Cooper
 * @author Luis Martinez
 */
@RestController
@RequestMapping("/api/v1/datospersonales")
public class DatosPersonalesController {

    @Autowired
    private DatosPersonalesService datosPersonalesService;

    /**
     * Obtiene todos los registros de datos personales.
     * 
     * @return Lista de {@link DatosPersonalesModel}
     */
    @GetMapping
    public List<DatosPersonalesModel> findAll() {
        return datosPersonalesService.findAll();
    }

    /**
     * Obtiene un registro de datos personales por su ID.
     * 
     * @param id ID del registro a buscar
     * @return Registro correspondiente a {@link DatosPersonalesModel}
     */
    @GetMapping("/{id}")
    public DatosPersonalesModel findById(@PathVariable Integer id) {
        return datosPersonalesService.findById(id);
    }

    /**
     * Crea un nuevo registro de datos personales.
     * 
     * @param datosPersonalesModel Datos del nuevo registro
     * @return Registro creado de {@link DatosPersonalesModel}
     */
    @PostMapping
    public DatosPersonalesModel save(@RequestBody DatosPersonalesModel datosPersonalesModel) {
        return datosPersonalesService.save(datosPersonalesModel);
    }

    /**
     * Actualiza un registro de datos personales existente.
     * 
     * @param id ID del registro a actualizar
     * @param datosPersonalesModel Datos actualizados
     * @return Registro actualizado de {@link DatosPersonalesModel}
     */
    @PutMapping("/{id}")
    public DatosPersonalesModel update(@PathVariable Integer id, @RequestBody DatosPersonalesModel datosPersonalesModel) {
        return datosPersonalesService.update(id, datosPersonalesModel);
    }

    /**
     * Elimina un registro de datos personales por su ID.
     * 
     * @param id ID del registro a eliminar
     */
    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable Integer id) {
        datosPersonalesService.deleteById(id);
    }
}
