package aula2;

public class Conta {
	Integer numero;
	Cliente cliente;
	double limite;
	double saldo;
	private static int totalDeContas;
	
	Conta(){
		Conta.totalDeContas = Conta.totalDeContas + 1;
	}
	boolean saca(double quantidade) {

		if (quantidade > limite) {
			return false;
			
		} else {
			this.saldo = this.saldo - quantidade;

			return true;
		}

	}
	
	
	boolean transferePara(Conta destino, double valor){
		
		this.saldo = this.saldo - valor;
		
		destino.saldo = destino.saldo + valor;
		
		return true;
	}
	
	public static int getTotalDeContas() {
	    return Conta.totalDeContas;
	}

	

}
