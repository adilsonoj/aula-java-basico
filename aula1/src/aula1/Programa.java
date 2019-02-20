package aula1;

class Programa {

	public static void main(String[] args) {
		
		System.out.println("Olá");
		
		int inteiro;
		char caracetere;
		double flutuante;
		boolean boleano; //true false
		
		boolean amigoDoBar;
		int idade;
		
		amigoDoBar = true;
		idade = 0;
		
		if (idade > 18 && amigoDoBar) {
			int a;
			a = 20;
			System.out.println("pode entrar");
		}
		
		if (idade != 20) 
			System.out.println("igual");
		
		
//		while (idade <= 18) {
//			
//			System.out.println(idade);
//			
//			idade += 1;
//			
//		}
		
		
		
		for (int i = 0; i <= 18; i++) {
			if(i == 5) {
				continue;
				
			}
			System.out.println(i);
		}
		
		
		
		
	}
	
	

}
