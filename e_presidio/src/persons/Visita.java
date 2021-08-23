package persons;
import java.util.Date;

public class Visita {
	private String nome;
	private String sobreNome;
	private char tipoSanguineo;
	private Date horario;
	private Date dataNasc;
	private String telefone;
	private String endereco;
	
	
	public Visita(String nome, String sobreNome, char tipoSanguineo, Date horario, Date dataNasc, String telefone,
		String endereco) {
		this.nome = nome;
		this.sobreNome = sobreNome;
		this.tipoSanguineo = tipoSanguineo;
		this.horario = horario;
		this.dataNasc = dataNasc;
		this.telefone = telefone;
		this.endereco = endereco;
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


	public Date getHorario() {
		return horario;
	}


	public void setHorario(Date horario) {
		this.horario = horario;
	}


	public Date getDataNasc() {
		return dataNasc;
	}


	public void setDataNasc(Date dataNasc) {
		this.dataNasc = dataNasc;
	}


	public String getTelefone() {
		return telefone;
	}


	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}


	public String getEndereco() {
		return endereco;
	}


	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	
	
}
