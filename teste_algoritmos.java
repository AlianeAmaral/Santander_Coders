package avaliacao_aluno;
import java.util.Scanner;

public class teste_algoritmos {

	public static void main(String[] args) {

	Scanner sc = new Scanner(System.in);
	
	System.out.println("Digite um número: ");
	double x = sc.nextDouble();
	
	double a = 0;
	double t = 0;
	int i = 0;
	
	while (i < x) {
		System.out.println("Digite outro número: ");
		double e = sc.nextDouble();
		t = (t + e);
		i = i +1;
	}
	
	a = (t / x);
	
	System.out.println("Resultado: " + i + a);
	
	sc.close();
	
	}

}
