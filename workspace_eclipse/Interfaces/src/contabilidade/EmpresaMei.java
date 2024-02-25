package contabilidade;

public class EmpresaMei implements Tributavel{
	Double faturamentoMensal;

	public EmpresaMei(Double faturamentoMensal) {
		super();
		this.faturamentoMensal = faturamentoMensal;
	}
	
    @Override
    public Double getValorIR() {
        return faturamentoMensal * 0.275;
    }

    @Override
    public Double getValorISS() {
        return 0.0;
    }
}
