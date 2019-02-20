package br.mil.mar.armj.programa;


public class Principal {

	public static void main(String[] args) {
		String palavra1 = "xpto";
		String palavra2 = new String("xpto5");
		
		//System.out.println(palavra1.equals(palavra2));
		
		palavra2 = palavra1.concat("abc");
		
		System.out.println(palavra2);
		
		StringBuilder sb = new StringBuilder();
		sb.append(palavra2);
		sb.append(palavra1);
		
	}

}
