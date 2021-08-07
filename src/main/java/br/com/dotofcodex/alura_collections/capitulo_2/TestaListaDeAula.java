package br.com.dotofcodex.alura_collections.capitulo_2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import br.com.dotofcodex.alura_collections.capitulo_2.modelo.Aula;

public class TestaListaDeAula {
	public static void main(String[] args) {
		Aula aula1 = new Aula("Revisitando ArrayLists", 21);
		Aula aula2 = new Aula("Listas de objetos", 20);
		Aula aula3 = new Aula("Relacionamento de listas e objetos", 15);
		
		ArrayList<Aula> aulas = new ArrayList<>();
		aulas.add(aula1);
		aulas.add(aula2);
		aulas.add(aula3);
		
		System.out.println(aulas);
		
		Collections.sort(aulas);
		System.out.println(aulas);
		
		Collections.sort(aulas, Comparator.comparing(Aula::getTempo));
		// a partir do Java 1.8
		aulas.sort(Comparator.comparing(Aula::getTempo));
	}
}
