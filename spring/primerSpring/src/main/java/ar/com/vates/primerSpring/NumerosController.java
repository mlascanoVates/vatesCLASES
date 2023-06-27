package ar.com.vates.primerSpring;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class NumerosController {

    //Solo por esta vez se declara Lista como atributo de la clase
    List<Long> numeros= new ArrayList<>();

    @GetMapping("/numeros")
    public List<Long> consultarTodo(){
        return numeros;
    }

    @PutMapping("/numeros")
    public void agregarNumero(int n){

    }

    @DeleteMapping("/numeros")
    public void borrarNumero(){
    }

    @GetMapping("/numeros/")
    public boolean existeNumero(){

    }
}
