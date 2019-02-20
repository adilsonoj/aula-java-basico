package aula2;

public class MeuPrograma {

	public static void main(String[] args) {

		Conta c1 = new Conta();
		Conta c2 = new Conta();
		
		Cliente cliente = new Cliente();
		
		cliente.nome = "Maria";
		
		Cliente cliente2 = new Cliente();
		
		cliente2.nome = "João";
		
		c1.cliente = cliente;
		c1.saldo = 2000;
		
		c2.cliente = cliente2;
		c2.saldo = 1000;
		
		cliente2.nome = "Mario";
		
		c2.cliente.nome = "Astrogildo";
		
		System.out.println("Saldo de " + c1.cliente.nome + " = " + c1.saldo);
		System.out.println("Saldo de " + c2.cliente.nome + " = " + c2.saldo);

		
		c1.transferePara(c2, 500);

		System.out.println("\nApós tranferencia\n");
		
		System.out.println("Saldo de " + c1.cliente.nome + " = " + c1.saldo);
		System.out.println("Saldo de " + c2.cliente + " = " + c2.saldo);
		
		System.out.println(c2.cliente.cpf);
		
		Conta c3 = new Conta();
	
		
		System.out.println(Conta.getTotalDeContas());
	}

}
