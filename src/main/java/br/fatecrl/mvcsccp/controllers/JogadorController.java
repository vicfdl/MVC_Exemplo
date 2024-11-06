package br.fatecrl.mvcsccp.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import br.fatecrl.mvcsccp.models.Jogador;

@Controller
@RequestMapping("jogadores")
public class JogadorController {

    private List<Jogador> jogadores = new ArrayList<Jogador>();

    public JogadorController(){
        jogadores.add(new Jogador("Yuri Alberto", "09", "Atacante", 25));
        jogadores.add(new Jogador("Rodrigo Garro", "10", "Meia", 10));
        jogadores.add(new Jogador("Ángel Romero", "11", "Atacante", 16));
    }

    @GetMapping
    public String getJogadores(Model model){
        model.addAttribute("jogadores", jogadores);
        return "jogadores";
    }
}
