package br.com.sistemadashboard.model;

public final class Estagiario implements Desenvolvedor {

	private String numeroDoContrato;
	private Funcionario orientador;
	private DadosPessoais dadosPessoais;
	
	public Estagiario() {
		
	}
	
	public Estagiario(String numeroDoContrato, Funcionario orientador, DadosPessoais dadosPessoais) {
		this.numeroDoContrato = numeroDoContrato;
		this.orientador = orientador;
		this.dadosPessoais = dadosPessoais;
	}

	public String getNumeroDoContrato() {
		return numeroDoContrato;
	}

	public void setNumeroDoContrato(String numeroDoContrato) {
		this.numeroDoContrato = numeroDoContrato;
	}

	public Funcionario getOrientador() {
		return orientador;
	}

	public void setOrientador(Funcionario orientador) {
		this.orientador = orientador;
	}

	public DadosPessoais getDadosPessoais() {
		return dadosPessoais;
	}

	public void setDadosPessoais(DadosPessoais dadosPessoais) {
		this.dadosPessoais = dadosPessoais;
	}

	@Override
	public String toString() {
		return "\nEstagiário: " + dadosPessoais
			 + "\nNúmero do Contrato: " + numeroDoContrato 
			 + "\nOrientador=" + orientador;
	}

	@Override
	public String imprimirDesenvolvedor(Desenvolvedor desenvolvedor) {
		// TODO Auto-generated method stub
		return null;
	}

}
