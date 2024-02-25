package banco;

abstract class Conta {
    protected Double saldo = 0.0;

    public abstract void rentabilizar();

    public void depositar(Double valor) {
        saldo += valor;
    }

    public void sacar(Double valor) {
        saldo -= valor;
    }
    
    @Override
    public String toString() {
    	return "Conta [saldo = " + saldo + "]";
    }

	public Double getSaldo() {
		return saldo;
	}
    
    
}
