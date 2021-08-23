package persons;

public class Endereco {
	private String rua;
	private String cep;
	private String cidade;
	private String bairro;
	private String estado;
	private int numero;
	
	public Endereco(String rua, String cep, String cidade, String bairro, String estado, int numero) {
		super();
		this.rua = rua;
		this.cep = cep;
		this.cidade = cidade;
		this.bairro = bairro;
		this.estado = estado;
		this.numero = numero;
	}

	public String getRua() {
		return rua;
	}

	public void setRua(String rua) {
		this.rua = rua;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	
	
	
}
