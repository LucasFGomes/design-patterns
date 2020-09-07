package state;

public class Reprovado implements EstadoDeUmOrcamento {

	@Override
	public void aplicaDescontoExtra(Orcamento orcamento) {
		throw new RuntimeException("Orcamento reprovado não pode aplicar desconto extra!");
	}

	@Override
	public void aprova(Orcamento orcamento) {
		throw new RuntimeException("Orcamento reprovado não pode ser aprovado!");
	}

	@Override
	public void reprova(Orcamento orcamento) {
		throw new RuntimeException("Orcamento já está reprovado!");
	}

	@Override
	public void finaliza(Orcamento orcamento) {
		orcamento.estadoAtual = new Finalizado();
	}

}
