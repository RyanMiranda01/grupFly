package br.com.grupFly.model.tipoDeViagens;

import br.com.grupFly.model.ClasseVoo;
import br.com.grupFly.model.Localidade;
import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "so_ida")
public class SoIda {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @OneToOne
    @JoinColumn(name = "origem_id")
    private Localidade origem;

    @OneToOne
    @JoinColumn(name = "destino_id")
    private Localidade destino;

    private LocalDate dataIda;

    @Enumerated(EnumType.STRING)
    private ClasseVoo classe;

    private Integer adultos;

    private Integer crianças;

    private Integer bebes;


    SoIda(){}

    public Localidade getDestino() {
        return destino;
    }

    public void setDestino(Localidade destino) {
        this.destino = destino;
    }

    public Localidade getOrigem() {
        return origem;
    }

    public void setOrigem(Localidade origem) {
        this.origem = origem;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public LocalDate getDataIda() {
        return dataIda;
    }

    public void setDataIda(LocalDate dataIda) {
        this.dataIda = dataIda;
    }
}
