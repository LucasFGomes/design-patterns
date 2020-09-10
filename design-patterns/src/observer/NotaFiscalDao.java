package observer;

public class NotaFiscalDao implements AcaoAposGerarNota{

	@Override
	public void executa(NotaFiscal notaFiscal) {
		System.out.println("Salvei no banco.");
	}

}
