package primeiraSolucao;

public class ContaComum extends ContaComRendimento {

    public ContaComum() {
    }

	@Override
	public void rende() {
        this.saldo*= 1.1;
	}

}

