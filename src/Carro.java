import java.util.Scanner;

public class Carro {

	
	String Marca;
	String Modelo;
	String Cor;
	String Combustivel ;
	int vel;
	
	
	
	
	void ligar() {
		
		if(vel>=1) {
			System.out.println("Carro ligado!");
			
		}else {
			System.out.println("Carro desligado!");

			
		}

			
			
		}
		
		
	
	
	void acelerar(int aceleracao) {
		
		vel+= aceleracao;
		
		
		
	}
	
	void freiar(int reduzir) {
		
		vel-= reduzir;
		
		
	}
		}
	
	
	



