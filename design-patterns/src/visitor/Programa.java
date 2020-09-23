package visitor;

public class Programa {

	public static void main(String[] args) {

		Soma soma = new Soma(new Numero(10), new Numero(10));
		Subtracao subtracao = new Subtracao(new Soma(new Numero(10), new Numero(50)), new Numero(25));
		
		int resultado = new Soma(subtracao, soma).avalia();
		
		Multiplicacao multiplicacao = new Multiplicacao(new Numero(resultado), new Numero(resultado));
		Divisao divisao = new Divisao(new Numero(resultado), new Numero(resultado));
		
		int resultadoFinal = new Soma(multiplicacao, divisao).avalia();
		int raizDoResultado = new RaizQuadrada(new Numero(resultadoFinal)).avalia();
		
		System.out.println("Resultado: " + resultadoFinal);
		System.out.println("Raiz Quadrada do Resultado: " + raizDoResultado);
		
		RaizQuadrada raiz = new RaizQuadrada(multiplicacao);
		
		ImpressoraVisitor impressora = new ImpressoraVisitor();
		impressora.visitaSubtracao(subtracao);
		
		System.out.println("");
		
		impressora.visitaRaizQuadrada(raiz);
	}

}
