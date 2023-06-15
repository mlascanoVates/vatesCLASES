package proyecto1.vatesInitia;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@RestController
public class NumerosController {

   List<Long> numeros= new ArrayList<>();


   Random r= new Random();



   @GetMapping("/numeros")
   public List<Long> consultarTodos(){
       return numeros;
   }
}
