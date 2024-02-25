package contabilidade;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestContabilidade {

	@Test
	void testEmpresaMEI() {
		EmpresaMei empMei = new EmpresaMei(10000.0);

        System.out.println("Faturamento mensal da Empresa MEI: " + empMei.faturamentoMensal);
        System.out.println("Imposto IR: " + empMei.getValorIR());
        System.out.println("Imposto ISS: " + empMei.getValorISS());
	}
	
	@Test
	void testEmpresaSimples() {
		EmpresaSimples empSimples = new EmpresaSimples(20000.0);

        System.out.println("\nFaturamento mensal da Empresa Simples: " + empSimples.faturamentoMensal);
        System.out.println("Imposto IR: " + empSimples.getValorIR());
        System.out.println("Imposto ISS: " + empSimples.getValorISS());
	}
}
