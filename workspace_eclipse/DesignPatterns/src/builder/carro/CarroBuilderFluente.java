package builder.carro;

public class CarroBuilderFluente {
	private Carro carro;
	
	public CarroBuilderFluente() {
		this.carro = new Carro();
	}
	
	public CarroBuilderFluente buildPorta(Porta[]portas) {
		carro.setPorta(portas);
		return this;
	}
	
	public CarroBuilderFluente buildMotor(Motor motor) {
		carro.setMotor(motor);
		return this;
	}
	
	public CarroBuilderFluente buildComputadorBordo(ComputadorBordo cb) {
		carro.setComputadorBordo(cb);
		return this;
	}
	
	public CarroBuilderFluente buildFreioABS(FreioABS freioABS) {
		carro.setFreioABS(freioABS);
		return this;
	}

	private void validarPortas() {
		if(carro.getPorta() == null) {
			throw new IllegalStateException("Não tem portas!");
		}
		
		int numportas = carro.getPorta().length;
		if(numportas != 2 || numportas != 4) {
			throw new IllegalStateException("Número de portas inválido");
		}
		
	}
	private void validarMotor() {
		if(carro.getMotor() == null)
			throw new IllegalStateException("Não tem motor");
	}

	public Carro getCarro() {
		validarPortas();
		validarMotor();
		return carro;
	}
	
	
}
