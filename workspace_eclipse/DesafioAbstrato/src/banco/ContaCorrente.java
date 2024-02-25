package banco;

class ContaCorrente extends Conta {
    @Override
    public void rentabilizar() {
        saldo += saldo * 0.01; 
    }
}