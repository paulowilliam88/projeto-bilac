package br.com.consultamed.api.controller;

import br.com.consultamed.api.model.Agenda;
import br.com.consultamed.api.service.AgendaService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
@CrossOrigin(origins="*")
@Api()
public class AgendaController {

    @Autowired
    private AgendaService agendaService;


    @ApiOperation(value = "Lista agenda", notes = "Método utilizado para recuperar uma lista de agenda", response = Agenda.class)
    @RequestMapping(value = "/", method = {RequestMethod.GET})
    public ResponseEntity<List<Agenda>> agendaList() {
        List<Agenda> agendaList = agendaService.findAll();
        return new ResponseEntity<>(agendaList, HttpStatus.OK);
    }

    @ApiOperation(value = "Cria agenda")
    @RequestMapping(value = "/create", method = {RequestMethod.POST})
    public ResponseEntity<Agenda> create(@RequestBody Agenda agenda) {
        Agenda create = agendaService.save(agenda);
        return new ResponseEntity<>(create, HttpStatus.OK);
    }

    @ApiOperation(value = "Retorna agenda ", response = Agenda.class)
    @RequestMapping(value = "/read/{id}", method = {RequestMethod.GET})
    public ResponseEntity<Agenda> read(@PathVariable(value = "id") Integer id) {
        return agendaService.findById(id).map(agenda -> {
            return ResponseEntity.ok().body(agenda);
        }).orElse(ResponseEntity.notFound().build());
    }

    @ApiOperation(value = "Atualizar agenda")
    @RequestMapping(value = "/update/{id}", method = {RequestMethod.PUT})
    public ResponseEntity<Agenda> update(@PathVariable(value = "id") Integer id, @RequestBody Agenda agenda) {
        return agendaService.findById(id)
                .map((Agenda record) -> {
                    record.setTipoAgendamentoEnum(agenda.getTipoAgendamentoEnum());
                    Agenda updated = agendaService.save(record);
                    return ResponseEntity.ok().body(updated);
                }).orElse(ResponseEntity.notFound().build());
    }

    @ApiOperation(value = "Excluir agenda")
    @RequestMapping(value = "/delete/{id}", method = {RequestMethod.DELETE})
    public ResponseEntity<HttpStatus> delete(@PathVariable(value = "id") Integer id) {
        return agendaService.findById(id).map((Agenda record) -> {
            agendaService.deleteById(record.getId());
            return ResponseEntity.ok().body(HttpStatus.OK);
        }).orElse(ResponseEntity.notFound().build());
    }
}
