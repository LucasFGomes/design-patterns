package state;

public class DescontoPorMaisDeMilReais implements Desconto {

	private Desconto proximo;

	@Override
	public double desconta(Orcamento orcamento) {
		if (orcamento.getValor() > 1000.0) {
			return orcamento.getValor() * 0.09;
		}
		return proximo.desconta(orcamento);
	}

	@Override
	public void setProximo(Desconto proximoDesconto) {
		this.proximo = proximoDesconto;
	}

}
