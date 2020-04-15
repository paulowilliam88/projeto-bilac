package br.com.quizverde.api.controller;

import br.com.quizverde.api.model.PerguntaQuizVerde;
import br.com.quizverde.api.service.PerguntaQuizVerdeService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
@CrossOrigin(maxAge = 3600)
public class QuizVerdeController {
    
    @Autowired
    private PerguntaQuizVerdeService perguntaQuizVerdeService;

    @GetMapping("/list")
    public List<PerguntaQuizVerde> perguntaQuizVerdeList() {
        return perguntaQuizVerdeService.findAll();
    }

}
