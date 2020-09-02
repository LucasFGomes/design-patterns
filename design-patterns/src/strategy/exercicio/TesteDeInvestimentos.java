package strategy.exercicio;

public class TesteDeInvestimentos {
	public static void main(String[] args) {
		
		Conta conta = new Conta(1500);
		
		Investimento moderado = new Moderado();
		Investimento conservador = new Conservador();
		Investimento arrojado = new Arrojado();
		
		
		RealizadorDeInvestimentos realizador = new RealizadorDeInvestimentos();
		
		realizador.realiza(conta, moderado);
		realizador.realiza(conta, conservador);
		realizador.realiza(conta, arrojado);
		
	}
}
