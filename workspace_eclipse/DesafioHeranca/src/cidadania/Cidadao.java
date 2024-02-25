package cidadania;

public class Cidadao extends Pessoa{

	private String cpf;

	public Cidadao(String nome, String sexo, Integer idade, String cpf) {
		super(nome, sexo, idade);
		this.cpf = cpf;
	}
	
	@Override
    public void informacoes() {
        super.informacoes();
        System.out.println("CPF: " + cpf);
    }
	
    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

}
