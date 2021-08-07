package br.com.dotofcodex.alura_collections.capitulo_5;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class TestaAluno {
	public static void main(String[] args) {
		// um conjunto não mantem uma ordem dos elementos
		// as implementações padrões disponibilizadas pelo JDK de Sets, não permitem valores duplicados
		// a principal vantagem de utilizar o Set é que ele é mais performático
		// o principal motivo das implementações de Set serem mais rápidas é devido ao algoritmo utilizado, por exemplo
		//a implementação HashSet de Set, utiliza um algoritmo de Hashing para pesquisar os elementos no Set
		Set<String> alunos = new HashSet<>();
		alunos.add("Rodrigo Turini");
		alunos.add("Alberto Souza");
		alunos.add("Nico Steppat");
		alunos.add("Sergio Lopes");
		alunos.add("Renan Saggio");
		alunos.add("Mauricio Aniche");
		
		System.out.println("Aluno foi adicionado: " + alunos.add("Mauricio Aniche"));
		
		boolean pauloEstaMatriculado = alunos.contains("Paulo Silveira");
		System.out.println("Aluno está contido? " + pauloEstaMatriculado);
		
		System.out.println("Tamanho do Set de elementos: " + alunos.size());
		
		System.out.println("Foreach: ");
		for (String aluno : alunos) {
			System.out.println(aluno);
		}
		System.out.println();
		
		System.out.println("Foreach lambda");
		alunos.forEach(System.out::println);
		
		// Collections.sort só funciona com List
		List<String> alunosEmLista = new ArrayList<>(alunos);
		System.out.println(alunosEmLista);
		
		tempoExecucaoArrayList();
		tempoExecucaoHashSet();
	}
	
	private static void tempoExecucaoArrayList() {
        Collection<Integer> numeros = new ArrayList<Integer>();

        long inicio = System.currentTimeMillis();
        for (int i = 1; i <= 50_000; i++) {
            numeros.add(i);
        }

        for (Integer numero : numeros) {
            numeros.contains(numero);
        }

        long fim = System.currentTimeMillis();

        long tempoDeExecucao = fim - inicio;

        System.out.println("Tempo gasto: " + tempoDeExecucao);
	}
	
	private static void tempoExecucaoHashSet() {
        Collection<Integer> numeros = new HashSet<Integer>();

        long inicio = System.currentTimeMillis();
        for (int i = 1; i <= 50_000; i++) {
            numeros.add(i);
        }

        for (Integer numero : numeros) {
            numeros.contains(numero);
        }

        long fim = System.currentTimeMillis();

        long tempoDeExecucao = fim - inicio;

        System.out.println("Tempo gasto: " + tempoDeExecucao);
	}
}
