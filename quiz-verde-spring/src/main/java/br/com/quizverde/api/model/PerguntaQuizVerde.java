package br.com.quizverde.api.model;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "pqv_pergunta_quiz_verde")
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id")
public class PerguntaQuizVerde implements Serializable {

    @Id
    @Column(name = "pqv_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "pqv_pergunta")
    private String pergunta;

    @OneToMany(mappedBy = "perguntaQuizVerde", orphanRemoval = true, cascade = CascadeType.ALL)
    private List<AlternativaPerguntaQuizVerde> alternativaPerguntaQuizVerdeList = new ArrayList<>();

    public PerguntaQuizVerde() {
    }
    
    public void addAlternativaPergunta(AlternativaPerguntaQuizVerde alternativaPerguntaQuizVerde){
        alternativaPerguntaQuizVerde.setPerguntaQuizVerde(this);
        alternativaPerguntaQuizVerdeList.add(alternativaPerguntaQuizVerde);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPergunta() {
        return pergunta;
    }

    public void setPergunta(String pergunta) {
        this.pergunta = pergunta;
    }

    public List<AlternativaPerguntaQuizVerde> getAlternativaPerguntaQuizVerdeList() {
        return alternativaPerguntaQuizVerdeList;
    }

    public void setAlternativaPerguntaQuizVerdeList(List<AlternativaPerguntaQuizVerde> alternativaPerguntaQuizVerdeList) {
        this.alternativaPerguntaQuizVerdeList = alternativaPerguntaQuizVerdeList;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 89 * hash + this.id;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final PerguntaQuizVerde other = (PerguntaQuizVerde) obj;
        if (this.id != other.id) {
            return false;
        }
        return true;
    }
}
