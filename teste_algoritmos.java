package avaliacao_aluno;
import java.util.Scanner;

public class teste_algoritmos {

	public static void main(String[] args) {

	Scanner sc = new Scanner(System.in);
	
	System.out.println("Digite um número: ");
	double a = sc.nextDouble();
	System.out.println("Digite outro número: ");
	double b = sc.nextDouble();
	double resultado = 0;
	
	if (a > b) {
		resultado = (a - b) / a;
	}
	else {
		resultado = (b - a) / b;
	}
	
	System.out.println("Resultado: " + resultado);
	
	sc.close();
	
	}

}
