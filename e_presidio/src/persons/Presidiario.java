package persons;

import reports.BoletimConduta;
import java.util.ArrayList;
import java.util.Date;

public class Presidiario {
	private String nome;
	private String sobreNome;
	private char tipoSanguineo;
	private Date dataNasc;
	private String endereco;
	private String penalidade;
	private Date dataEntrada;
	private Date dataSaida;
	
	
	public Presidiario(String nome, String sobreNome, char tipoSanguineo, Date dataNasc, String endereco,
			String penalidade, Date dataEntrada, Date dataSaida) {
		this.nome = nome;
		this.sobreNome = sobreNome;
		this.tipoSanguineo = tipoSanguineo;
		this.dataNasc = dataNasc;
		this.endereco = endereco;
		this.penalidade = penalidade;
		this.dataEntrada = dataEntrada;
		this.dataSaida = dataSaida;
	}
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getSobreNome() {
		return sobreNome;
	}
	public void setSobreNome(String sobreNome) {
		this.sobreNome = sobreNome;
	}
	public char getTipoSanguineo() {
		return tipoSanguineo;
	}
	public void setTipoSanguineo(char tipoSanguineo) {
		this.tipoSanguineo = tipoSanguineo;
	}
	public Date getDataNasc() {
		return dataNasc;
	}
	public void setDataNasc(Date dataNasc) {
		this.dataNasc = dataNasc;
	}

	public String getPenalidade() {
		return penalidade;
	}
	public void setPenalidade(String penalidade) {
		this.penalidade = penalidade;
	}
	public Date getDataEntrada() {
		return dataEntrada;
	}
	public void setDataEntrada(Date dataEntrada) {
		this.dataEntrada = dataEntrada;
	}
	public Date getDataSaida() {
		return dataSaida;
	}
	public void setDataSaida(Date dataSaida) {
		this.dataSaida = dataSaida;
	}
	
	
	
	
	
	
}
