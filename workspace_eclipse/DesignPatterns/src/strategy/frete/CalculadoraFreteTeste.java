package strategy.frete;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class CalculadoraFreteTeste {

    @Test
    void deveCalcularFreteParaSedex() {
        CalculadoraFrete calculadora = new CalculadoraFrete();
        Fretavel fretavel = new ServicoFreteSedex();
        double valorFrete = calculadora.calcularValor(fretavel, 5.0);
        assertEquals(50.00, valorFrete, 0.01);
    }

    @Test
    void deveCalcularFreteParaDHL() {
        CalculadoraFrete calculadora = new CalculadoraFrete();
        Fretavel fretavel = new ServicoFreteDHL();
        double valorFrete = calculadora.calcularValor(fretavel, 15.0);
        assertEquals(100.00, valorFrete, 0.01);
    }

    @Test
    void deveCalcularFreteParaJadLog() {
        CalculadoraFrete calculadora = new CalculadoraFrete();
        Fretavel fretavel = new ServicoFreteJadLog();
        double valorFrete = calculadora.calcularValor(fretavel, 25.0);
        assertEquals(0.00, valorFrete, 0.01);
    }

    @Test
    void deveLancarExceptionParaServicoDesconhecido() {
        CalculadoraFrete calculadora = new CalculadoraFrete();
        assertThrows(RuntimeException.class, () -> calculadora.calcularValor(null, 10.0));
    }
}
