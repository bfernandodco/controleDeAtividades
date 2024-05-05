package br.com.sistemadashboard.model;

public enum Ambiente {

	OPEN("Open"),
	MAINFRAME("Mainframe"),
	AMBOS("Ambos");
	
	private String ambiente;
	
	private Ambiente(String ambiente) {
		this.ambiente = ambiente;
	}

	public String getAmbiente() {
		return ambiente;
	}
	
}
