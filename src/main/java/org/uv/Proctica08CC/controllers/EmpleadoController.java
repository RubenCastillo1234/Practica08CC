package org.uv.Proctica08CC.controllers;


import java.util.ArrayList;
import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.uv.Proctica08CC.dtos.DTOEmpleado;

/**
 *
 * @author ruben
 */
@RestController
@RequestMapping(path = "/api")
public class EmpleadoController {
    
    @GetMapping("/hello")
    public String hello(){
        return "Hola mundo";
    }
    
    @GetMapping("/empleado/{id}")
    public DTOEmpleado findById(@PathVariable("id") int id){
        DTOEmpleado emp= new DTOEmpleado();
        if(id==1){
            emp.setId(1);
            emp.setNombre("Terán");
            emp.setDireccion("Avenida 2");
            emp.setTelefono("1122334455");
        }
        
        return emp;
    }
    
    @GetMapping("/empleado")
    public List<DTOEmpleado> findAll(){
        List<DTOEmpleado> emps= new ArrayList<>();
        
        DTOEmpleado emp= new DTOEmpleado();        
        emp.setId(1);
        emp.setNombre("Ruben");
        emp.setDireccion("Poniente 40");
        emp.setTelefono("1122334455");
        emps.add(emp);
        
        DTOEmpleado emp2= new DTOEmpleado();        
        emp2.setId(2);
        emp2.setNombre("Oziel");
        emp2.setDireccion("Avenida 12");
        emp2.setTelefono("1236878912");
        emps.add(emp2);
        
        DTOEmpleado emp3= new DTOEmpleado();        
        emp3.setId(3);
        emp3.setNombre("Irvinf");
        emp3.setDireccion("Avenida 212");
        emp3.setTelefono("368794012");
        emps.add(emp3);
        
        return emps;
    }
    
    @PostMapping("/empleado")
    public DTOEmpleado create(@RequestBody DTOEmpleado emp){
        DTOEmpleado empNew= new DTOEmpleado();
        
        empNew.setId(1);
        empNew.setNombre(emp.getNombre());
        empNew.setDireccion(emp.getDireccion());
        empNew.setTelefono(emp.getTelefono());
        
        return empNew;
    }
    
    //Agregar repository
    //agregar delete e put
    
}
