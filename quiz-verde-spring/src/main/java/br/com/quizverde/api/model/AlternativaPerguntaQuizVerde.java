package br.com.quizverde.api.model;

import br.com.quizverde.api.enumerator.TipoAlternativaAcertEnum;
import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "aqv_alternativa_pergunta_quiz_verde")
public class AlternativaPerguntaQuizVerde implements Serializable {

    @Id
    @Column(name = "aqv_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @ManyToOne
    @JoinColumn(name = "pqv_id", referencedColumnName = "pqv_id", foreignKey = @ForeignKey(name = "fk_aqv_pqv_id"))
    private PerguntaQuizVerde perguntaQuizVerde;

    @Column(name = "aqv_alternativa")
    private String alternativa;

    @Enumerated(EnumType.STRING)
    @Column(name = "aqv_tipo_alternativa_acert_enum", nullable = false)
    private TipoAlternativaAcertEnum alternativaAcertEnum = TipoAlternativaAcertEnum.ALTERNATIVA_INCORRETA;

    public AlternativaPerguntaQuizVerde() {
    }

    public AlternativaPerguntaQuizVerde(String alternativa) {
        this.alternativa = alternativa;
    }

    public AlternativaPerguntaQuizVerde(String alternativa, TipoAlternativaAcertEnum alternativaAcertEnum) {
        this.alternativa = alternativa;
        this.alternativaAcertEnum = alternativaAcertEnum;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public PerguntaQuizVerde getPerguntaQuizVerde() {
        return perguntaQuizVerde;
    }

    public void setPerguntaQuizVerde(PerguntaQuizVerde perguntaQuizVerde) {
        this.perguntaQuizVerde = perguntaQuizVerde;
    }

    public String getAlternativa() {
        return alternativa;
    }

    public void setAlternativa(String alternativa) {
        this.alternativa = alternativa;
    }

    public TipoAlternativaAcertEnum getAlternativaAcertEnum() {
        return alternativaAcertEnum;
    }

    public void setAlternativaAcertEnum(TipoAlternativaAcertEnum alternativaAcertEnum) {
        this.alternativaAcertEnum = alternativaAcertEnum;
    }
}
