package observer;

public class TesteDeNotaFiscal {

	public static void main(String[] args) {

		NotaFiscalBuilder notaFiscalBuilder = new NotaFiscalBuilder();
		
		notaFiscalBuilder.paraEmpresa("LOJA DO JOÃO")
				.comCnpj("123.456.789/0001-10")
				.com(new ItemDaNota("Item 1", 240.0))
				.com(new ItemDaNota("Item 2", 500.0))
				.com(new ItemDaNota("Item 3", 60.0))
				.comObservacoes("qualquer observação");

		NotaFiscal notaFiscal = notaFiscalBuilder.constroi();
		
		System.out.println("Valor bruto: R$" + notaFiscal.getValorBruto());
		System.out.println("Imposto: R$" + notaFiscal.getImpostos());
	}

}
