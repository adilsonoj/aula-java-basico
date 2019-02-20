
public class Conta {
	
	private Integer numero;
	private double limite;
	private double saldo;

	private static int numeroContas;
	
	public Conta(Integer numero){
		this.numero = numero;
	}
	
	
	public Conta(){
		numeroContas = numeroContas + 1;
	}
	
	public boolean saca(double quantidade) {

		if (quantidade > limite) {
			return false;

		} else {
			this.saldo = this.saldo - quantidade;

			return true;
		}

	}

	public boolean deposita(double quantidade) {

		this.saldo = this.saldo + quantidade;

		return true;
	}

	public Integer getNumero() {
		return numero;
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
	}

	public double getLimite() {
		return limite;
	}

	public void setLimite(double limite) {
		this.limite = limite;
	}

	public double getSaldo() {
		return saldo;
	}


	public static int getNumeroContas() {
		return numeroContas;
	}

	
	

}
