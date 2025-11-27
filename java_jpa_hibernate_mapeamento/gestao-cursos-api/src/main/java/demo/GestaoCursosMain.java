package demo;

import entities.*;
import models.*;
import java.util.*;

public class GestaoCursosMain {
    public static void main(String[] args) {
        AlunoModel alunoModel = new AlunoModel();
        CursoModel cursoModel = new CursoModel();

        // Criar Aluno
        Aluno aluno = new Aluno();
        aluno.setNomeCompleto("João Silva");
        aluno.setMatricula("A123");
        aluno.setNascimento(new Date());
        aluno.setEmail("joao@email.com");

        Endereco endereco = new Endereco();
        endereco.setLogradouro("Rua Principal");
        endereco.setCidade("São Paulo");
        endereco.setEstado("SP");
        endereco.setCep(12345678);
        endereco.setAluno(aluno);
        aluno.getEnderecos().add(endereco);

        Telefone telefone = new Telefone();
        telefone.setDDD("11");
        telefone.setNumero("999999999");
        telefone.setAluno(aluno);
        aluno.getTelefones().add(telefone);

        alunoModel.create(aluno);

        // Criar Professor
        Professor professor = new Professor();
        professor.setNomeCompleto("Maria Souza");
        professor.setMatricula("P456");
        professor.setEmail("maria@email.com");

        // Criar Curso
        Curso curso = new Curso();
        curso.setNome("Java Avançado");
        curso.setSigla("JAVA");
        curso.setProfessor(professor);
        curso.getAlunos().add(aluno);

        MaterialCurso material = new MaterialCurso();
        material.setUrl("http://material-java.com");
        curso.setMaterialCurso(material);

        cursoModel.create(curso);

        System.out.println("Dados inseridos com sucesso!");
    }
}