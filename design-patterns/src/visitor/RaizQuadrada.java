package visitor;

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
	
	public Expressao getExpressao() {
		return expressao;
	}

	@Override
	public void aceita(Visitor impressora) {
		impressora.visitaRaizQuadrada(this);
	}

}
