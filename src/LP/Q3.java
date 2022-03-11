package LP;

import java.util.Scanner;

public class Q3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner entrada = new Scanner(System.in);
		
		char c;
		String phrase;
		
		System.out.println ("Insira sua frase");
		phrase = entrada.next();
		
		String newPhrase = phrase.toUpperCase();
		
		for (int i=0; i < newPhrase.length();i++)
		{
			c=newPhrase.charAt(i);
			if (c == 'A' || c == 'E' || c == 'I' || c == 'O'|| c == 'U')
			{
				vogals = vogals+Character.toString(c);
				System.out.println(vogals);
			}
			
		}
		
		if (vogals.contains("A"))
			numVogals ++;
		if(vogals.contais("E"))
			numVogals ++;
		if (vogals.contains("I"))
			numVogals ++;
		if(vogals.contais("O"))
			numVogals ++
		if (vogals.contains("U"))
				numVogals ++;
		
	}
	
	System.out.println(numVogals);

}
