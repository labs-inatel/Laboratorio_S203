package banco;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ContaTest {   
    @Test 
    void testPolimorfismo() {
    	
    	
    	boolean flagCorrente = false;
    	
    	Conta conta = null;
    	if(flagCorrente) {
    		conta = new ContaCorrente();
        }else {
        	conta = new ContaPoupanca();
        }
    	
    	Conta conta1 = new ContaCorrente();
    	
        conta1.depositar(100.00);
        conta1.sacar(10.0);
        conta.rentabilizar();
        
        String str = conta1.toString();
        System.out.println(str);
        System.out.println(conta.getClass().getName());
        System.out.println(conta.saldo);;
    }
}
