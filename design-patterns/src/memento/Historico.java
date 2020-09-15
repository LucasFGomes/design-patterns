package memento;

import java.util.ArrayList;
import java.util.List;

public class Historico {

	private List<Estado> estadosSalvos = new ArrayList<>();
	
	public Estado pega(int index) {
		if (estadosSalvos.size() <= index) throw new RuntimeException("Não há estado salvo nesse indice");
		return estadosSalvos.get(index);
	}
	
	public Estado pegaEstadoAnterior() {
		return estadosSalvos.get(estadosSalvos.size() - 1);
	}
	
	public void adiciona(Estado estado) {
		estadosSalvos.add(estado);
	}
}
