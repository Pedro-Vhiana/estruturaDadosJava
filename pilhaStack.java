package estruturaDeDados;

import java.util.Scanner;
import java.util.Stack;

public class pilhaStack {

	public static void main(String[] args) {
		

		Scanner leia = new Scanner (System.in);
		
		int cont;
		
		Stack<String> livros = new Stack <String>();
		
		
		do {
			
			System.out.println("\n***********************************************");
			System.out.println("\n1 - Adicionar Livro na Pilha");
			System.out.println("\n2 - Listar todos os Livros");
			System.out.println("\n3 - Retirar Livro da pilha");
			System.out.println("\n0 - Sair");
			System.out.println("\n***********************************************");
			System.out.println("\nEntre com a opção desejada: ");
			System.out.println();	
			cont = leia.nextInt();
		
			switch(cont) {
			
			case 1:
				leia.nextLine();
				System.out.println("Digite o nome: ");
				String nome = leia.nextLine();
				livros.add(nome);
				System.out.println("Livro Adicionado com sucesso!");
				break;
			
			case 2:
				leia.nextLine();
				System.out.println("\nLista de Livros: "+livros);
				break;
			
			case 3:
				leia.nextLine();
				System.out.println("\n\tLivro "+livros.pop()+" foi retirado");
				System.out.println("\nLista de Livros:"+livros);
				break;
				
			case 0:
				System.out.println("\nPrograma Finalizado!");
					
			}
		} while (cont != 0);
		
	}

}