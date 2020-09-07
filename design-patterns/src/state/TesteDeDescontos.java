package state;

public class TesteDeDescontos {

	public static void main(String[] args) {
		
		Orcamento orcamento = new Orcamento(1001.0);

		Item item = new Item("Celular", 800.0);
		Item item2 = new Item("Bicicleta", 201.0);
		
		orcamento.adiciona(item);
		orcamento.adiciona(item2);
		
		CalculadorDeDescontos calculador = new CalculadorDeDescontos();
		
		double descontoTotal = calculador.calcula(orcamento);
		
		System.out.printf("Valor do orçamento: R$%.2f \n", orcamento.getValor());
		System.out.printf("Desconto do orçamento: R$%.2f", descontoTotal);
	}
}
