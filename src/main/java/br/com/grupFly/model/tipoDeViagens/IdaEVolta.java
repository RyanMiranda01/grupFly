package br.com.grupFly.model.tipoDeViagens;

import br.com.grupFly.model.ClasseVoo;
import br.com.grupFly.model.Localidade;
import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "ida_e_volta")
public class IdaEVolta {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne
    @JoinColumn(name = "origem_id")
    private Localidade origem;

    @OneToOne
    @JoinColumn(name = "desino_id")
    private Localidade desino;

    private LocalDate dataIda;

    private LocalDate dataVola;

    @Enumerated(EnumType.STRING)
    private ClasseVoo classe;

    private Integer adultos;

    private Integer crianças;

    private Integer bebes;

    IdaEVolta(){}

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Localidade getOrigem() {
        return origem;
    }

    public void setOrigem(Localidade origem) {
        this.origem = origem;
    }

    public Localidade getDesino() {
        return desino;
    }

    public void setDesino(Localidade desino) {
        this.desino = desino;
    }

    public LocalDate getDataIda() {
        return dataIda;
    }

    public void setDataIda(LocalDate dataIda) {
        this.dataIda = dataIda;
    }

    public LocalDate getDataVola() {
        return dataVola;
    }

    public void setDataVola(LocalDate dataVola) {
        this.dataVola = dataVola;
    }

    public ClasseVoo getClasse() {
        return classe;
    }

    public void setClasse(ClasseVoo classe) {
        this.classe = classe;
    }

    public Integer getAdultos() {
        return adultos;
    }

    public void setAdultos(Integer adultos) {
        this.adultos = adultos;
    }

    public Integer getCrianças() {
        return crianças;
    }

    public void setCrianças(Integer crianças) {
        this.crianças = crianças;
    }

    public Integer getBebes() {
        return bebes;
    }

    public void setBebes(Integer bebes) {
        this.bebes = bebes;
    }
}
