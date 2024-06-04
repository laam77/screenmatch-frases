package br.com.alura.screenmatch_frases.service;

import br.com.alura.screenmatch_frases.DTO.FraseDTO;
import br.com.alura.screenmatch_frases.FraseRepository;
import br.com.alura.screenmatch_frases.model.Frase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FraseService {

    @Autowired
    private FraseRepository repositorio;

    public FraseDTO obterFraseAleatoria() {
        Frase frase = repositorio.findById(4L).get();
        return  new FraseDTO(frase.getTitulo(), frase.getFrase(), frase.getPersonagem(), frase.getPoster());
    }

}
