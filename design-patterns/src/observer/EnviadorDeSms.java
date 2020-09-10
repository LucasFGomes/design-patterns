package observer;

public class EnviadorDeSms implements AcaoAposGerarNota{

	@Override
	public void executa(NotaFiscal notaFiscal) {
		System.out.println("Enviei um sms.");
	}

}
