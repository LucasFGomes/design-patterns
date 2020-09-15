package memento;

import java.util.Calendar;

public class Programa {

	public static void main(String[] args) {

		Historico historico = new Historico();
		Contrato c1 = new Contrato(Calendar.getInstance(), "Lucas", TipoContrato.NOVO);
		historico.adiciona(c1.salvaEstado());
		
		c1.avanca();
		historico.adiciona(c1.salvaEstado());
		
		c1.avanca();
		historico.adiciona(c1.salvaEstado());
		
		System.out.println(historico.pegaEstadoAnterior().getEstado().getTipo());
	}

}
