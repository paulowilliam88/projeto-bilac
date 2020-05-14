package br.com.consultamed.api.initialize;

import br.com.consultamed.api.enumerator.TipoAgendamentoEnum;
import br.com.consultamed.api.model.Agenda;
import br.com.consultamed.api.repository.AgendaRepository;
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
            agenda.setPessoa("GUILHERME JOSÉ DA CRUZ");
            agenda.setProfissional("VICTOR DE ANDRADE BARBOSA ");
            agenda.setEspecialidade("MÉDICO CLINICO GERAL");
            agenda.setTipoAgendamentoEnum(TipoAgendamentoEnum.AGENDADO);
            agenda.setDataHora("22/01/2020 10:30");
            banckRepository.save(agenda);

        }

        {
            Agenda agenda = new Agenda();
            agenda.setTipoAgendamentoEnum(TipoAgendamentoEnum.INTENCAO_AGENDA);
            agenda.setPessoa("GUILHERME JOSÉ DA CRUZ");
            agenda.setProfissional("SEBASTIÃO BATISTA BOSGES");
            agenda.setEspecialidade("MÉDICO CLINICO GERAL");
            agenda.setTipoAgendamentoEnum(TipoAgendamentoEnum.AGENDADO);
            agenda.setDataHora("20/02/2020 10:30");
            banckRepository.save(agenda);

        }

        {
            Agenda agenda = new Agenda();
            agenda.setTipoAgendamentoEnum(TipoAgendamentoEnum.INTENCAO_AGENDA);
            agenda.setPessoa("GUILHERME JOSÉ DA CRUZ");
            agenda.setProfissional("ALEXANDRE CARDOSO CARVALHO");
            agenda.setEspecialidade("MÉDICO CLINICO GERAL");
            agenda.setTipoAgendamentoEnum(TipoAgendamentoEnum.AGENDADO);
            agenda.setDataHora("20/02/2020 10:30");
            banckRepository.save(agenda);

        }

        {
            Agenda agenda = new Agenda();
            agenda.setTipoAgendamentoEnum(TipoAgendamentoEnum.INTENCAO_AGENDA);
            agenda.setPessoa("GUILHERME JOSÉ DA CRUZ");
            agenda.setProfissional("GUILERME CASTRO DIAS");
            agenda.setEspecialidade("MÉDICO CLINICO GERAL");
            agenda.setTipoAgendamentoEnum(TipoAgendamentoEnum.AGENDADO);
            agenda.setDataHora("20/07/2020 10:30");
            banckRepository.save(agenda);

        }
    }

}
