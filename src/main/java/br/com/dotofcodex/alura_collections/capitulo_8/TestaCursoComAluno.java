package br.com.dotofcodex.alura_collections.capitulo_8;

import java.util.Iterator;
import java.util.Set;

import br.com.dotofcodex.alura_collections.capitulo_2.modelo.Aula;
import br.com.dotofcodex.alura_collections.capitulo_7.modelo.Aluno;
import br.com.dotofcodex.alura_collections.capitulo_7.modelo.Curso;

public class TestaCursoComAluno {
	public static void main(String[] args) {
		Curso javaColecoes = new Curso("Dominando as coleções do Java", "Paulo Silveira");
		javaColecoes.adicionar(new Aula("Trabalhando com ArrayList", 20));
		javaColecoes.adicionar(new Aula("Criando a Aula", 20));
		javaColecoes.adicionar(new Aula("Modelando as coleções", 24));

		Aluno a1 = new Aluno("Rodrigo Turini", 34672);
		Aluno a2 = new Aluno("Guilherme Silveira", 5617);
		Aluno a3 = new Aluno("Mauricio Aniche", 17645);

		javaColecoes.matricular(a1);
		javaColecoes.matricular(a2);
		javaColecoes.matricular(a3);

		System.out.println("Todos os alunos matriculados: ");
		// forma antiga de iterar sobre uma coleção, seja ela qual for
		Set<Aluno> alunos = javaColecoes.getAlunos();
		Iterator<Aluno> iterador = alunos.iterator();
		while (iterador.hasNext()) {
			Aluno aluno = iterador.next();
			System.out.println(aluno);
		}

		//javaColecoes.getAlunos().forEach(System.out::println);

		boolean esta = javaColecoes.estaMatriculado(new Aluno("Rodrigo Turini", 34672));
		System.out.println(esta);
	}
}
