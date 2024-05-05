package br.com.sistemadashboard.model;

import java.time.LocalDate;
import java.util.List;

public final class Projeto {

	private String tituloDoProjeto;
	private String numeroDeSequencia;
	private LocalDate dataDeInicio;
	private LocalDate dataDeConclusao;
	private StatusDoDesenvolvimento statusDoDesenvolvimento;
	private Ambiente ambiente;
	private List<Desenvolvedor> desenvolvedores;
	
	public Projeto() {
		
	}

	public Projeto(String tituloDoProjeto, String numeroDeSequencia, LocalDate dataDeInicio, LocalDate dataDeConclusao,
			StatusDoDesenvolvimento statusDoDesenvolvimento, Ambiente ambiente, List<Desenvolvedor> desenvolvedores) {
		this.tituloDoProjeto = numeroDeSequencia;
		this.numeroDeSequencia = numeroDeSequencia;
		this.dataDeInicio = dataDeInicio;
		this.dataDeConclusao = dataDeConclusao;
		this.statusDoDesenvolvimento = statusDoDesenvolvimento;
		this.ambiente = ambiente;
		this.desenvolvedores = desenvolvedores;
	}

	public String getTituloDoProjeto() {
		return tituloDoProjeto;
	}

	public void setTituloDoProjeto(String tituloDoProjeto) {
		this.tituloDoProjeto = tituloDoProjeto;
	}

	public String getNumeroDeSequencia() {
		return numeroDeSequencia;
	}

	public void setNumeroDeSequencia(String numeroDeSequencia) {
		this.numeroDeSequencia = numeroDeSequencia;
	}

	public LocalDate getDataDeInicio() {
		return dataDeInicio;
	}

	public void setDataDeInicio(LocalDate dataDeInicio) {
		this.dataDeInicio = dataDeInicio;
	}

	public LocalDate getDataDeConclusao() {
		return dataDeConclusao;
	}

	public void setDataDeConclusao(LocalDate dataDeConclusao) {
		this.dataDeConclusao = dataDeConclusao;
	}

	public StatusDoDesenvolvimento getStatusDoDesenvolvimento() {
		return statusDoDesenvolvimento;
	}

	public void setStatusDoDesenvolvimento(StatusDoDesenvolvimento statusDoDesenvolvimento) {
		this.statusDoDesenvolvimento = statusDoDesenvolvimento;
	}

	public Ambiente getAmbiente() {
		return ambiente;
	}

	public void setAmbiente(Ambiente ambiente) {
		this.ambiente = ambiente;
	}

	public List<Desenvolvedor> getDesenvolvedores() {
		return desenvolvedores;
	}

	public void setDesenvolvedores(List<Desenvolvedor> desenvolvedores) {
		this.desenvolvedores = desenvolvedores;
	}

	@Override
	public String toString() {
		return "Projeto: " + tituloDoProjeto 
			 + "\nInciado em: " + dataDeInicio.getDayOfMonth() + "/" + dataDeInicio.getMonthValue() 
					+ "/" + dataDeInicio.getYear()
			 + "\nPrevisão de conclusão/Conluído em: " + dataDeConclusao.getDayOfMonth() + "/" 
					+ dataDeConclusao.getMonthValue() + "/" + dataDeConclusao.getYear() 
			 + "\nStatus do Desenvolvimento: " + statusDoDesenvolvimento
			 + "\nAmbiente: " + ambiente 
			 + "\nDesenvolvedores: " + desenvolvedores;
	}
	
}
