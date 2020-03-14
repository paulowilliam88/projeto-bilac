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

        {
            PerguntaQuizVerde perguntaQuizVerde = new PerguntaQuizVerde();
            perguntaQuizVerde.setPergunta("Quanto tempo leva para uma sacola plástica se decompor?");
            perguntaQuizVerde.addAlternativaPergunta(new AlternativaPerguntaQuizVerde("10 a 100 anos"));
            perguntaQuizVerde.addAlternativaPergunta(new AlternativaPerguntaQuizVerde("100 a 400 anos", TipoAlternativaAcertEnum.ALTERNATIVA_CORRETA));
            perguntaQuizVerde.addAlternativaPergunta(new AlternativaPerguntaQuizVerde("400 a 600 anos"));
            perguntaQuizVerde.addAlternativaPergunta(new AlternativaPerguntaQuizVerde("600 a 900 anos"));
            banckRepository.save(perguntaQuizVerde);
        }

        {
            PerguntaQuizVerde perguntaQuizVerde = new PerguntaQuizVerde();
            perguntaQuizVerde.setPergunta("Que tipo de atitude indica desperdício de água?");
            perguntaQuizVerde.addAlternativaPergunta(new AlternativaPerguntaQuizVerde("Desligar o chuveiro para se ensaboar"));
            perguntaQuizVerde.addAlternativaPergunta(new AlternativaPerguntaQuizVerde("Lavar o carro com mangueira", TipoAlternativaAcertEnum.ALTERNATIVA_CORRETA));
            perguntaQuizVerde.addAlternativaPergunta(new AlternativaPerguntaQuizVerde("Fechar a torneira enquanto escova os dentes"));
            perguntaQuizVerde.addAlternativaPergunta(new AlternativaPerguntaQuizVerde("Tomar banho rápido"));
            banckRepository.save(perguntaQuizVerde);
        }

        {
            PerguntaQuizVerde perguntaQuizVerde = new PerguntaQuizVerde();
            perguntaQuizVerde.setPergunta("Qual das alternativas abaixo é um exemplo de reciclagem?");
            perguntaQuizVerde.addAlternativaPergunta(new AlternativaPerguntaQuizVerde("Incineração"));
            perguntaQuizVerde.addAlternativaPergunta(new AlternativaPerguntaQuizVerde("Acúmulo de matéria prima"));
            perguntaQuizVerde.addAlternativaPergunta(new AlternativaPerguntaQuizVerde("Misturar o lixo"));
            perguntaQuizVerde.addAlternativaPergunta(new AlternativaPerguntaQuizVerde("Coleta seletiva", TipoAlternativaAcertEnum.ALTERNATIVA_CORRETA));
            banckRepository.save(perguntaQuizVerde);
        }

        {
            PerguntaQuizVerde perguntaQuizVerde = new PerguntaQuizVerde();
            perguntaQuizVerde.setPergunta("Qual o automóvel que mais polui o ar no Brasil?");
            perguntaQuizVerde.addAlternativaPergunta(new AlternativaPerguntaQuizVerde("Carro"));
            perguntaQuizVerde.addAlternativaPergunta(new AlternativaPerguntaQuizVerde("Moto"));
            perguntaQuizVerde.addAlternativaPergunta(new AlternativaPerguntaQuizVerde("Caminhão", TipoAlternativaAcertEnum.ALTERNATIVA_CORRETA));
            perguntaQuizVerde.addAlternativaPergunta(new AlternativaPerguntaQuizVerde("Ônibus"));
            banckRepository.save(perguntaQuizVerde);
        }

        {
            PerguntaQuizVerde perguntaQuizVerde = new PerguntaQuizVerde();
            perguntaQuizVerde.setPergunta("Qual o motivo para o aumento do efeito estufa?");
            perguntaQuizVerde.addAlternativaPergunta(new AlternativaPerguntaQuizVerde("Queima de combustíveis"));
            perguntaQuizVerde.addAlternativaPergunta(new AlternativaPerguntaQuizVerde("Criação de vacas"));
            perguntaQuizVerde.addAlternativaPergunta(new AlternativaPerguntaQuizVerde("Queimadas em florestas"));
            perguntaQuizVerde.addAlternativaPergunta(new AlternativaPerguntaQuizVerde("Todas as alternativas anteriores", TipoAlternativaAcertEnum.ALTERNATIVA_CORRETA));
            banckRepository.save(perguntaQuizVerde);
        }

        {
            PerguntaQuizVerde perguntaQuizVerde = new PerguntaQuizVerde();
            perguntaQuizVerde.setPergunta("Como podemos evitar o desperdício de água?");
            perguntaQuizVerde.addAlternativaPergunta(new AlternativaPerguntaQuizVerde("Tomar banhos longos"));
            perguntaQuizVerde.addAlternativaPergunta(new AlternativaPerguntaQuizVerde("Desligar a torneira enquanto escova os dentes", TipoAlternativaAcertEnum.ALTERNATIVA_CORRETA));
            perguntaQuizVerde.addAlternativaPergunta(new AlternativaPerguntaQuizVerde("Lavar o quintal com a mangueira"));
            perguntaQuizVerde.addAlternativaPergunta(new AlternativaPerguntaQuizVerde("Puxar a descarga por muito tempo"));
            banckRepository.save(perguntaQuizVerde);
        }

        {
            PerguntaQuizVerde perguntaQuizVerde = new PerguntaQuizVerde();
            perguntaQuizVerde.setPergunta("Em qual lixeira você deve jogar uma lata de refrigerante?");
            perguntaQuizVerde.addAlternativaPergunta(new AlternativaPerguntaQuizVerde("Azul"));
            perguntaQuizVerde.addAlternativaPergunta(new AlternativaPerguntaQuizVerde("Amarelo", TipoAlternativaAcertEnum.ALTERNATIVA_CORRETA));
            perguntaQuizVerde.addAlternativaPergunta(new AlternativaPerguntaQuizVerde("Vermelho"));
            perguntaQuizVerde.addAlternativaPergunta(new AlternativaPerguntaQuizVerde("Verde"));
            banckRepository.save(perguntaQuizVerde);
        }

        {
            PerguntaQuizVerde perguntaQuizVerde = new PerguntaQuizVerde();
            perguntaQuizVerde.setPergunta("Quanto tempo leva para uma sacola plástica se decompor?");
            perguntaQuizVerde.addAlternativaPergunta(new AlternativaPerguntaQuizVerde("10 a 100 anos"));
            perguntaQuizVerde.addAlternativaPergunta(new AlternativaPerguntaQuizVerde("100 a 400 anos", TipoAlternativaAcertEnum.ALTERNATIVA_CORRETA));
            perguntaQuizVerde.addAlternativaPergunta(new AlternativaPerguntaQuizVerde("400 a 600 anos"));
            perguntaQuizVerde.addAlternativaPergunta(new AlternativaPerguntaQuizVerde("600 a 900 anos"));
            banckRepository.save(perguntaQuizVerde);
        }

        {
            PerguntaQuizVerde perguntaQuizVerde = new PerguntaQuizVerde();
            perguntaQuizVerde.setPergunta("Que tipo de atitude indica desperdício de água?");
            perguntaQuizVerde.addAlternativaPergunta(new AlternativaPerguntaQuizVerde("Desligar o chuveiro para se ensaboar"));
            perguntaQuizVerde.addAlternativaPergunta(new AlternativaPerguntaQuizVerde("Lavar o carro com mangueira", TipoAlternativaAcertEnum.ALTERNATIVA_CORRETA));
            perguntaQuizVerde.addAlternativaPergunta(new AlternativaPerguntaQuizVerde("Fechar a torneira enquanto escova os dentes"));
            perguntaQuizVerde.addAlternativaPergunta(new AlternativaPerguntaQuizVerde("Tomar banho rápido"));
            banckRepository.save(perguntaQuizVerde);
        }

        {
            PerguntaQuizVerde perguntaQuizVerde = new PerguntaQuizVerde();
            perguntaQuizVerde.setPergunta("Qual das alternativas abaixo é um exemplo de reciclagem?");
            perguntaQuizVerde.addAlternativaPergunta(new AlternativaPerguntaQuizVerde("Incineração"));
            perguntaQuizVerde.addAlternativaPergunta(new AlternativaPerguntaQuizVerde("Acúmulo de matéria prima"));
            perguntaQuizVerde.addAlternativaPergunta(new AlternativaPerguntaQuizVerde("Misturar o lixo"));
            perguntaQuizVerde.addAlternativaPergunta(new AlternativaPerguntaQuizVerde("Coleta seletiva", TipoAlternativaAcertEnum.ALTERNATIVA_CORRETA));
            banckRepository.save(perguntaQuizVerde);
        }

        {
            PerguntaQuizVerde perguntaQuizVerde = new PerguntaQuizVerde();
            perguntaQuizVerde.setPergunta("Qual o automóvel que mais polui o ar no Brasil?");
            perguntaQuizVerde.addAlternativaPergunta(new AlternativaPerguntaQuizVerde("Carro"));
            perguntaQuizVerde.addAlternativaPergunta(new AlternativaPerguntaQuizVerde("Moto"));
            perguntaQuizVerde.addAlternativaPergunta(new AlternativaPerguntaQuizVerde("Caminhão", TipoAlternativaAcertEnum.ALTERNATIVA_CORRETA));
            perguntaQuizVerde.addAlternativaPergunta(new AlternativaPerguntaQuizVerde("Ônibus"));
            banckRepository.save(perguntaQuizVerde);
        }

        {
            PerguntaQuizVerde perguntaQuizVerde = new PerguntaQuizVerde();
            perguntaQuizVerde.setPergunta("Qual o motivo para o aumento do efeito estufa?");
            perguntaQuizVerde.addAlternativaPergunta(new AlternativaPerguntaQuizVerde("Queima de combustíveis"));
            perguntaQuizVerde.addAlternativaPergunta(new AlternativaPerguntaQuizVerde("Criação de vacas"));
            perguntaQuizVerde.addAlternativaPergunta(new AlternativaPerguntaQuizVerde("Queimadas em florestas"));
            perguntaQuizVerde.addAlternativaPergunta(new AlternativaPerguntaQuizVerde("Todas as alternativas anteriores", TipoAlternativaAcertEnum.ALTERNATIVA_CORRETA));
            banckRepository.save(perguntaQuizVerde);
        }

        {
            PerguntaQuizVerde perguntaQuizVerde = new PerguntaQuizVerde();
            perguntaQuizVerde.setPergunta("Como podemos evitar o desperdício de água?");
            perguntaQuizVerde.addAlternativaPergunta(new AlternativaPerguntaQuizVerde("Tomar banhos longos"));
            perguntaQuizVerde.addAlternativaPergunta(new AlternativaPerguntaQuizVerde("Desligar a torneira enquanto escova os dentes", TipoAlternativaAcertEnum.ALTERNATIVA_CORRETA));
            perguntaQuizVerde.addAlternativaPergunta(new AlternativaPerguntaQuizVerde("Lavar o quintal com a mangueira"));
            perguntaQuizVerde.addAlternativaPergunta(new AlternativaPerguntaQuizVerde("Puxar a descarga por muito tempo"));
            banckRepository.save(perguntaQuizVerde);
        }
    }

}
