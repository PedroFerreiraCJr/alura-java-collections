package br.com.dotofcodex.alura_collections.capitulo_7.modelo;

public class Aluno {

	private String nome;
	private Integer matricula;

	public Aluno(String nome, Integer matricula) {
		super();

		if (nome == null) {
			throw new NullPointerException("Nome do aluno é obrigatório");
		}

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
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((matricula == null) ? 0 : matricula.hashCode());
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Aluno other = (Aluno) obj;
		if (matricula == null) {
			if (other.matricula != null)
				return false;
		} else if (!matricula.equals(other.matricula))
			return false;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "[Aluno: " + this.nome + ", matricula: " + this.matricula + "]";
	}
}
