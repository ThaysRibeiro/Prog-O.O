/*Thays dos Santos Barroso
 Matrícula: 0050006852*/

import java.util.Scanner;
public class ThaysTabuada {

	public static void main(String[] args){	
		Scanner input = new Scanner(System.in);
		String nome="";
		int num;
		
		System.out.println("Digite seu nome: ");
		nome = input.next();
		System.out.printf("\nOlá, %s\n", nome);				
		
		System.out.print("Entre com o número: ");
		num= input.nextInt();
		
		System.out.printf("Tabuada de somar do: %d \n",num);
		
		for(int i=0;i<=10;i++) {
			System.out.printf("%d + %d = %d \n",num,i,num+i);
		}
	}
}