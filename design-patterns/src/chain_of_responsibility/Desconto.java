package chain_of_responsibility;

public interface Desconto {
	public double desconta(Orcamento orcamento);
	public void setProximo(Desconto proximoDesconto);
}
