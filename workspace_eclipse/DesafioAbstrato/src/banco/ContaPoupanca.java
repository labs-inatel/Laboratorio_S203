package banco;

class ContaPoupanca extends Conta {
    @Override
    public void rentabilizar() {
        saldo += saldo * 0.02; 
    }
}