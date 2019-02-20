package aula3;

public class Cliente {
	String nome;
	String cpf;
	Integer idade;
	
	
	public String mostrarAtributos() {
		return "Nome: " + this.nome + " cpf: " + this.cpf + " idade: " + this.idade; 
	}

}
