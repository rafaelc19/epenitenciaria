package persons;

import java.util.Date;

public class AgentePenitenciario extends Funcionario{
	private int idAgentePenitenciario;

	
	
	public AgentePenitenciario(String nome, String sobrenome, Date dataNasc, String cpf, String telefone, String cargo,
			double salario, char tipoSanguineo, char sexo, Endereco endereco, String turno, String login,
			String senha, int idAgentePenitenciario) {
		super(nome, sobrenome, dataNasc, cpf, telefone, cargo, salario, tipoSanguineo, sexo, endereco, turno, login, senha);
		this.idAgentePenitenciario = idAgentePenitenciario;
	}
	 
	
	
}
