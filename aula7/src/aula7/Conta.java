package aula7;

public class Conta {
	
	private Integer numero;
	private double limite;
	private double saldo;

	private static int numeroContas;
	
	

	
	@Override
	public String toString() {
		return "Conta [numero=" + numero + ", limite=" + limite + ", saldo=" + saldo + "]";
	}

	public void saca(double quantidade) throws Exception{

		if (quantidade > limite) {
			throw new SaldoInsuficienteException();

		} else {
			this.saldo = this.saldo - quantidade;

			
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
