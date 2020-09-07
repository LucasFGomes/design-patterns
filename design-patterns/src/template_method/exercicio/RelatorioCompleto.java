package template_method.exercicio;

import java.util.Calendar;
import java.util.List;

public class RelatorioCompleto extends Relatorio {

	@Override
	protected void cabecalho() {
		System.out.println("BANCO INTER");
		System.out.println("BELO HORIZONTE, 001");
		System.out.println("(81) 9274-9023");
	}

	@Override
	protected void rodape() {
		System.out.println("banco@banco.com");
		System.out.println(Calendar.getInstance().getTime());
	}

	@Override
	protected void corpo(List<Conta> contas) {
		for (Conta conta : contas) {
			System.out.println( conta.getTitular() + " - " + conta.getNumero() + " - " + conta.getAgencia() + " - " + conta.getSaldo());
		}
		
	}

}
