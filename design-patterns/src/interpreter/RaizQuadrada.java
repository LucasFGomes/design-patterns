package interpreter;

public class RaizQuadrada implements Expressao {
	
	private Expressao expressao;

	public RaizQuadrada(Expressao expressao) {
		this.expressao = expressao;
	}

	@Override
	public int avalia() {
		int valorDaExpressao = expressao.avalia();
		
		return (int) Math.sqrt(valorDaExpressao);
	}

}
