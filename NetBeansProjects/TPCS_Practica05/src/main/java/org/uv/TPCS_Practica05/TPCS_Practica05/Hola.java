package org.uv.TPCS_Practica05.TPCS_Practica05;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/springframework/RestController.java to edit this template
 */


import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author francisco
 */
@RestController
@RequestMapping("/api/hola")
public class Hola {
    @GetMapping()
    public DTOUsuario msg()
    {
    DTOUsuario usuario = new DTOUsuario("francisco", "calle 1");
   return usuario;
    }
    @GetMapping("{id}")
      public DTOUsuario msg(@PathVariable("id")Long id)
    {
    DTOUsuario usuario = new DTOUsuario("francisco"+id, "calle 1"+id);
   return usuario;
    }
    
    
    @PostMapping()
    public String msg2(@RequestBody DTOUsuario usr){
    String msg = "se recibio"+ usr.getNombre() + "--"+usr.getDireccion() + "--" +usr.getTelefono();
    return "{msg:"+msg+"}";
    }
    
    @PutMapping()
public String msg3(@RequestBody DTOUsuario usr) {
    String msg = "se editó " + usr.getNombre() + "--" + usr.getDireccion() + "--" + usr.getTelefono();
  
    return "{msg:" + msg+ "}";
}

 @DeleteMapping()
public String msg4(@RequestBody DTOUsuario usr) {
    Long id = 1L; 
    String msg = "se eliminó el empleado con ID: " + id;
    String deleteRequest = String.format("{ \"id\": %d }", id);

    return "{msg:" + msg + ", deleteRequest: " + deleteRequest + "}";
}

// Método para obtener los encabezados necesarios (ajusta según tus necesidades)
private HttpHeaders getHeaders() {
    HttpHeaders headers = new HttpHeaders();
    headers.setContentType(MediaType.APPLICATION_JSON);
    return headers;
}
    //       @PostMapping()
//    public String msg2(@RequestBody DTOUsuario usr){
//    String msg = "se recibio"+ usr.getNombre() + "--"+usr.getDireccion()+"--"+usr.getTelefono();
//    Empleado empleado = new Empleado(); 
//    empleado.setNombre(usr.getNombre());
//    empleado.setDireccion(usr.getDireccion());
//    empleado.setTelefono(usr.getTelefono());
//    ControllerEmpleado emp = new ControllerEmpleado();
//    emp.post(empleado);
//   return msg;
//    }
    
}
