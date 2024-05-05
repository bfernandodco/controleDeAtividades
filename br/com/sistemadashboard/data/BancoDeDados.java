package br.com.sistemadashboard.data;

import java.util.ArrayList;
import java.util.List;

import br.com.sistemadashboard.model.Desenvolvedor;
import br.com.sistemadashboard.model.Projeto;

public final class BancoDeDados {

	private List<Projeto> projetos;
	private List<Desenvolvedor> desenvolvedores;
	
	public BancoDeDados() {
		this.projetos = new ArrayList<Projeto>();
		this.desenvolvedores = new ArrayList<Desenvolvedor>();
	}
	
	public void criarProjeto(Projeto projeto) {
		this.projetos.add(projeto);
	}
	
	public void atualizarProjeto(Projeto projeto) {
		this.projetos.add(projetos.indexOf(projeto), projeto);
	}
	
	public List<Projeto> listarProjetos() {
		return this.projetos;
	}
	
	public void excluirProjeto(Projeto projeto) {
		this.projetos.remove(projeto);
	}
	
	public void criarDesenvolvedor(Desenvolvedor desenvolvedor) {
		this.desenvolvedores.add(desenvolvedor);
	}
	
	public void atualizarDesenvolvedor(Desenvolvedor desenvolvedor) {
		this.desenvolvedores.add(desenvolvedores.indexOf(desenvolvedor), desenvolvedor);
	}
	
	public List<Desenvolvedor> listarDesenvolvedores() {
		return this.desenvolvedores;
	}
	
	public void excluirDesenvolvedor(Desenvolvedor desenvolvedor) {
		this.desenvolvedores.remove(desenvolvedor);
	}
	
}
