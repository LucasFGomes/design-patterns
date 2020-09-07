package template_method.exercicio;

public class Conta {
	public String titular;
	public double saldo;
	public int agencia;
	public int numero;
	
	public Conta(String titular, double saldo, int agencia, int numero) {
		super();
		this.titular = titular;
		this.saldo = saldo;
		this.agencia = agencia;
		this.numero = numero;
	}
	
	public String getTitular() {
		return titular;
	}
	public void setTitular(String titular) {
		this.titular = titular;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	public int getAgencia() {
		return agencia;
	}
	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	
}
