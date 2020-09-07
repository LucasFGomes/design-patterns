package template_method.exercicio;

import java.util.ArrayList;
import java.util.List;

public class TesteDeRelatorios {

	public static void main(String[] args) {

		Relatorio relatorioSimples = new RelatorioSimples();
		Relatorio relatorioCompleto = new RelatorioCompleto();
		
		List<Conta> contas = new ArrayList<Conta>();
		
		Conta conta1 = new Conta("João", 150, 0001, 192024);
		Conta conta2 = new Conta("Pedro", 1000, 0001, 31523);
		
		contas.add(conta1);
		contas.add(conta2);
		
		relatorioSimples.imprime(contas);
		
		System.out.println("==================================");
		
		relatorioCompleto.imprime(contas);
		
	}

}
