package state.exercicio;

public class Neutro implements EstadoDaConta {

	@Override
	public void saca(Conta conta, double valor) {
		throw new RuntimeException("Não é possível sacar. Saldo insuficiente!");
	}

	@Override
	public void deposita(Conta conta, double valor) {
		conta.setSaldo(conta.getSaldo() + valor);
		
		if (conta.getSaldo() > 0) conta.estadoAtual = new Positivo();
	}

}
