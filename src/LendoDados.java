import java.util.Scanner;

public class LendoDados {
	
	public static void main(String[] args) {
		//Variáveis
		String nome;
		//Exibe mensagem na tela
		System.out.println("Por favor, digite o seu nome: ");
		//Cria objeto Scanner para ler dados do teclado
		Scanner leitor = new Scanner(System.in);
		//Lê texto digitado e guarda na variável
		nome = leitor.next();
		//Exibe resuldado com o nome atribuído
		System.out.print("Boa noite " + nome);
		//Fecha recurso Scanner para evitar erros
		leitor.close();
	}
}