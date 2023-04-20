package br.com.alura;

import java.util.Collections;
import java.util.List;

public class TestaCurso {

	public static void main(String[] args) {
		Curso javaColecoes = new Curso("Dominando as coleções do java",
				"Paulo Silveira");
		
		
		javaColecoes.adiciona(new Aula("Trabalhando com ArrayLIst", 21));
		javaColecoes.adiciona(new Aula("Criando uma aula", 20));
		javaColecoes.adiciona(new Aula("Modelando com coleções", 22));
		
	
		System.out.println(javaColecoes.getAulas());
		
		
		
	}

}
