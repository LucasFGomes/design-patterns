package state.exercicio;

public class Positivo implements EstadoDaConta {

	@Override
	public void saca(Conta conta, double valor) {
		conta.setSaldo(conta.getSaldo() - valor);
		
		if (conta.getSaldo() < 0) conta.estadoAtual = new Negativo(); 
	}
	
	@Override
	public void deposita(Conta conta, double valor) {
		conta.setSaldo(conta.getSaldo() + (valor * 0.98));
	}
	
}
