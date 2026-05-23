package br.com.grupFly.model;


import jakarta.persistence.*;
import java.util.*;

@Entity
@Table(name = "estado")
public class Estado {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;
        private String nome;
        private String sigla;
        @ManyToOne
        @JoinColumn(name = "pais_id")
        private Pais pais;

        @OneToMany
        @JoinColumn(name ="cidades_id")
        private List<Cidade> cidade;

        Estado(){}

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSigla() {
        return sigla;
    }

    public void setSigla(String sigla) {
        this.sigla = sigla;
    }

    public List<Cidade> getCidade() {
        return cidade;
    }

    public void setCidade(List<Cidade> cidade) {
        this.cidade = cidade;
    }

    public Pais getPais() {
        return pais;
    }

    public void setPais(Pais pais) {
        this.pais = pais;
    }


}
