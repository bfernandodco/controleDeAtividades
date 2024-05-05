package br.com.sistemadashboard.service;

import java.util.List;

import br.com.sistemadashboard.data.BancoDeDados;
import br.com.sistemadashboard.model.Desenvolvedor;
import br.com.sistemadashboard.model.Projeto;

public class ProjetoService {

	private BancoDeDados bancoDeDados;
	private Projeto projeto;
	
	public ProjetoService(BancoDeDados bancoDeDados) {
		this.bancoDeDados = bancoDeDados;
		this.projeto = new Projeto();
	}
	
	public void criarNovoProjeto(Projeto projeto) {
		try {
			if(!(projeto.equals(null))) {
				bancoDeDados.criarProjeto(projeto);
			}
		} catch(NullPointerException e) {
			System.err.println("O projeto não contém informações suficientes.");
		}
	}
	
	public Projeto buscarProjeto(String numeroDeSequencia) {
		try {
			for(Projeto projeto : bancoDeDados.listarProjetos()) {
				if(projeto.getNumeroDeSequencia().equals(numeroDeSequencia)) {
					return projeto;
				}
			}
		} catch(NullPointerException e) {
			System.err.println("O número de sequência não corresponde à um projeto existente.");
		}
		
		return null;
	}
	
	public void adicionarDesenvolvedorAoProjeto(String numeroDeSequencia, Desenvolvedor desenvolvedor) {
		projeto = buscarProjeto(numeroDeSequencia);
		projeto.getDesenvolvedores().add(desenvolvedor);
		bancoDeDados.atualizarProjeto(projeto);
	}
	
	public void removerDesenvolvedorDoProjeto(String numeroDeSequencia, String numeroDeMatricula) {
		projeto = buscarProjeto(numeroDeSequencia);
		for(Desenvolvedor desenvolvedor : projeto.getDesenvolvedores()) {
			if(desenvolvedor.getDadosPessoais().getNumeroDeMatricula().equals(numeroDeMatricula)) {
				projeto.getDesenvolvedores().remove(desenvolvedor);
				bancoDeDados.atualizarProjeto(projeto);
			}
		}
	}
	
	public List<Desenvolvedor> listarDesenvolvedoresDoProjeto(String numeroDeSequencia) {
		projeto = buscarProjeto(numeroDeSequencia);
		return projeto.getDesenvolvedores();
	}
}

