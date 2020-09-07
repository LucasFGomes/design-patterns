package state.exercicio;

public class TesteSaqueEDeposito {

	public static void main(String[] args) {
		
		Conta conta = new Conta(1000.0);
		
		conta.saca(500);
		
		System.out.println(conta.getSaldo());
		
		conta.saca(600);
		
		System.out.println(conta.getSaldo());
		
		conta.saca(50);
		
		System.out.println(conta.getSaldo());
		
		
		
	}

}
