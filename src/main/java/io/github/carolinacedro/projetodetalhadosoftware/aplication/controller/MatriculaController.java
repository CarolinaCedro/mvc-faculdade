package io.github.carolinacedro.projetodetalhadosoftware.aplication.controller;

import io.github.carolinacedro.projetodetalhadosoftware.aplication.datamock.Mock;
import io.github.carolinacedro.projetodetalhadosoftware.aplication.models.Aluno;
import io.github.carolinacedro.projetodetalhadosoftware.aplication.models.Curso;
import io.github.carolinacedro.projetodetalhadosoftware.aplication.models.Matricula;
import io.github.carolinacedro.projetodetalhadosoftware.aplication.service.MatriculaService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/matricula")
public class MatriculaController {

    private final MatriculaService service;

    public MatriculaController(MatriculaService service) {
        this.service = service;
    }

    private Mock mocks = new Mock();

    @PostMapping
    public Matricula createMatricula() {
        Matricula matricula = new Matricula();
        matricula.setAluno(mocks.getOneAluno());
        matricula.setCurso(mocks.getOneCurso());
        return service.createMatricula(matricula);
    }


    @GetMapping
    public List<Matricula> matriculaList() {
        return service.listMatriculas();
    }


}
