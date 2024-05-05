package br.com.sistemadashboard.model;

public final class Funcionario implements Desenvolvedor {
	
	private DadosPessoais dadosPessoais;
	private Funcionario gestor;
	
	public Funcionario() {
		
	}

	public Funcionario(DadosPessoais dadosPessoais, Funcionario gestor) {
		this.dadosPessoais = dadosPessoais;
		this.gestor = gestor;
	}

	public DadosPessoais getDadosPessoais() {
		return dadosPessoais;
	}

	public void setDadosPessoais(DadosPessoais dadosPessoais) {
		this.dadosPessoais = dadosPessoais;
	}

	public Funcionario getGestor() {
		return gestor;
	}

	public void setGestor(Funcionario gestor) {
		this.gestor = gestor;
	}
	
	@Override
	public String toString() {
		return "\nFuncionario: " + dadosPessoais
			 + "\nGestor: "+ gestor.dadosPessoais.getNome();
	}
	
	@Override
	public String imprimirDesenvolvedor(Desenvolvedor desenvolvedor) {
		// TODO Auto-generated method stub
		return null;
	}

}
