package vates.claseS1;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@RestController
public class PersonasController{

    private Map<Integer, Persona> personas= new HashMap<>();

    @GetMapping("/personas/iniciar")
    public void iniciar(){
        personas.put(1, new Persona(1,"Juan","Perez",12));
        personas.put(2, new Persona(2,"Santiago","Lopez",38));
    }

    @GetMapping("/personas/")
    public Collection<Persona> obtenerTodas(){
        return personas.values();
    }
    @GetMapping("/personas/{documento}")
    public ResponseEntity<Persona> obtenerUna(@PathVariable int documento){
        Persona encontrada = personas.get(documento);
        if(encontrada !=null)
            return ResponseEntity.ok(encontrada);
        else
            return ResponseEntity.notFound().build();
    }
    @DeleteMapping("/personas/{documento}")
    public ResponseEntity<Persona> borrarUna(@PathVariable int documento){
        Persona encontrada = personas.get(documento);
        if(encontrada !=null)
            return ResponseEntity.ok(encontrada);
        else
            return ResponseEntity.notFound().build();
    }

    @PutMapping("/personas/{documento}")
    public void guarda(@PathVariable int documento, @RequestBody Persona nueva ){
        nueva.setDni(documento);
        personas.put(documento,nueva);
    }


}
