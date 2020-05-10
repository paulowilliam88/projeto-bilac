package br.com.consultamed.api.service;

import br.com.consultamed.api.model.Agenda;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import br.com.consultamed.api.repository.AgendaRepository;
import java.util.Optional;

@Service
public class AgendaService {

    @Autowired
    private AgendaRepository agendaRepository;

    public List<Agenda> findAll() {
        return agendaRepository.findAll();
    }

    public Agenda save(Agenda agenda) {
        return agendaRepository.save(agenda);
    }

    public Optional<Agenda> findById(Integer id) {
        return agendaRepository.findById(id);
    }

    public void deleteById(Integer id) {
        agendaRepository.deleteById(id);
    }
}
