package br.com.grupFly;

import br.com.grupFly.repository.LocalidadeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GrupFlyApplication implements CommandLineRunner {

    @Autowired
    LocalidadeRepository localidadeRepository;
	public static void main(String[] args) {
		SpringApplication.run(GrupFlyApplication.class, args);
	}

    @Override
    public void run(String... args) throws Exception {
        System.out.println(localidadeRepository.listaDeLocalidade("Campinas").nomeCompleto());
    }
}
