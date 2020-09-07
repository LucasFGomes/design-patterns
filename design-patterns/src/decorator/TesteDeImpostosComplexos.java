package decorator;

public class TesteDeImpostosComplexos {

	public static void main(String[] args) {
		
		Imposto iss = new ISS(new ICMS());
		Imposto iccc = new ICCC();
		Imposto impostoMuitoAlto = new ImpostoMuitoAlto(new ISS(new ICMS(new ICCC())));
		Imposto icpp = new ICPP();
		
		Orcamento orcamento = new Orcamento(500);
		
		double valor =  iss.calcula(orcamento);
		double valorIccc = iccc.calcula(orcamento);
		double valorDoImpostoMuitoAlto = impostoMuitoAlto.calcula(orcamento);
		double valorIcpp = icpp.calcula(orcamento);
		
		System.out.println("ISS + ICMS: " + valor);
		System.out.println("ICCC: " + valorIccc);
		System.out.println("Imposto muito alto: " + valorDoImpostoMuitoAlto);
		System.out.println("ICPP: " + valorIcpp);

	}

}
