package br.com.dotofcodex.alura_collections.capitulo_9.modelo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

import br.com.dotofcodex.alura_collections.capitulo_2.modelo.Aula;
import br.com.dotofcodex.alura_collections.capitulo_7.modelo.Aluno;

public class Curso {
	private String nome;
	private String instrutor;
	private List<Aula> aulas = new ArrayList<>();
	// implementações da interface Set: HashSet, LinkedHashSet, TreeSet (para usar
	// essa implementação de Set, é necessário
	// que os elementos implementem a interface Comparable).
	// opcionalmente, para a classe TreeSet, é possível passar uma implementação de
	// Comparator no construtor
	private Set<Aluno> alunos = new HashSet<>();
	// outra implementação é o LinkedHashMap, e Hashtable (que é Thread-Safe)
	private Map<Integer, Aluno> matriculaParaAluno = new HashMap<Integer, Aluno>();

	public Curso(String nome, String instrutor) {
		super();
		this.nome = nome;
		this.instrutor = instrutor;
	}

	public String getNome() {
		return nome;
	}

	public String getInstrutor() {
		return instrutor;
	}

	public List<Aula> getAulas() {
		return Collections.unmodifiableList(aulas);
	}

	public void adicionar(Aula aula) {
		this.aulas.add(aula);
	}

	public int getTempoTotal() {
		return this.aulas.stream().mapToInt(Aula::getTempo).sum();
	}

	public Set<Aluno> getAlunos() {
		return Collections.unmodifiableSet(alunos);
	}

	@Override
	public String toString() {
		return "[Curso: " + this.nome + ", tempo total: " + this.getTempoTotal() + "]";
	}

	public void matricular(Aluno aluno) {
		this.alunos.add(aluno);
		this.matriculaParaAluno.put(aluno.getMatricula(), aluno);
	}

	public boolean estaMatriculado(Aluno aluno) {
		return this.alunos.contains(aluno);
	}

	public Aluno buscarMatricula(Integer matricula) {
		return matriculaParaAluno.get(matricula);
	}
}
