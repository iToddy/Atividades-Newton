package LP;

import java.util.Scanner;

public class Q4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner entrada = new Scanner (System.in);
		
		System.out.println("Selecione uma das opções do Menu"
				+ "1- Cadastrar Passageiro"
				+ "2- Check in"
				+ "Cancelar Vôo"
				+ "Sair");
		
		short num = entrada.nextShort();
		
		switch (num) {
			case 1:
				System.out.println("Insira seu Nome");
				String name = entrada.next();
				
				System.out.println("Insira seu CPF");
				String cpf = entrada.next();
				
				System.out.println("Insira a data e horário do vôo");
				String date = entrada.next(); 
				
				break;
			
			case 2: 
				System.out.println("Insira seu CPF");
				String cpfCheck = entrada.next();
				
				System.out.println("Insira o número do seu vôo");
				int flightCheck = entrada.nextInt();
				
				System.out.println("Check in realizdo com sucesso!");
				
				break;
				
			case 3:
				System.out.println("Insira seu CPF");
				String cpfcancel = entrada.next();
				
				System.out.println("Insira o número do seu vôo");
				int flightCancel = entrada.nextInt();
				
				System.out.println("Vôo cancelado!");
				
				break;
				
			default: 
				System.out.println("Opção inválida, por favor insira um numero de 1 a 4 ");
		}
		

	}

}
