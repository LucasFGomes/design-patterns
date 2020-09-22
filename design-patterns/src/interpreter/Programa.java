package interpreter;

public class Programa {

	public static void main(String[] args) {

		Expressao esquerda = new Soma(new Numero(10), new Numero(10));
		Expressao direita = new Subtracao(new Soma(new Numero(10), new Numero(50)), new Numero(25));
		
		int resultado = new Soma(esquerda, direita).avalia();
		
		Expressao e = new Multiplicacao(new Numero(resultado), new Numero(resultado));
		Expressao d = new Divisao(new Numero(resultado), new Numero(resultado));
		
		int resultadoFinal = new Soma(e, d).avalia();
		int raizDoResultado = new RaizQuadrada(new Numero(resultadoFinal)).avalia();
		
		System.out.println("Resultado: " + resultadoFinal);
		System.out.println("Raiz Quadrada do Resultado: " + raizDoResultado);
	}

}
