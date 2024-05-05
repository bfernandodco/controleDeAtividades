package br.com.sistemadashboard.model;

public final class Estagiario implements Desenvolvedor {

	private Funcionario orientador;
	private DadosPessoais dadosPessoais;
	
	public Estagiario() {
		
	}
	
	public Estagiario(Funcionario orientador, DadosPessoais dadosPessoais) {
		this.orientador = orientador;
		this.dadosPessoais = dadosPessoais;
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
			 + "\nOrientador: " + orientador;
	}

	@Override
	public String imprimirDesenvolvedor(Desenvolvedor desenvolvedor) {
		// TODO Auto-generated method stub
		return null;
	}

}
