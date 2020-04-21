package br.com.quizverde.api.initialize;

import br.com.quizverde.api.enumerator.TipoAlternativaAcertEnum;
import br.com.quizverde.api.model.AlternativaPerguntaQuizVerde;
import br.com.quizverde.api.model.PerguntaQuizVerde;
import br.com.quizverde.api.repository.IPerguntaQuizVerdeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

@Component
public class Initialize implements CommandLineRunner {

    @Autowired
    private IPerguntaQuizVerdeRepository banckRepository;

    @Override
    @Transactional
    public void run(String... args) throws Exception {

        {
            PerguntaQuizVerde perguntaQuizVerde = new PerguntaQuizVerde();
            perguntaQuizVerde.setPergunta("Em qual lixeira você deve jogar uma lata de refrigerante ?");
            perguntaQuizVerde.addAlternativaPergunta(new AlternativaPerguntaQuizVerde("Azul"));
            perguntaQuizVerde.addAlternativaPergunta(new AlternativaPerguntaQuizVerde("Amarelo", TipoAlternativaAcertEnum.ALTERNATIVA_CORRETA));
            perguntaQuizVerde.addAlternativaPergunta(new AlternativaPerguntaQuizVerde("Vermelho"));
            perguntaQuizVerde.addAlternativaPergunta(new AlternativaPerguntaQuizVerde("Verde"));
            banckRepository.save(perguntaQuizVerde);
        }

    }

}
