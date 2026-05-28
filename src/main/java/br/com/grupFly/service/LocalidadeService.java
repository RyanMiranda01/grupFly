package br.com.grupFly.service;

import br.com.grupFly.model.Localidade;
import br.com.grupFly.repository.LocalidadeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LocalidadeService {

    @Autowired
    private LocalidadeRepository localidadeRepository;

    public Localidade localidade(String cidade){
        return localidadeRepository.localSelecionado(cidade);
    }
}
