package io.github.carolinacedro.projetodetalhadosoftware.aplication.repository;

import io.github.carolinacedro.projetodetalhadosoftware.aplication.models.Aluno;
import io.github.carolinacedro.projetodetalhadosoftware.aplication.models.Curso;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CursoRepository extends JpaRepository<Curso, Long> {
}
