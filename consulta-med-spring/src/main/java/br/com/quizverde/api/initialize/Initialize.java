package br.com.quizverde.api.initialize;

import br.com.quizverde.api.enumerator.TipoAgendamentoEnum;
import br.com.quizverde.api.model.Agenda;
import br.com.quizverde.api.repository.AgendaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class Initialize implements CommandLineRunner {

    @Autowired
    private AgendaRepository banckRepository;

    @Override
    public void run(String... args) throws Exception {
        {
            Agenda agenda = new Agenda();
            agenda.setTipoAgendamentoEnum(TipoAgendamentoEnum.INTENCAO_AGENDA);
            agenda.setPessoa("VICTOR DE ANDRADE BARBOSA ");
            agenda.setProfissional("GUILHERME JOSÉ DA CRUZ");
            agenda.setEspecialidade("MÉDICO CLINICO GERAL");
            banckRepository.save(agenda);

        }

        {
            Agenda agenda = new Agenda();
            agenda.setTipoAgendamentoEnum(TipoAgendamentoEnum.INTENCAO_AGENDA);
            agenda.setPessoa("SEBASTIÃO BATISTA BOSGES");
            agenda.setProfissional("GUILHERME JOSÉ DA CRUZ");
            agenda.setEspecialidade("MÉDICO CLINICO GERAL");
            banckRepository.save(agenda);

        }

        {
            Agenda agenda = new Agenda();
            agenda.setTipoAgendamentoEnum(TipoAgendamentoEnum.INTENCAO_AGENDA);
            agenda.setPessoa("ALEXANDRE CARDOSO CARVALHO");
            agenda.setProfissional("GUILHERME JOSÉ DA CRUZ");
            agenda.setEspecialidade("MÉDICO CLINICO GERAL");
            banckRepository.save(agenda);

        }

        {
            Agenda agenda = new Agenda();
            agenda.setTipoAgendamentoEnum(TipoAgendamentoEnum.INTENCAO_AGENDA);
            agenda.setPessoa("GUILERME CASTRO DIAS");
            agenda.setProfissional("GUILHERME JOSÉ DA CRUZ");
            agenda.setEspecialidade("MÉDICO CLINICO GERAL");
            banckRepository.save(agenda);

        }
    }

}
