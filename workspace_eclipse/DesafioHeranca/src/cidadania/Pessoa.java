package cidadania;

public class Pessoa extends Object{
	
	protected String nome;
	protected String sexo;
	protected Integer idade;

	public Pessoa(String nome, String sexo, Integer idade) {
		super();
		this.nome = nome;
		this.sexo = sexo;
		this.idade = idade;
	}
	
	public void informacoes() {
        System.out.println("Nome: " + nome);
        System.out.println("Sexo: " + sexo);
        System.out.println("Idade: " + idade);
    }
}
