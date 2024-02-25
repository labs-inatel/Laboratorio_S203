package builder.carro;

public class CarroBuilder {
	private Carro carro;
	
	public CarroBuilder() {
		this.carro = new Carro();
	}
	
	public void buildPorta(Porta[] portas) {
		carro.setPorta(portas);
	}
	public void buildMotor(Motor motor) {
		carro.setMotor(motor);
	}
	public void buildComputadorBordo(ComputadorBordo cb) {
		carro.setComputadorBordo(cb);
	}
	public void buildFreioABS(FreioABS freio) {
		carro.setFreioABS(freio);
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
