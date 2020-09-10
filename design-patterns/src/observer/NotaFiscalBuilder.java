package observer;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class NotaFiscalBuilder {
	
	private String razaoSocial;
	private String cnpj;
	private List<ItemDaNota> todosItens = new ArrayList<ItemDaNota>();
	private double valorBruto;
	private double impostos;
	private String observacoes;
	private Calendar dataDaEmissao;
	private List<AcaoAposGerarNota> todasAcoesASeremExecutadas;
		
	public NotaFiscalBuilder() {
		this.dataDaEmissao = Calendar.getInstance();
		this.todasAcoesASeremExecutadas = new ArrayList<AcaoAposGerarNota>();
	}
	
	public NotaFiscalBuilder(List<AcaoAposGerarNota> listaDeAcoes) {
		this.todasAcoesASeremExecutadas = listaDeAcoes;
	}

	public NotaFiscalBuilder paraEmpresa(String razaoSocial) {
		this.razaoSocial = razaoSocial;
		return this;
	}
	
	public NotaFiscalBuilder comCnpj(String cnpj) {
		this.cnpj = cnpj;
		return this;
	}
	
	public NotaFiscalBuilder com(ItemDaNota item) {
		todosItens.add(item);
		valorBruto += item.getValor();
		impostos += item.getValor() * 0.05;
		return this;
	}
	
	public NotaFiscalBuilder comObservacoes(String observacoes) {
		this.observacoes = observacoes;
		return this;
	}
	
	public NotaFiscalBuilder naData(Calendar data) {
        this.dataDaEmissao = data;
        return this;
    }
	
	public void adicionaAcao(AcaoAposGerarNota acao) {
		this.todasAcoesASeremExecutadas.add(acao);
	}
	
	private void executaAcoes(NotaFiscal notaFiscal) {
		for (AcaoAposGerarNota acaoAposGerarNota : todasAcoesASeremExecutadas) {
			acaoAposGerarNota.executa(notaFiscal);
		}
	}
	
	public NotaFiscal constroi() {
		NotaFiscal notaFiscal = new NotaFiscal(razaoSocial, cnpj, dataDaEmissao, valorBruto, impostos, todosItens, observacoes);
	
		executaAcoes(notaFiscal);
		
		return notaFiscal;
	}

}
