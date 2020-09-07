package state;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Orcamento {
	protected double valor;
	private List<Item> itens;
	protected EstadoDeUmOrcamento estadoAtual;
	
	public Orcamento(double valor) {
		this.valor = valor;
		this.itens = new ArrayList<Item>();
		this.estadoAtual = new EmAprovacao();
	}

	public double getValor() {
		return valor;
	}
	
	public void setValor(double valor) {
		this.valor = valor;
	}
	
	public void adiciona(Item item) {
		itens.add(item);
	}

	public List<Item> getItens() {
		return Collections.unmodifiableList(itens);
	}
	
	public boolean contemItemDeNome(String nomeDoItem) {
        for (Item item : itens) {
            if (item.getNome().equals(nomeDoItem.toLowerCase())) return true;
        }
        return false;
    }

	public void aplicaDescontoExtra() {
		this.estadoAtual.aplicaDescontoExtra(this);
	}
	
	public void aprova() {
		estadoAtual.aprova(this);
	}
	
	public void reprova() {
		estadoAtual.reprova(this);
	}
	
	public void finaliza() {
		estadoAtual.finaliza(this);
	}
	
}
