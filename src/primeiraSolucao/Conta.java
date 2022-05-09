package primeiraSolucao;

public class Conta {

    protected double saldo;

    public Conta() {
        this.saldo = 0;
    }
    
    public void deposita(double valor) throws Exception {
        if(valor <= 0)
            throw new Exception();    
        this.saldo += valor;
    }
    
    public double getSaldo() {
        return saldo;
    }
}
