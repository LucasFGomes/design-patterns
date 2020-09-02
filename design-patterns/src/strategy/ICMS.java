package strategy;

public class ICMS implements Imposto {

	@Override
	public double calcula(Orcamento orcamento) {
		return (orcamento.valor * 0.05) + 50.0;
	}

	
}
