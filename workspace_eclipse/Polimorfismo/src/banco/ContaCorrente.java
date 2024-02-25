package banco;

class ContaCorrente extends Conta {
    @Override
    public void rentabilizar() {
        saldo += saldo * 0.01; 
    }
    
    @Override
    public String toString() {
        return "Conta Corrente: " + getSaldo();
    }
}