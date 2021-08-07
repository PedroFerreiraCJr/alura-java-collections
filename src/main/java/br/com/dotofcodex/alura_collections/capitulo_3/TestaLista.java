package br.com.dotofcodex.alura_collections.capitulo_3;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class TestaLista {
	public static void main(String[] args) {

		System.out.println("**** ArrayList vs LinkedList ****");

		List<Integer> arrayList = new ArrayList<>();
		List<Integer> linkedList = new LinkedList<>();
		int quantidadeElementos = 10_000_000;

		long tArrayList = inserirElementosNo(arrayList, quantidadeElementos);
		long tLinkedList = inserirElementosNo(linkedList, quantidadeElementos);

		System.out.println("Inserção na ArrayList demorou  " + tArrayList);
		System.out.println("Inserção na LinkedList demorou " + tLinkedList);

		tArrayList = removerPrimeirosElementos(arrayList);
		tLinkedList = removerPrimeirosElementos(linkedList);

		System.out.println("Remoção da ArrayList demorou  " + tArrayList);
		System.out.println("Remoção da LinkedList demorou " + tLinkedList);
	}

	/*
	 * removendo 100 elementos sempre na primeira posição
	 */
	private static long removerPrimeirosElementos(List<Integer> numeros) {
		long ini = System.currentTimeMillis();

		for (int i = 0; i < 100; i++) {
			numeros.remove(0); // removendo sempre o primeiro elemento
		}
		long fim = System.currentTimeMillis();
		return fim - ini;
	}

	private static long inserirElementosNo(List<Integer> numeros, int quantidade) {
		long ini = System.currentTimeMillis();
		for (int i = 0; i < quantidade; i++) {
			numeros.add(i);
		}
		long fim = System.currentTimeMillis();
		return fim - ini;
	}
}
