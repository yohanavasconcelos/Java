package br.com.alura;

public class Aluno implements Comparable{
	
	private String nome;
	private int numeroMatricula;
	public Aluno(String nome, int numeroMatricula) {
		if(nome == null) {
			throw new NullPointerException("nome não pode ser null");
		}
		this.nome = nome;
		this.numeroMatricula = numeroMatricula;
	}

	public String getNome() {
		return nome;
	}
	public int getNumeroMatricula() {
		return numeroMatricula;
	}
	
	@Override
	public boolean equals(Object obj) {
		Aluno outro = (Aluno) obj;
		return this.nome.equals(outro.nome);
	}
	
	@Override
	public int hashCode() {
		return this.nome.hashCode();
	}
	
	@Override
	public String toString() {
		
		return "[Aluno:" + this.nome + ", matricula:" + this.numeroMatricula + "]";
	}

	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		return 0;
	}

}
