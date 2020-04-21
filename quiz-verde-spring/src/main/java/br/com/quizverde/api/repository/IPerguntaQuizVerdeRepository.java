package br.com.quizverde.api.repository;

import br.com.quizverde.api.model.PerguntaQuizVerde;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IPerguntaQuizVerdeRepository extends JpaRepository<PerguntaQuizVerde, Integer> {
    
}
