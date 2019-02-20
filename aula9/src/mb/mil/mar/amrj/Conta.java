package mb.mil.mar.amrj;

public class Conta implements Comparable<Conta>{
	
	private Integer numero;
	private String titular;
	
	
	
	public Integer getNumero() {
		return numero;
	}
	public void setNumero(Integer numero) {
		this.numero = numero;
	}
	public String getTitular() {
		return titular;
	}
	public void setTitular(String titular) {
		this.titular = titular;
	}
	
	@Override
	public String toString() {
		return "Conta [numero=" + numero + ", titular=" + titular + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((numero == null) ? 0 : numero.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Conta other = (Conta) obj;
		if (numero == null) {
			if (other.numero != null)
				return false;
		} else if (!numero.equals(other.numero))
			return false;
		return true;
	}
	
	@Override
	public int compareTo(Conta arg0) {
		if (this.numero < arg0.numero) {
			return -1;
		}
		if (this.numero > arg0.numero) {
		return 1;
		}
		return 0;
		}
	
	
	}

	
	
	
	
	
	
	
	
	
	
	

