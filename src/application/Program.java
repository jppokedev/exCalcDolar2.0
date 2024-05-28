package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Calculo;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		Calculo inf = new Calculo();
		
		System.out.print("Informe o valor do Dolar: ");
		inf.setValorDol(sc.nextDouble());
		System.out.print("Informe o valor do Real: ");
		inf.setValorReal(sc.nextDouble());
		System.out.printf("Valor final é: %.2f%n ", inf.calc());
		
		
		sc.close();
	}

}
