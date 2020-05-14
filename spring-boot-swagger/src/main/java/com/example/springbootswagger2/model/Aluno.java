package com.example.springbootswagger2.model;

import io.swagger.annotations.ApiModelProperty;

public class Aluno {

    @ApiModelProperty(notes = "Nome do aluno", name = "name", required = true)
    private String name;
    
    @ApiModelProperty(notes = "Classe do aluno", name = "cls", required = true)
    private String cls;
    
    @ApiModelProperty(notes = "Pais do aluno", name = "country", required = true)
    private String country;

    public Aluno(String name, String cls, String country) {
        super();
        this.name = name;
        this.cls = cls;
        this.country = country;
    }

    public String getName() {
        return name;
    }

    public String getCls() {
        return cls;
    }

    public String getCountry() {
        return country;
    }

    @Override
    public String toString() {
        return "Student [name=" + name + ", cls=" + cls + ", country=" + country + "]";
    }

}