package aula3;

public class ProgramaPrincipal {

	public static void main(String[] args) {
		
	Cliente[] listaClientes = new Cliente[3];
	
	
	Cliente cliente1 = new Cliente();
	Cliente cliente2 = new Cliente();
	Cliente cliente3 = new Cliente();
	
	cliente1.nome = "Maria";
	cliente2.nome = "João";
	cliente3.nome = "Carlos";
	cliente3.idade = 18;
	
	listaClientes[0] = cliente1;
	listaClientes[1] = cliente3;
	listaClientes[2] = cliente2;
	

	
	for (Cliente cliente : listaClientes) {
		System.out.println(cliente.mostrarAtributos());
	}
		
		
	}
	
}
