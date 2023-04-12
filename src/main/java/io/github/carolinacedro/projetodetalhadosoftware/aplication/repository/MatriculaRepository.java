package io.github.carolinacedro.projetodetalhadosoftware.aplication.repository;

import io.github.carolinacedro.projetodetalhadosoftware.aplication.models.Curso;
import io.github.carolinacedro.projetodetalhadosoftware.aplication.models.Matricula;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MatriculaRepository extends JpaRepository<Matricula, Long> {
}
