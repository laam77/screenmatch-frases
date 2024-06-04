package br.com.alura.screenmatch_frases;

import br.com.alura.screenmatch_frases.model.Frase;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FraseRepository extends JpaRepository<Frase, Long> {
}
