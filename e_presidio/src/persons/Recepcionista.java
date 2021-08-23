package persons;

import java.util.Date;

public class Recepcionista extends Funcionario{

	public Recepcionista(String nome, String sobrenome, Date dataNasc, String cpf, String telefone, String cargo,
			double salario, char tipoSanguineo, char sexo, Endereco endereco, String turno, String login,
			String senha) {
		super(nome, sobrenome, dataNasc, cpf, telefone, cargo, salario, tipoSanguineo, sexo, endereco, turno, login, senha);
	}

}
