package com.example.springbootswagger2.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.springbootswagger2.model.Student;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.web.bind.annotation.RequestMethod;

@RestController
@Api(value = "Swagger2DemoRestController")
public class Swagger2DemoRestController {

    List<Student> students = new ArrayList<>();
    {
        students.add(new Student("Alci Barros", "IV", "Brasil"));
    }

    @ApiOperation(value = "Get lista de aluno", response = Iterable.class, tags = "getAluno")
    @ApiResponses(value = {
        @ApiResponse(code = 200, message = "Suceess|OK"),
        @ApiResponse(code = 401, message = "not authorized!"),
        @ApiResponse(code = 403, message = "forbidden!!!"),
        @ApiResponse(code = 404, message = "not found!!!")})
    @RequestMapping(value = "/getAluno", method = {RequestMethod.GET})
    public List<Student> getStudents() {
        return students;
    }

    @ApiOperation(value = "Retorna aluno ", response = Student.class, tags = "getAluno")
    @RequestMapping(value = "/getAluno/{name}", method = {RequestMethod.GET})
    public Student getStudent(@PathVariable(value = "name") String name) {
        return students.stream().filter(x -> x.getName().equalsIgnoreCase(name)).collect(Collectors.toList()).get(0);
    }



}
