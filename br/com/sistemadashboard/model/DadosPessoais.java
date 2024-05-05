package br.com.sistemadashboard.model;

import java.time.LocalDate;

public abstract class DadosPessoais {
	
	private String nome;
	private LocalDate dataDeNascimento;
	private String cpf;
	private Ambiente ambienteDeDominio;
	
	public DadosPessoais() {
		
	}

	public DadosPessoais(String nome, LocalDate dataDeNascimento, String cpf,
			Ambiente ambienteDeDominio) {
		this.nome = nome;
		this.dataDeNascimento = dataDeNascimento;
		this.cpf = cpf;
		this.ambienteDeDominio = ambienteDeDominio;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public LocalDate getDataDeNascimento() {
		return dataDeNascimento;
	}

	public void setDataDeNascimento(LocalDate dataDeNascimento) {
		this.dataDeNascimento = dataDeNascimento;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public Ambiente getAmbienteDeDominio() {
		return ambienteDeDominio;
	}

	public void setAmbienteDeDominio(Ambiente ambienteDeDominio) {
		this.ambienteDeDominio = ambienteDeDominio;
	}

	@Override
	public String toString() {
		return "\nNome: " + nome 
			 + "\nData de Nascimento: " + dataDeNascimento.getDayOfMonth() + " de " 
					+ dataDeNascimento.getMonth() + " de " + dataDeNascimento.getYear()
			 + "\nCPF: " + cpf 
			 + "\nAmbiente de Dominio=" + ambienteDeDominio;
	}

}
