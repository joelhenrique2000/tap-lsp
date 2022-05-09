package primeiraSolucao;
import java.util.ArrayList;

public class ProcessadorDeInvestimentos {
    public static void main(String[] args) throws Exception {
    	
        for (ContaComRendimento conta : contasDoBanco()) {
            conta.rende();
            System.out.println("Novo Saldo:");
            System.out.println(conta.getSaldo());
        }
    }
    
    static ArrayList<ContaComRendimento> contasDoBanco () throws Exception {
    	ArrayList<ContaComRendimento> contas = new ArrayList<ContaComRendimento>();
    	
    	ContaComRendimento cc1 = new ContaComum();
    	ContaComRendimento cc2 = new ContaComum();
    	ContaEstudante ce1 = new ContaEstudante();
    	ContaEstudante ce2 = new ContaEstudante();
    	
    	cc1.deposita(1000);
    	cc2.deposita(1000);
    	ce1.deposita(1000);
    	ce2.deposita(1000);
    	
    	contas.add(cc1);
    	contas.add(cc2);
    	
    	// Não pode inserir ContaEstudante pois a mesma não conhece a ContaComRedimento
    	//contas.add(ce1);
    	//contas.add(ce2);
    	
    	return contas;
    }
}