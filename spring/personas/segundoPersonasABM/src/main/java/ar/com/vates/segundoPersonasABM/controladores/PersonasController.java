package ar.com.vates.segundoPersonasABM.controladores;

import ar.com.vates.segundoPersonasABM.entidades.Persona;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class PersonasController {

    //que usar para guardar persona sabiendo que tendo un dato que es CLAVE
    private Map<Integer, Persona> plantel= new HashMap<Integer, Persona>();

    PersonasController(){
        plantel.put(2345,new Persona(2345, "Juan", "Perez", 34));
        plantel.put(4345,new Persona(4345, "Luis", "Ledesma", 40));
        plantel.put(1234,new Persona(1234, "Emilia", "Malnis", 33));
    }

    @GetMapping("/persona")
    public Map<Integer, Persona> listarPersonas(){
        return plantel;
    }

    @GetMapping("/persona/{dni}")
    public void personaPorDocumento(@PathVariable int dni){

    }


    //DIFERENCIA DE PUT vs POST
    //guardar una persona en esta dirección
    @PutMapping("/persona/{dni}")
    public void agregarPersonas(@PathVariable int dni){

    }




}
