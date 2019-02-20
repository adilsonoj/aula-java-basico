package aula5;

public class Diretor extends Funcionario implements Autenticavel{
	private Integer senha = 123;

	@Override
	public boolean autentica(Integer senha) {
		if (this.senha != senha)
			return false;
		// outras verificações de acesso ao sistema
		System.out.println("Autentica Diretor");
		return true;
	}

	@Override
	public Double getBonificacao() {
		return getSalario() * 0.15;
	}

	public Integer getSenha() {
		return senha;
	}

	public void setSenha(Integer senha) {
		this.senha = senha;
	}

}
