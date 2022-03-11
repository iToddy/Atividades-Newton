package LP;

import java.util.Scanner;

public class Q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner entrada= new Scanner(System.in);
				
				float numHours;
				float medVel;
				float liters;
				float distance;
				
				System.out.println ("Insira o Número de Horas Viajadas");
				numHours = entrada.nextFloat();
				
				System.out.println("Qual foi sua velocidade Média");
				medVel = entrada.nextFloat();
				
				System.out.println("Quanto de gasolina foi gasto ?");
				liters = entrada.nextFloat();
				
				distance = numHours * medVel;
				
				System.out.println("consumo final = " + (distance/liters) + "km/l");

	}

}
