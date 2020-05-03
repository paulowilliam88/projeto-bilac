package br.com.quizverde.api.service;

import br.com.quizverde.api.model.Agenda;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import br.com.quizverde.api.repository.AgendaRepository;

@Service
public class AgendaService {
    
    @Autowired
    private AgendaRepository agendaRepository;

    public List<Agenda> findAll() {
        return agendaRepository.findAll();
    }
}
