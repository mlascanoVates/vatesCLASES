package vatesEj.clase01;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.Random;

@RestController
public class javaControladores {
    @GetMapping("/random")
    public IntStream random() {
        Random r= new Random();
        return r.ints(100,-10,1000);
    }
    @GetMapping("/")
    public String holamundo() {
        return "HOLA MUNDO";
    }


    private Set<Integer> conjunto= new Random()
            .ints(20,1,100).boxed().collect(Collectors.toSet());


    @GetMapping("/numeros")
    public Set<Integer> consultarTodos(){
        return conjunto;
        }

    @PutMapping("numeros/{nuevo}")
    public boolean add(@PathVariable  int nuevo){
        return conjunto.add(nuevo);
    }


 /*   @DeleteMapping("numeros/{numero}")
    public boolean remove(@PathVariable int numero){
        return conjunto.remove(numero);
    }*/
    @DeleteMapping("numeros/{buscado}")
    public ResponseEntity remove2(@PathVariable int buscado){
        return (conjunto.contains(buscado))? ResponseEntity.ok().build() : ResponseEntity.notFound().build();
    }


    @GetMapping("/numeros/{buscado}")
    public ResponseEntity buscar2(@PathVariable int buscado){
        return (conjunto.contains(buscado))? ResponseEntity.ok().build() : ResponseEntity.notFound().build();
    }

}
