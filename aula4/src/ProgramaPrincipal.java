
public class ProgramaPrincipal {

	public static void main(String[] args) {

		Conta c1 = new Conta();
		
		Conta c2 = new Conta();
		
		System.out.println(Conta.getNumeroContas());
		System.out.println(c1.getNumeroContas());
		System.out.println(c2.getNumeroContas());
	}

}
