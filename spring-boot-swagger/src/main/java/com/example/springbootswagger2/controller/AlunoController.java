package com.example.springbootswagger2.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.springbootswagger2.model.Aluno;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import java.util.UUID;
import javax.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMethod;

@RestController
@Api(value = "Swagger2DemoRestController", tags = "Aluno", description = "Aluno Controller")
public class AlunoController {

    List<Aluno> studentList = new ArrayList<>();{
        studentList.add(new Aluno("Alci Barros", "IV", "Brasil"));
    }

    @ApiOperation(value = "lista de aluno", response = Iterable.class, tags = "Aluno")
    @ApiResponses(value = { @ApiResponse(code = 200, message = "Suceess|OK"), @ApiResponse(code = 401, message = "not authorized!"), @ApiResponse(code = 403, message = "forbidden!!!"), @ApiResponse(code = 404, message = "not found!!!")})
    @RequestMapping(value = "/aluno", method = {RequestMethod.GET})
    public List<Aluno> getStudents() {
        return studentList;
    }

    @ApiOperation(value = "Retorna aluno ", response = Aluno.class, tags = "Aluno")
    @RequestMapping(value = "/aluno/{name}", method = {RequestMethod.GET})
    public Aluno getStudent(@PathVariable(value = "name") String name) {
        return studentList.stream().filter(x -> x.getName().equalsIgnoreCase(name)).collect(Collectors.toList()).get(0);
    }

    @ApiOperation(value = "Cria aluno", tags = "Aluno")
    @RequestMapping(value = "/aluno", method = {RequestMethod.POST})
    public ResponseEntity<UUID> create(@Valid @RequestBody Aluno student) {
        studentList.add(student);
        return new ResponseEntity<>(null, HttpStatus.CREATED);
    }

    @ApiOperation(value = "Atualizar aluno", tags = "Aluno")
    @RequestMapping(value = "/aluno/{id}", method = {RequestMethod.PUT})
    public ResponseEntity<Aluno> update(@PathVariable(value = "id") UUID id, @RequestBody Aluno aluno) {
        return new ResponseEntity<>(null, HttpStatus.OK);
    }

}
