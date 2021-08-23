package persons;

import java.util.Date;

public class Diretor extends Funcionario{
	private int idDiretor;

	public Diretor(String nome, String sobrenome, Date dataNasc, String cpf, String telefone, String cargo,
			double salario, char tipoSanguineo, char sexo, Endereco endereco, String turno, String login,
			String senha, int idDiretor) {
		super(nome, sobrenome, dataNasc, cpf, telefone, cargo, salario, tipoSanguineo, sexo, endereco, turno, login, senha);
		this.idDiretor = idDiretor;
	}
	
	
	
}
