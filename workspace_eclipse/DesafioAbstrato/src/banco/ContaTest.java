package banco;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ContaTest {

    @Test
    public void testaContaCorrente() {
        Conta cc = new ContaCorrente();
        cc.depositar(110.00);
        cc.sacar(10.00);
        cc.rentabilizar();
        Double saldoAtual = cc.saldo;
        System.out.println("Saldo atual: " + saldoAtual);
        Double saldoEsperado = 101.00;
        assertEquals(saldoAtual, saldoEsperado);
    }

    @Test
    public void testaContaPoupanca() {
        Conta cp = new ContaPoupanca();
        cp.depositar(1100.00);
        cp.sacar(100.00);
        cp.rentabilizar();
        Double saldoAtual = cp.saldo;
        System.out.println("Saldo atual: " + saldoAtual);
        Double saldoEsperado = 1020.00;
        assertEquals(saldoAtual, saldoEsperado);
    }
}
