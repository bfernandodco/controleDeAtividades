package br.com.sistemadashboard.model;

public final class Colaborador implements Desenvolvedor {

	private EmpresaTerceira empresaTerceira;
	private DadosPessoais dadosPessoais;
	
	public Colaborador() {
		
	}

	public Colaborador(EmpresaTerceira empresaTerceira, DadosPessoais dadosPessoais) {
		this.empresaTerceira = empresaTerceira;
		this.dadosPessoais = dadosPessoais;
	}

	public EmpresaTerceira getEmpresaTerceira() {
		return empresaTerceira;
	}

	public void setEmpresaTerceira(EmpresaTerceira empresaTerceira) {
		this.empresaTerceira = empresaTerceira;
	}

	public DadosPessoais getDadosPessoais() {
		return dadosPessoais;
	}

	public void setDadosPessoais(DadosPessoais dadosPessoais) {
		this.dadosPessoais = dadosPessoais;
	}

	@Override
	public String toString() {
		return "\nColaborador: " + dadosPessoais
			 + "\nEmpresa Terceira: " + empresaTerceira;
	}

	@Override
	public String imprimirDesenvolvedor(Desenvolvedor desenvolvedor) {
		// TODO Auto-generated method stub
		return null;
	}
	
}
