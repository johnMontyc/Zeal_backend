package com.zeal.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.zeal.model.RolesModel;
import com.zeal.service.RolesService;

@RestController
@RequestMapping("/api/v1/rol")
public class RolesController {

    @Autowired
    private RolesService rolService;

    @GetMapping
    public List<RolesModel> getAllRoles() {
        return rolService.findAll();
    }

    @GetMapping("/{id}")
    public RolesModel getRolById(@PathVariable Integer id) {
        return rolService.findById(id);
    }

    @PostMapping
    public RolesModel createRol(@RequestBody RolesModel rol) {
    return rolService.save(rol);
    
}
    

    @PutMapping("/{id}")
    public RolesModel update(@PathVariable Integer id, @RequestBody RolesModel rol){
        return rolService.update(id, rol);
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable Integer id) {
        rolService.deleteById(id);
    }
}