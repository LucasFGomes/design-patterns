package observer;

import java.util.ArrayList;
import java.util.List;

public class TestaAcoes {

	public static void main(String[] args) {

		List<AcaoAposGerarNota> listaDeAcoes = new ArrayList<AcaoAposGerarNota>();
		
		listaDeAcoes.add(new EnviadorDeEmail());
		listaDeAcoes.add(new NotaFiscalDao());
		listaDeAcoes.add(new EnviadorDeSms());
		listaDeAcoes.add(new Impressora());
		listaDeAcoes.add(new Multiplicador(5));
		
		NotaFiscalBuilder builder = new NotaFiscalBuilder(listaDeAcoes);

		NotaFiscal notaFiscal = builder.paraEmpresa("Joao da barraca")
								.comCnpj("12948.2321/0001-23")
								.com(new ItemDaNota("Item 1", 200.0))
								.comObservacoes("obs qualquer")
								.constroi();
		
		System.out.println(notaFiscal.getValorBruto());

	}

}
