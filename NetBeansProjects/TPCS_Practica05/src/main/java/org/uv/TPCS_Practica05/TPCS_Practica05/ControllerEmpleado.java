/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/springframework/RestController.java to edit this template
 */
package org.uv.TPCS_Practica05.TPCS_Practica05;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.uv.TPCS_Practica05.data.Empleado;
import org.uv.TPCS_Practica05.data.RepositoryEmpleado;
import java.util.Optional;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.http.HttpStatus;

/**
 *
 * @author francisco
 */
@RestController
@RequestMapping("/api/empleado")
public class ControllerEmpleado {
    @Autowired
    RepositoryEmpleado repositoryEmpleado;
    @GetMapping()
    public List<Object> list() {
        return null;
    }
    
    @GetMapping("/{id}")
    public Object get(@PathVariable Long id) {
   Empleado empleado = repositoryEmpleado.findById(id)
        .orElse(null); // Puedes especificar un valor predeterminado o null si no se encuentra

if (empleado != null) {
    // Realizar acciones con el objeto Empleado encontrado
    return ResponseEntity.ok(empleado);
} else {
    return ResponseEntity.notFound().build();
}

    }
    
@PutMapping("/{id}")
public ResponseEntity<?> put(@PathVariable Long id, @RequestBody Empleado empleado) {
    Optional<Empleado> empleadoOptional = repositoryEmpleado.findById(id);

    if (empleadoOptional.isPresent()) {
      
        Empleado empleadoExistente = empleadoOptional.get();
        empleadoExistente.setNombre(empleado.getNombre());
        empleadoExistente.setDireccion(empleado.getDireccion());

      
        repositoryEmpleado.save(empleadoExistente);

        return ResponseEntity.ok(empleadoExistente);
    } else {
        // Si no se encuentra el empleado, devuelve una respuesta 404 Not Found
        return ResponseEntity.notFound().build();
    }
}
    
    @PostMapping("/api/hola")
    public ResponseEntity<?> post(@RequestBody Empleado empleado) {
      Empleado empres =repositoryEmpleado.save(empleado);
        return ResponseEntity.ok(empres);
    }
//@PostMapping("/api/hola")
//public ResponseEntity<?> post(@RequestBody Empleado empleado) {
//    try {
//        Empleado nuevoEmpleado = repositoryEmpleado.save(empleado);
//        return ResponseEntity.status(HttpStatus.CREATED).body(nuevoEmpleado);
//    } catch (DataIntegrityViolationException e) {
//        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Error al crear el empleado: Violación de restricciones");
//    } catch (Exception e) {
//        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Error interno del servidor al crear el empleado");
//    }
//}
 
    @DeleteMapping("/{id}")
    public ResponseEntity<?> delete(@PathVariable Long id) {
        Optional<Empleado> Buscar = repositoryEmpleado.findById(id);
        if (Buscar.isPresent()) {
            Empleado empleado = Buscar.get();
            repositoryEmpleado.delete(empleado);
            return ResponseEntity.ok("Empleado eliminado exitosamente");
        } else {
            return ResponseEntity.notFound().build();
        }
    }

}
