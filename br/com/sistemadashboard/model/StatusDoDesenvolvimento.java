package br.com.sistemadashboard.model;

public enum StatusDoDesenvolvimento {

	INICIADO("Iniciado"),
	EM_PRODUCAO("Em produção"),
	AGUARDANDO_APROVACAO("Aguardando aprovação"),
	FASE_DE_TESTE("Fase de testes"),
	EM_ANALISE("Em análise"),
	CONCLUIDO("Concluído");
	
	private String statusDoDesenvolvimento;
	
	private StatusDoDesenvolvimento(String statusDoDesenvolvimento) {
		this.statusDoDesenvolvimento = statusDoDesenvolvimento;
	}

	public String getStatusDoDesenvolvimento() {
		return statusDoDesenvolvimento;
	}
	
}
