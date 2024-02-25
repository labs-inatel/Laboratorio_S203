package banco;

class ContaPoupanca extends Conta {
    @Override
    public void rentabilizar() {
        saldo += saldo * 0.02; 
    }
    
    @Override
    public String toString() {
        return "Conta Poupança: " + getSaldo();
    }
}
