package br.com.alura;

import java.util.Map;
import java.util.Set;

public class TestaBuscaAlunosNoCurso {
	public static void main(String[] args) {
		Curso javaColecoes = new Curso("Dominando as coleções do java",
				"Paulo Silveira");
		
		
		javaColecoes.adiciona(new Aula("Trabalhando com ArrayLIst", 21));
		javaColecoes.adiciona(new Aula("Criando uma aula", 20));
		javaColecoes.adiciona(new Aula("Modelando com coleções", 24));
		
		Aluno a1 = new Aluno("Rodrigo Turini", 34672);
		Aluno a2 = new Aluno("Guilherme Silveira", 5617);
		Aluno a3 = new Aluno("Mauricio Aniche", 17645);
		Aluno a4 = new Aluno("Paulo Silveira", 17645);
		
		javaColecoes.matricular(a1);
		javaColecoes.matricular(a2);
		javaColecoes.matricular(a3);
		javaColecoes.matricular(a4);
		
		System.out.println(javaColecoes.getAlunos());
		System.out.println("Quem é o aluno com a matricula 17645?");
		Aluno aluno = javaColecoes.buscaMatriculado(17645);
		System.out.println("aluno: " + aluno);
		
		Map<Integer, Set<Aluno>> matriculaParaAlunos;
	}



}
