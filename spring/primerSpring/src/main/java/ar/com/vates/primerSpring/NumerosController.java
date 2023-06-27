package ar.com.vates.primerSpring;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.LongStream;

@RestController
public class NumerosController {

    //Solo por esta vez se declara Lista como atributo de la clase
   // List<Long> numeros= new ArrayList<>();

    private Set<Integer> numeros= new Random().ints(20,0,1000).boxed().collect(Collectors.toSet());
    Random r= new Random();

  /*  @GetMapping("/numeros")
    public List<Long> consultarTodo(){
        return numeros;
    }*/

    @GetMapping("/numeros")
    public Set<Integer> consultarTodo(){
        return numeros;
    }

    @PutMapping("/numeros/{x}")
    public boolean agregarNumero(@PathVariable int x){
       return numeros.add(x);
    }

    @DeleteMapping("/numeros/{x}")
    public ResponseEntity<Set<Integer>> borrarNumero(@PathVariable int x){
        return (numeros.remove(x)) ?
                ResponseEntity.ok().build():
                ResponseEntity.notFound().build();
    }

    /*
    @GetMapping("/numeros/{x}")
    public boolean existeNumero(@PathVariable int x){
     return numeros.contains(x);
    }*/


    //EXISTE OTRA MANEAR SIN if else
    //Con ResponseEntity
    @GetMapping("/numeros/{x}")
    public ResponseEntity<Set<Integer>> existeNumero(@PathVariable int x){
        if(numeros.contains(x))        return ResponseEntity.ok().build();  //devuelve 200 si contiene
        else  return  ResponseEntity.notFound().build();  //devuelve 404 si no contiene
    }


    //consultar números DESDE y HASTA
}
