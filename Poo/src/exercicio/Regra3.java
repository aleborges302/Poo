package exercicio;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Regra3 {

	public static void main(String[] args) {
		// Variáveis

		double x, y, valor;
		// objetos
		Scanner teclado = new Scanner(System.in);
		DecimalFormat formatador = new DecimalFormat("#0.00");
		System.out.println("x% de y = valor");
		System.out.println("Digite o valor de x");
		x = teclado.nextDouble();
		System.out.println("Digite o valor de y");
		y = teclado.nextDouble();
		// processamento
		valor = (x * y) / 100;
		// saída
		System.out.println(x + "% de " + y + " = " + formatador.format(valor));

		teclado.close();

	}

}


