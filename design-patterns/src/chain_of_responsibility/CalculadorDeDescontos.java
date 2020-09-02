package chain_of_responsibility;

public class CalculadorDeDescontos {

	public double calcula(Orcamento orcamento) {
		Desconto d1 = new DescontoPorCincoItens();
		Desconto d2 = new DescontoPorMaisDeQuinhentosEMenosDeMilReais();
		Desconto d3 = new DescontoPorVendaCasada();
		Desconto d4 = new DescontoPorMaisDeMilReais();
		Desconto d5 = new SemDesconto();
		
		d1.setProximo(d2);
		d2.setProximo(d3);
		d3.setProximo(d4);
		d4.setProximo(d5);
		
		return d1.desconta(orcamento);
	}
}
