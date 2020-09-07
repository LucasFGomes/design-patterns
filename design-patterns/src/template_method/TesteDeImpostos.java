package template_method;

public class TesteDeImpostos {

	public static void main(String[] args) {
		
		Imposto icms = new ICMS();
		Imposto iss = new ISS();
		Imposto iccc = new ICCC();
		
		Imposto icpp = new ICPP();
		Imposto ikcv = new IKCV();
		Imposto ihit = new IHIT();
		
		Orcamento orcamento = new Orcamento(1500);
		
		Item item1 = new Item("Bicicleta", 300);
		Item item2 = new Item("Bicicleta", 500);
		Item item3 = new Item("Moto", 3000);
		Item item4  = new Item("Carro", 45000);
		
		orcamento.adiciona(item1);
		orcamento.adiciona(item2);
		orcamento.adiciona(item3);
		orcamento.adiciona(item4);
		
		CalculadorDeImpostos calculadorDeImpostos = new CalculadorDeImpostos();
		
		calculadorDeImpostos.realizaCalculo(orcamento, icms);
		calculadorDeImpostos.realizaCalculo(orcamento, iss);
		calculadorDeImpostos.realizaCalculo(orcamento, iccc);
		calculadorDeImpostos.realizaCalculo(orcamento, icpp);
		calculadorDeImpostos.realizaCalculo(orcamento, ikcv);
		calculadorDeImpostos.realizaCalculo(orcamento, ihit);

	}

}
