package strategy.frete;

public class ServicoFreteSedex implements Fretavel{

	@Override
	public double getFrete(double pesoEmKg) {
		if(pesoEmKg < 30.00) {
			return 0.00;
		} else {
			return 150.00;
		}
	}

}
