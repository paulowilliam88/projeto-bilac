package br.com.consultamed.api.model;

import br.com.consultamed.api.enumerator.TipoAgendamentoEnum;
import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "agn_agenda")
public class Agenda implements Serializable {

    @Id
    @Column(name = "agn_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Enumerated(EnumType.STRING)
    @Column(name = "agn_agenda")
    private TipoAgendamentoEnum tipoAgendamentoEnum;

    @Column(name = "agn_pessoa")
    private String pessoa;

    @Column(name = "agn_profissional")
    private String profissional;

    @Column(name = "agn_especialidade")
    private String especialidade;

    @Column(name = "agn_data_hora")
    private String dataHora;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public TipoAgendamentoEnum getTipoAgendamentoEnum() {
        return tipoAgendamentoEnum;
    }

    public void setTipoAgendamentoEnum(TipoAgendamentoEnum tipoAgendamentoEnum) {
        this.tipoAgendamentoEnum = tipoAgendamentoEnum;
    }

    public String getPessoa() {
        return pessoa;
    }

    public void setPessoa(String pessoa) {
        this.pessoa = pessoa;
    }

    public String getProfissional() {
        return profissional;
    }

    public void setProfissional(String profissional) {
        this.profissional = profissional;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public String getDataHora() {
        return dataHora;
    }

    public void setDataHora(String dataHora) {
        this.dataHora = dataHora;
    }
}
