package aula04;

import java.util.Scanner;

public class minhaLoja {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		carro meuCarro= new carro();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o modelo do seu carro: ");
		meuCarro.setModelo(sc.nextLine());

		System.out.println("Digite a marca do seu carro: ");
		meuCarro.setMarca(sc.nextLine());

		
		System.out.println(" Seu carro é da marca " + meuCarro.getMarca() + " e modelo " + meuCarro.getModelo());
		 
		sc.close();
	}

}
