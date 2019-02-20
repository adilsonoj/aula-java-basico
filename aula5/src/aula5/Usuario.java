package aula5;

public class Usuario implements Autenticavel{
	public Integer senha = 235;

	public Integer getSenha() {
		return senha;
	}

	public void setSenha(Integer senha) {
		this.senha = senha;
	}

	@Override
	public boolean autentica(Integer senha) {
		// TODO Auto-generated method stub
		return false;
	}
	
	
}
