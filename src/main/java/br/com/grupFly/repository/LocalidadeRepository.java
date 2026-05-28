package br.com.grupFly.repository;

import br.com.grupFly.model.Localidade;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;


public interface LocalidadeRepository extends JpaRepository<Localidade, Long> {

    @Query(value = """
    SELECT 
        l.*
    FROM localidade l

    INNER JOIN pais p 
        ON l.pais_id = p.id

    INNER JOIN estado e 
        ON l.estado_id = e.id

    INNER JOIN cidade c 
        ON l.cidade_id = c.id

    LEFT JOIN aeroporto a 
        ON c.id = a.cidade_id

    WHERE c.nome = :cidade
    """, nativeQuery = true)

    Localidade localSelecionado(@Param("cidade") String cidade);
}
