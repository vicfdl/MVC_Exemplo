package br.fatecrl.mvcsccp.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.fatecrl.mvcsccp.models.Jogador;

@RestController
@RequestMapping("api/jogadores")
public class JogadorAPIController {
    private List<Jogador> jogadores = new ArrayList<Jogador>();

    public JogadorAPIController(){
        jogadores.add(new Jogador("Yuri Alberto", "09", "Atacante", 25));
        jogadores.add(new Jogador("Rodrigo Garro", "10", "Meia", 10));
        jogadores.add(new Jogador("Ángel Romero", "11", "Atacante", 16));
    }

    @GetMapping
    public List<Jogador> getJogadores(){
        return jogadores;
    }
}
