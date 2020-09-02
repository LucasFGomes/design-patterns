package strategy;

public class CalculadorDeImpostos {

	public void realizaCalculo(Orcamento orcamento, Imposto imposto) {
		double impostoCalculado = imposto.calcula(orcamento);
		System.out.println(impostoCalculado);
	}

}
