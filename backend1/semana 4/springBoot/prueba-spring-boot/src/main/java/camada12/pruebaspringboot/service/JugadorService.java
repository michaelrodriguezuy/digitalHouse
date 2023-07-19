package camada12.pruebaspringboot.service;

import camada12.pruebaspringboot.model.Jugador;

import java.util.List;

public class JugadorService {

    private List<Jugador> jugadores = List.of(new Jugador("Forlan", 10), new Jugador("Palermo", 9));

    public List<Jugador> getJugadores(){
        return this.jugadores;
    }
}
