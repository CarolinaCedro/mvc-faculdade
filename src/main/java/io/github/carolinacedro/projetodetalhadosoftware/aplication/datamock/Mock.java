package io.github.carolinacedro.projetodetalhadosoftware.aplication.datamock;

import io.github.carolinacedro.projetodetalhadosoftware.aplication.models.Aluno;
import io.github.carolinacedro.projetodetalhadosoftware.aplication.models.Curso;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;


public class Mock {

    private Aluno aluno;
    private Curso curso;

    private List<Aluno> alunoList = new ArrayList<>();
    private List<Curso> cursos = new ArrayList<>();

    Aluno aluno01 = new Aluno(1l, "Carolina Cedro", "carolina@email.com", new Date());
    Aluno aluno02 = new Aluno(2l, "Carlos", "carlos@email.com", new Date());
    Aluno aluno03 = new Aluno(3l, "Valdemar", "waldermar@email.com", new Date());

    Curso curso01 = new Curso(1l, "Ciencia da Computação");
    Curso curso02 = new Curso(1l, "Engenharia de Software");


    public Aluno getOneAluno() {
        return this.aluno01;
    }

    public Curso getOneCurso() {
        return this.curso01;
    }

    public Aluno getOneAluno2() {
        return this.aluno02;
    }

    public Curso getOneCurso2() {
        return this.curso02;
    }

    public List<Aluno> alunoList() {
        alunoList.add(aluno01);
        alunoList.add(aluno02);
        alunoList.add(aluno03);
        return alunoList;
    }

    public List<Curso> cursoList() {
        cursos.add(curso01);
        cursos.add(curso02);
        return cursos;
    }
}
