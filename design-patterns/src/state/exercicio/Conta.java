package state.exercicio;

public class Conta {
	private double saldo;
	protected EstadoDaConta estadoAtual; 
	
	public Conta(double saldo) {
		this.saldo = saldo;
		this.defineEstadoInicial();
	}
	
	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	public void defineEstadoInicial() {
		if (this.saldo == 0) this.estadoAtual = new Neutro();
		else if (this.saldo > 0) this.estadoAtual = new Positivo();
		else if (this.saldo < 0) this.estadoAtual = new Negativo();
	}

	
	public void saca(double valor) {
		estadoAtual.saca(this, valor);
	}
	
	public void deposita(double valor) {
		estadoAtual.deposita(this, valor);
	}
	
	
}
