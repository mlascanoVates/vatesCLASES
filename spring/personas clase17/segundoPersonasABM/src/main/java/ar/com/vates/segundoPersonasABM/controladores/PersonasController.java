package ar.com.vates.segundoPersonasABM.controladores;

import ar.com.vates.segundoPersonasABM.entidades.Persona;
import ar.com.vates.segundoPersonasABM.entidades.Telefono;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//PROGRAMO QUE TODOS los endpoints esten en el mismo lugar
@RestController
@RequestMapping("/persona")
public class PersonasController {

    //que usar para guardar persona sabiendo que tendo un dato que es CLAVE
    private Map<Integer, Persona> plantel= new HashMap<Integer, Persona>();

    PersonasController(){
        plantel.put(2345,new Persona(2345, "Juan", "Perez", 34));
        plantel.put(4345,new Persona(4345, "Luis", "Ledesma", 40));
        plantel.put(1234,new Persona(1234, "Emilia", "Malnis", 33));
    }

    @GetMapping("")
    public Collection<Persona> listarPersonas(){
        return plantel.values();
    }

    @GetMapping("/{dni}")
    public ResponseEntity<Persona> personaPorDocumento(@PathVariable int dni){
        Persona existe= plantel.get(dni);
        return (existe != null) ? ResponseEntity.ok(existe) : ResponseEntity.notFound().build();
    }
    
/*

    //DIFERENCIA DE PUT vs POST
    //guardar una persona en esta dirección
    @PutMapping("/{dni}")
    public ResponseEntity agregarPersonas(@PathVariable int dni, @RequestBody Persona p ){
     return (plantel.put(dni, p))==null ? ResponseEntity.created(URI.create(String.format("persona/%d", dni))).build(): ;     }

*/

    //para operar con los telefonos de una persona en particulas, le agregamos a la Uri /telefono
    @GetMapping("/{dni}/telefono")
    public ResponseEntity<List<Telefono>> getTelefono(@PathVariable int dni){
        Persona encontrada= plantel.get(dni);
        return ResponseEntity.ok().build();
    }


}
