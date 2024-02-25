package esporte;

public class Pessoa extends Object{
	
	String nome;
	
	Integer idade;

	public Pessoa(String nome, Integer idade) {
		super();
		this.nome = nome;
		this.idade = idade;
	}
	
	public void envelhecer() {
		this.idade++;
	}
}
