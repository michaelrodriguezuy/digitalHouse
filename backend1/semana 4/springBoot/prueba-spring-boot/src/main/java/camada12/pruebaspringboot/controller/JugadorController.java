package camada12.pruebaspringboot.controller;

import camada12.pruebaspringboot.model.Jugador;
import camada12.pruebaspringboot.service.JugadorService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


import java.util.List;

@RestController
public class JugadorController {

    JugadorService service = new JugadorService();

    @GetMapping("jugadores") //este GetMapping transforma los resultados en formato JSON
    List<Jugador> listarJugadores(){
        return service.getJugadores();
    }
}
