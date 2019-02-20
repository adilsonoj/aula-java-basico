package mb.mil.mar.amrj;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Colecao {
	public static void main(String[] args) {
		
		
		Conta c1 = new Conta();
		Conta c2 = new Conta();
		c1.setNumero(20);
		c1.setTitular("Diretor");
		
		c2.setNumero(10);
		c2.setTitular("Gerente");
		
		List<Conta> contas = new ArrayList<>();
		
		
		contas.add(c2);
		contas.add(c1);
		
		contas.sort((conta1, conta2) -> conta1.compareTo(conta2));
		
		contas.forEach(conta -> System.out.println(conta));
		
		
		
		
		
		
	}
}
