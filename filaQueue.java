package estruturaDeDados;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class filaQueue {

	public static void main(String[] args) {
		
		
		Scanner leia = new Scanner (System.in);
		
		int cont;
		
		Queue<String> fila = new LinkedList <String>();
		
		do {
			
			System.out.println("\n***********************************************");
			System.out.println("\n1 - Adicionar Cliente na fila");
			System.out.println("\2 - Listar todos os Clientes");
			System.out.println("\3 - Retirar Cliente da fila");
			System.out.println("\0 - Sair");
			System.out.println("\n***********************************************");
			System.out.println("\nEntre com a opção desejada: ");
			System.out.println();	
			cont = leia.nextInt();

			switch(cont) {
			
			case 1:
				leia.nextLine();
				System.out.println("Digite seu nome: ");
				String nome = leia.nextLine();
				fila.add(nome);
				System.out.println("Cliente Adicionado!");
				break;
			 
			case 2:
				leia.nextLine();
				System.out.println("\nLista de clientes na Fila: ");
				System.out.println(fila);
				break;
			
			case 3:
				leia.nextLine();
				System.out.println("\n\tCliente "+fila.poll()+" foi chamado");
				System.out.println("\nFila atualizada:"+fila);
				break;
				
			case 0:
				System.out.println("\nPrograma Finalizado");
			
			}
		} while(cont !=0);	
		leia.close();
	} 
} 