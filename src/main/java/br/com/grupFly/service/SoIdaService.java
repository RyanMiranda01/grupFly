package br.com.grupFly.service;

import br.com.grupFly.model.tipoDeViagens.SoIda;
import br.com.grupFly.repository.SoIdaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SoIdaService {

    @Autowired
    private SoIdaRepository soIdaRepository;

}
