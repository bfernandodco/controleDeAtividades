package br.com.sistemadashboard.model;

public final class Funcionario implements Desenvolvedor {
	
	private String numeroDeMatricula;
	private DadosPessoais dadosPessoais;
	private Funcionario gestor;
	
	public Funcionario() {
		
	}

	public Funcionario(String numeroDeMatricula, DadosPessoais dadosPessoais, Funcionario gestor) {
		this.dadosPessoais = dadosPessoais;
		this.numeroDeMatricula = numeroDeMatricula;
		this.gestor = gestor;
	}

	public String getNumeroDeMatricula() {
		return numeroDeMatricula;
	}

	public void setNumeroDeMatricula(String numeroDeMatricula) {
		this.numeroDeMatricula = numeroDeMatricula;
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
			 + "\nMatricula: " + numeroDeMatricula
			 + "\nGestor: "+ gestor.dadosPessoais.getNome();
	}
	
	@Override
	public String imprimirDesenvolvedor(Desenvolvedor desenvolvedor) {
		// TODO Auto-generated method stub
		return null;
	}

}
