package state;

public class Finalizado implements EstadoDeUmOrcamento{

	@Override
	public void aplicaDescontoExtra(Orcamento orcamento) {
		throw new RuntimeException("Orcamento finalizado não pode aplicar desconto extra!");
	}

	@Override
	public void aprova(Orcamento orcamento) {
		throw new RuntimeException("Orcamento já finalizado!");
	}

	@Override
	public void reprova(Orcamento orcamento) {
		throw new RuntimeException("Orcamento reprovado não pode ser aprovado!");
	}

	@Override
	public void finaliza(Orcamento orcamento) {
		throw new RuntimeException("Orcamento reprovado não pode ser aprovado!");
	}

}
