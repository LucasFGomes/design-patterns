package observer;

public class Multiplicador implements AcaoAposGerarNota{

	private double fator;
	
	public Multiplicador(double fator) {
		this.setFator(fator);
	}
	
	@Override
	public void executa(NotaFiscal notaFiscal) {
		System.out.println("Valor bruto multiplicado: " + notaFiscal.getValorBruto() * this.fator);
	}
	
	public double getFator() {
		return fator;
	}
	
	public void setFator(double fator) {
		this.fator = fator;
	}
	


}
