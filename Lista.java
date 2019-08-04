package aula1;

public class Lista {
	
	private String nome;
	private int idade;
	private int peso;
	private int senha;
	
	public Lista() {
	}

	public Lista(String nome, int idade, int peso, int senha) {
	super();
	this.nome = nome;
	this.idade = idade;
	this.peso = peso;
	this.senha = senha;
	}

	public String getNome() {
	return nome;
	}

	public void setNome(String nome) {
	this.nome = nome;
	}

	public int getIdade() {
	return idade;
	}

	public void setIdade(int idade) {
	this.idade = idade;
	}

	public int getPeso() {
	return peso;
	}

	public void setPeso(int peso) {
	this.peso = peso;
	}

	public int getSenha() {
	return senha;
	}

	public void setSenha(int senha) {
	this.senha = senha;
	}
	
	public void mostraReferencia () {

        System.out.println("Referencia chamada internamente: " + this);
   }
}
