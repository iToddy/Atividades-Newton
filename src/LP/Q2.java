package LP;

import java.util.Scanner;

public class Q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner entrada = new Scanner(System.in);
		
		String plaque;
		short year;
		
		System.out.println("Insira a placa do carro");
		plaque = entrada.nextLine();
		
		System.out.println("Insira o ano do carro");
		year = entrada.nextShort();
		
		if (year <= 2019) {
			System.out.println("Carro velho");
		} else if (year <= 2021) {
			System.out.println("Carro semi-novo");
		} else if (year == 2022) {
			System.out.println("Carro novo ");
		} else {
			System.out.println("Ano inválido");
		}
		
		String newPlaque = plaque.toUpperCase();
		
		String maskPlaque = newPlaque.replace ("A", "*")
									.replace ("E","*")
									.replace ("O", "*")
									.replace ("I", "*")
									.replace ("U", "*");
		
		System.out.println (maskPlaque);

	}

}
