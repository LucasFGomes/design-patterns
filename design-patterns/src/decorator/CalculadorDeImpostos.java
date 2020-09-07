package decorator;

public class CalculadorDeImpostos {

	public void realizaCalculo(Orcamento orcamento, Imposto imposto) {
		double impostoCalculado = imposto.calcula(orcamento);
		System.out.printf("Valor do Imposto: %.2f \n", impostoCalculado);
	}

}
