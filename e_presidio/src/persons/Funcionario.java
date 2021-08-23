package persons;
import java.util.Date;

public class Funcionario {
	private String nome;
	private String sobrenome;
	private Date dataNasc;
	private String cpf;
	private String telefone;
	private String cargo;
	private double salario;
	private char tipoSanguineo;
	private char sexo;
	private Endereco endereco;
	private String turno;
	private String login;
	private String senha;
	
	
	public Funcionario(String nome, String sobrenome, Date dataNasc, String cpf, String telefone, String cargo,
		double salario, char tipoSanguineo, char sexo, Endereco endereco, String turno, String login, String senha) {
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.dataNasc = dataNasc;
		this.cpf = cpf;
		this.telefone = telefone;
		this.cargo = cargo;
		this.salario = salario;
		this.tipoSanguineo = tipoSanguineo;
		this.sexo = sexo;
		this.endereco = endereco;
		this.turno = turno;
		this.login = login;
		this.senha = senha;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getSobrenome() {
		return sobrenome;
	}


	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
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


	public double getSalario() {
		return salario;
	}


	public void setSalario(double salario) {
		this.salario = salario;
	}


	public char getTipoSanguineo() {
		return tipoSanguineo;
	}


	public void setTipoSanguineo(char tipoSanguineo) {
		this.tipoSanguineo = tipoSanguineo;
	}


	public char getSexo() {
		return sexo;
	}


	public void setSexo(char sexo) {
		this.sexo = sexo;
	}


	public Endereco getEndereco() {
		return endereco;
	}


	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}


	public String getTurno() {
		return turno;
	}


	public void setTurno(String turno) {
		this.turno = turno;
	}


	public String getCpf() {
		return cpf;
	}


	public String getCargo() {
		return cargo;
	}


	public String getLogin() {
		return login;
	}


	public void setLogin(String login) {
		this.login = login;
	}


	public String getSenha() {
		return senha;
	}


	public void setSenha(String senha) {
		this.senha = senha;
	}
	
	
	
	
}
