package br.com.dotofcodex.alura_collections.capitulo_6.modelo;

public class Aluno {

	private String nome;
	private Integer matricula;

	public Aluno(String nome, Integer matricula) {
		super();
		this.nome = nome;
		this.matricula = matricula;
	}

	public String getNome() {
		return nome;
	}

	public Integer getMatricula() {
		return matricula;
	}

	@Override
	public String toString() {
		return "[Aluno: " + this.nome + ", matricula: " + this.matricula + "]";
	}
}
