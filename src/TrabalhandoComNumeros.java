import java.util.Scanner;

public class TrabalhandoComNumeros {

	public static void main(String[] args) {
		float div,mult,sub,soma,n1,n2;
		
		Scanner leitor = new Scanner(System.in);
		System.out.println("CALCULADORA");
		
		System.out.println("Digite o primeiro valor: ");
		n1 = leitor.nextFloat();
		System.out.println("Digite o segundo valor: ");
		n2 = leitor.nextFloat();
		
		div = n1 / n2;
		mult = n1 * n2;
		sub = n1 - n2;
		soma = n1 + n2;
		
		System.out.println("Os resultados das operações são: \n" + div + "\n" + mult + "\n" + sub + "\n" + soma);
		leitor.close();
		}
}