package reports;

public class BoletimConduta {
	private String descricao;
	private String emissor;
	private String infrator;
	private int id;
	private int idEmissor;
	private static int qtdEmitidas = 0;
	
	
	public BoletimConduta(String descricao, String emissor, String infrator, int id, int idEmissor) {
		this.descricao = descricao;
		this.emissor = emissor;
		this.infrator = infrator;
		this.idEmissor = idEmissor;
		id = qtdEmitidas++;
	}

	
	public String toString() {
		return getId() + " | " + getDescricao() + " | " + getInfrator()  + " | "; 
	}
	
	
	
	public String getDescricao() {
		return descricao;
	}


	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}


	public String getEmissor() {
		return emissor;
	}


	public void setEmissor(String emissor) {
		this.emissor = emissor;
	}


	public String getInfrator() {
		return infrator;
	}


	public void setInfrator(String infrator) {
		this.infrator = infrator;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public int getIdEmissor() {
		return idEmissor;
	}


	public void setIdEmissor(int idEmissor) {
		this.idEmissor = idEmissor;
	}


	public static int getQtdEmitidas() {
		return qtdEmitidas;
	}
	
}
