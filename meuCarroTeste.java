package aula04;

import java.util.Scanner;

public class meuCarroTeste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		carro carro01 = new carro();
		carro carro02 = new carro();
		carro carro03 = new carro();
		
		carro01.setMarca ("Ford");
		carro01.setModelo ("Fusion");
		carro01.setCor ("preto");
		carro01.setPlaca("OXE2G66");
		carro01.setCombustivel ("Flex");
		
		carro02.setMarca ("Mercedez");
		carro02.setModelo ("Classe C Sedan");
		carro02.setCor ("prata");
		carro02.setPlaca ("OXF3G44");
		carro02.setCombustivel ("Flex");
		
		carro03.setMarca ("Toyota");
		carro03.setModelo ("Corolla");
		carro03.setCor ("branco");
		carro03.setPlaca ("FXF4G77");
		carro03.setCombustivel ( "Flex");
		 
		System.out.println("Carros do meu estoque: " + 
							carro01.getModelo() + ", " + 
							carro02.getModelo() + ", " + 
							carro03.getModelo() + "." );
				}

}
