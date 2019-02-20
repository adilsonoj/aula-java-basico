package aula7;

public class ProgramaPrincipal {

	public static void main(String[] args) {
		Conta c = new Conta();
		c.setLimite(1000);
		
		try {
			c.saca(2000);
		} catch (SaldoInsuficienteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("fim do main");
		
		System.out.println(c);

	}

}
