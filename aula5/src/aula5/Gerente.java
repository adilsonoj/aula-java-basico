package aula5;

public class Gerente extends Funcionario implements Autenticavel{
	private Integer senha = 123;

	@Override
	public boolean autentica(Integer senha) {
		if(this.senha != senha)
			return false;
		//outras verificações de acesso ao sistema
		System.out.println("Autentica Gerente");
		return true;
	}

	@Override
	public Double getBonificacao() {
		System.out.println("getBonificacao de Gerente");
		return getSalario() * 0.15;
	}

	public Integer getSenha() {
		return senha;
	}

	public void setSenha(Integer senha) {
		this.senha = senha;
	}

}
