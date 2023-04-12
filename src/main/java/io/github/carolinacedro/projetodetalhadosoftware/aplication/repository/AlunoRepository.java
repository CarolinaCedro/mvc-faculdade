package io.github.carolinacedro.projetodetalhadosoftware.aplication.repository;

import io.github.carolinacedro.projetodetalhadosoftware.aplication.models.Aluno;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AlunoRepository extends JpaRepository<Aluno, Long> {
}
