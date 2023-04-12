package io.github.carolinacedro.projetodetalhadosoftware.aplication.service;

import io.github.carolinacedro.projetodetalhadosoftware.aplication.models.Matricula;
import io.github.carolinacedro.projetodetalhadosoftware.aplication.repository.MatriculaRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MatriculaService {

    private final MatriculaRepository repository;

    public MatriculaService(MatriculaRepository repository) {
        this.repository = repository;
    }

    public Matricula createMatricula(Matricula matricula) {
        return repository.save(matricula);
    }

    public List<Matricula> listMatriculas() {
        return repository.findAll();
    }
}
