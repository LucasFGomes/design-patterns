package command;

public class Programa {
	public static void main(String[] args) {
		
		Pedido pedido1 = new Pedido("Lucas", 400.0);
		Pedido pedido2 = new Pedido("João", 1000);
		
		FilaDeTrabalho fila = new FilaDeTrabalho();
		
		fila.adiciona(new PagaPedido(pedido1));
		fila.adiciona(new PagaPedido(pedido2));
		fila.adiciona(new ConcluiPedido(pedido2));
		
		fila.processa();
		
	}
}
