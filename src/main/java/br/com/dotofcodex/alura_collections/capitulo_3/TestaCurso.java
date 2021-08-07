package br.com.dotofcodex.alura_collections.capitulo_3;

import br.com.dotofcodex.alura_collections.capitulo_2.modelo.Aula;
import br.com.dotofcodex.alura_collections.capitulo_3.modelo.Curso;

public class TestaCurso {
	public static void main(String[] args) {
		Curso javaColecoes = new Curso("Dominando as coleções com Java", "Paulo Silveira");
		javaColecoes.adicionar(new Aula("Trabalhando com ArrayList", 20));
		javaColecoes.adicionar(new Aula("Criando uma Aula", 20));
		javaColecoes.adicionar(new Aula("Modelando com coleções", 20));
		System.out.println(javaColecoes.getAulas());
	}
}
