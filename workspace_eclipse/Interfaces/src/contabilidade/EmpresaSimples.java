package contabilidade;

public class EmpresaSimples implements Tributavel{
	Double faturamentoMensal;

	public EmpresaSimples(Double faturamentoMensal) {
		super();
		this.faturamentoMensal = faturamentoMensal;
	}
	
    @Override
	public Double getValorIR() {
	    return faturamentoMensal * 0.15;
	}

	@Override
	public Double getValorISS() {
	    return faturamentoMensal * 0.08;
	}
}
