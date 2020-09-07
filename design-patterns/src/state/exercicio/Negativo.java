package state.exercicio;

public class Negativo implements EstadoDaConta {

	@Override
	public void saca(Conta conta, double valor) {
		throw new RuntimeException("Não é possível sacar. Saldo insuficiente!");
	}

	@Override
	public void deposita(Conta conta, double valor) {
		conta.setSaldo(conta.getSaldo() + (valor * 0.95));
		
		if (conta.getSaldo() > 0) conta.estadoAtual = new Positivo();
	}

	
}
