package builder.carro;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CarroBuilderTest {

	@Test
	void dadoPartesValidas_quandoGetCarro_entaoCarroEhConstruido() {
		Motor motorVTEC = new Motor();
		Porta portaMotorista = new Porta();
		Porta portaPassageiro = new Porta();
		Porta[] portas = {portaMotorista, portaPassageiro};
		ComputadorBordo computadorBordoSiemens = new ComputadorBordo();
		FreioABS freioBosch = new FreioABS();
		
		CarroBuilder builder = new CarroBuilder();
		/*/builder.buildMotor(motorVTEC);
		builder.buildPorta(portas);
		builder.buildComputadorBordo(computadorBordoSiemens);
		builder.buildFreioABS(freioBosch);
		Carro carroPronto = builder.getCarro(); /*/
			
		try {
		    Carro carroPronto = builder.getCarro();
		    fail("A porta deve ter uma ligação com uma exceção IllegalStateException");
		} catch (IllegalStateException e) {
		    System.out.println("Lançou a exceção como esperado");
		}

		Carro carroPronto = new CarroBuilderFluente()
			.buildPorta(portas)
			.buildMotor(motorVTEC)
			.buildComputadorBordo(computadorBordoSiemens)
			.buildFreioABS(freioBosch)
			.getCarro();

		
		assertNotNull(carroPronto);
		assertNotNull(carroPronto.getMotor());
		assertNotNull(carroPronto.getPorta());
		assertTrue(carroPronto.getPorta().length == 2);
		assertNotNull(carroPronto.getComputadorBordo());
		assertNotNull(carroPronto.getFreioABS());
		
	}

}
