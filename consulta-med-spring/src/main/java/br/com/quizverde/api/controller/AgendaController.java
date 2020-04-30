package br.com.quizverde.api.controller;

import br.com.quizverde.api.model.Agenda;
import br.com.quizverde.api.service.AgendaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
@CrossOrigin(maxAge = 3600)
public class AgendaController {
    
    @Autowired
    private AgendaService perguntaQuizVerdeService;

    @GetMapping()
    public List<Agenda> agendaList() {
        return perguntaQuizVerdeService.findAll();
    }

}
