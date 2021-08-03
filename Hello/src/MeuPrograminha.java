import java.util.Scanner; // Sem importar daria pra puxar ainda usando: java.util.Scanner scanner = new java.util.Scanner(System.in);

public class MeuPrograminha {

	public static void main(String[] args) {
		System.out.println("Qual é o seu nome? "); // Da pra aceitar um argumento na execução: println("Olá! " + args[0] + ".");
		
		Scanner escaner = new Scanner(System.in); // criando a variável "scanner": type, indentifier, novo // System.in indica que é do console que tá pegando
		String nome = escaner.nextLine();
		
		System.out.println("Olá "+ nome + ".");  // Atalho: digitar "sysout", segurar "control" e apertar "espaço"
	}

}
