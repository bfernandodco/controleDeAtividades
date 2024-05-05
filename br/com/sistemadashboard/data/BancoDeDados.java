package br.com.sistemadashboard.data;

import java.util.ArrayList;
import java.util.List;

import br.com.sistemadashboard.model.Projeto;
import br.com.sistemadashboard.service.DesenvolvedorService;

public final class BancoDeDados {

	private List<Projeto> projetos;
	
	public BancoDeDados(DesenvolvedorService desenvolvedorService) {
		this.projetos = new ArrayList<Projeto>();
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
	
}
