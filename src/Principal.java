import java.util.Random;

public class Principal {

	public static void main(String[] args) {

		int soma = 0;
		int[][] Mat = new int[3][5];
		Random random = new Random();
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 5; j++) {
				Mat[i][j] = random.nextInt(10);
			}
		}
		
		for (int i = 0; i < 1; i++) {
			for (int j = 0; j < 5; j++) {
				soma = soma + Mat[i][j];
			}
			Metodos metodos = new Metodos(soma, i);
		}
		soma=0;
		for (int i = 1; i < 2; i++) {
			for (int j = 0; j < 5; j++) {
				soma = soma + Mat[i][j];
			}
			Metodos metodos2 = new Metodos(soma, i);
		}
		soma=0;
		for (int i = 2; i < 3; i++) {
			for (int j = 0; j < 5; j++) {
				soma = soma + Mat[i][j];
			}
			Metodos metodos3 = new Metodos(soma, i);
		}
		soma=0;

	}
}
