
public class CarroTeste {
	
public static void main(String[]args) {
	
	Carro cA = new Carro();
	
	cA.Marca= "Ford";
	cA.Modelo= "Fiesta";
	cA.Cor= "Branca";
	cA.Combustivel= "Gasolina";
	cA.vel = 5;
	
	System.out.println("Detalhes do Carro A :  " + "\nMarca: " +cA.Marca + "\n"  +"Modelo:"+ cA.Modelo + "\n" + "Cor:" + cA.Cor + "\n" + "Tipo de Combustível:"+ cA.Combustivel);
	
	cA.ligar();
	
	cA.acelerar(50);
	System.out.println("Acelerou para : "+ cA.vel+ "km/hr");
	
	cA.freiar(15);
	System.out.println("Reduziu para : "+ cA.vel+ "km/hr \n \n \n \n");

	
  
  Carro cB = new Carro();
	
	cB.Marca= "Mitsubishi";
	cB.Modelo= "L-200";
	cB.Cor= "Azul-Royal";
	cB.Combustivel= "Diesel";
	cB.vel = 100;
	
	System.out.println("Detalhes do Carro B :  " + "\nMarca: " +cB.Marca + "\n"  +"Modelo:"+ cB.Modelo + "\n" + "Cor:" + cB.Cor + "\n" + "Tipo de Combustível:"+ cB.Combustivel);
	
	cB.ligar();
	
	cB.acelerar(50);
	System.out.println("Acelerou para : "+ cB.vel+ "km/hr");
	
	cB.freiar(35);
	System.out.println("Reduziu para : "+ cB.vel+ "km/hr \n \n \n \n");

	

	
}
	

}
