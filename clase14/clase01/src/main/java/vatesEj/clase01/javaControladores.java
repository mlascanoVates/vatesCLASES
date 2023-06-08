package vatesEj.clase01;

import org.springframework.web.bind.annotation.GetMapping;

import java.util.stream.IntStream;
import java.util.Random;
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

}
