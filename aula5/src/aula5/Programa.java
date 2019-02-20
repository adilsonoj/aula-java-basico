package aula5;

public class Programa {

	public static void main(String[] args) {

		Gerente g1 = new Gerente();
		g1.setNome("Joao");
		g1.setSalario(1000.00);

		Diretor diretor = new Diretor();
		diretor.setSalario(2000.00);
		
		Autenticavel usuario = new Usuario();
		
		Secretario secretario = new Secretario();

		login(usuario);

		

	}

	public static void login(Autenticavel alguem) {
		System.out.println(alguem.getClass().getSimpleName());
		if (alguem.autentica(123)) {
			System.out.println("Pode acessar");
			
		} else {
			System.out.println("Não Pode acessar");
		}

	}

	
}
