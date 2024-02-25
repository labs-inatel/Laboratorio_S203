package strategy.frete;

public class CalculadoraFrete {
	public double calcularValor(Fretavel fretavel, double pesoEmKg) {
		return fretavel.getFrete(pesoEmKg);
	}
	
	 public double calcular_Valor(String servico, double pesoEmKg) {
	        if ("sedex".equals(servico)) {
	            if (pesoEmKg < 10.0) {
	                return 50.00;
	            } else if (pesoEmKg < 20.0) {
	                return 70.00;
	            } else {
	                return 90.00;
	            }
	        } else if ("dhl".equals(servico)) {
	            if (pesoEmKg < 20.0) {
	                return 100.00;
	            } else {
	                return 90.00;
	            }
	        } else if ("jadlog".equals(servico)) {
	            if (pesoEmKg < 30.0) {
	                return 0.00;
	            } else {
	                return 150.00;
	            }
	        } else {
	            throw new RuntimeException("Serviço desconhecido: " + servico);
	        }
	    }
}
