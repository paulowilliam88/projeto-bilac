package br.com.quizverde.api.service;

import br.com.quizverde.api.model.PerguntaQuizVerde;
import br.com.quizverde.api.repository.IPerguntaQuizVerdeRepository;
import java.util.List;
import java.util.Random;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

@Service
public class PerguntaQuizVerdeService {
    
    @Autowired
    private IPerguntaQuizVerdeRepository iPerguntaQuizVerdeRepository;

    public List<PerguntaQuizVerde> findAll() {
        int randomNum = new Random().nextInt(2);
        return iPerguntaQuizVerdeRepository.findAll(PageRequest.of(randomNum, 10)).toList();
    }
}
