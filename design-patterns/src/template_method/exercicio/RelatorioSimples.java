package template_method.exercicio;

import java.util.List;

public class RelatorioSimples extends Relatorio {

	@Override
	protected void cabecalho() {
		System.out.println("BANCO INTER");
	}

	@Override
	protected void rodape() {
		System.out.println("(81) 9274-9023");
	}

	@Override
	protected void corpo(List<Conta> contas) {
		for (Conta conta : contas) {
			System.out.println(conta.getTitular() + " - " + conta.getSaldo());
		}
	}

}
