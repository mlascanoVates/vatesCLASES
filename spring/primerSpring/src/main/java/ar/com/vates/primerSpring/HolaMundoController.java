package ar.com.vates.primerSpring;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;
import java.util.stream.IntStream;

//Poniendo RestController, SpringBoot reconoce que programo ENDPOINT
@RestController
public class HolaMundoController {

    //Hacemos get a la raíz del sitio
    @GetMapping("")
    public String raiz(){
        return "Raíz del sitio";
    }

    //se excede en /hola
    @GetMapping("/numerosR")
    public IntStream saludar(){
       return new Random().ints(20,0,10000);
    }
}
