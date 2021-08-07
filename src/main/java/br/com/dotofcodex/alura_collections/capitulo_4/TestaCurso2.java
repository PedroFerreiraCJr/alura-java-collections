package br.com.dotofcodex.alura_collections.capitulo_4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import br.com.dotofcodex.alura_collections.capitulo_2.modelo.Aula;
import br.com.dotofcodex.alura_collections.capitulo_3.modelo.Curso;

public class TestaCurso2 {
	public static void main(String[] args) {
		Curso javaColecoes = new Curso("Dominando as coleções do Java", "Paulo Silveira");
		javaColecoes.adicionar(new Aula("Trabalhando com ArrayList", 20));
		javaColecoes.adicionar(new Aula("Criando a Aula", 20));
		javaColecoes.adicionar(new Aula("Modelando as coleções", 24));

		List<Aula> aulasImutaveis = javaColecoes.getAulas();
		System.out.println(aulasImutaveis);
		
		List<Aula> aulasMutaveis = new ArrayList<>(aulasImutaveis);
		Collections.sort(aulasMutaveis);
		
		System.out.println(javaColecoes.getTempoTotal());
	}
}
