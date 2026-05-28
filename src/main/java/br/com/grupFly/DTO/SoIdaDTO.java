package br.com.grupFly.DTO;

import br.com.grupFly.model.ClasseVoo;
import br.com.grupFly.model.Localidade;
import jakarta.persistence.*;

import java.time.LocalDate;

public record SoIdaDTO(
                        Localidade origem,
                        Localidade destino,
                        LocalDate dataIda,
                        ClasseVoo classe,
                        Integer adultos,
                        Integer crianças,
                        Integer bebes

) {
}
