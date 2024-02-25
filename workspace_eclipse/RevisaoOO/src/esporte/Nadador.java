package esporte;

public class Nadador extends Atleta{
	
	public Nadador (String nome, Integer idade, Integer peso, Boolean aposentado) {
		super(nome, idade, peso, aposentado);
	}
	
	public void nadar() {
		System.out.println("Nadador nadando");
	}

}
