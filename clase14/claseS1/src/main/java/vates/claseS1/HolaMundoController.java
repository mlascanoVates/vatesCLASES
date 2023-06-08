package vates.claseS1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HolaMundoController {

    @GetMapping("/")
    public String HolaMundo(){
        return "Hola Mundo";
    }

}
