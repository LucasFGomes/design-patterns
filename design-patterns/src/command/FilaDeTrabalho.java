package command;

import java.util.ArrayList;
import java.util.List;

public class FilaDeTrabalho {

	private List<Comando> fila;

	public FilaDeTrabalho() {
		this.fila = new ArrayList<Comando>();
	}
	
	public void adiciona(Comando comando) {
		this.fila.add(comando);
	}
	
	public void processa() {
		for (Comando comando : fila) {
			comando.executa();
		}
	}
	
}
