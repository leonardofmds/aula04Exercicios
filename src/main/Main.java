package main;

import java.util.Scanner;

import controllers.FuncionarioController;

public class Main {
	
	private static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		var funcionarioController = new FuncionarioController();
		funcionarioController.cadastrarFuncionario();
		
		System.out.println("\nDeseja cadastrar outro funcionario?");
        System.out.println("\nResponda S para SIM ou N para NAO");
		String continuar = scanner.nextLine();		

		if (continuar.equalsIgnoreCase("N")) {
			System.out.println("\nFIM DO PROGRAMA");
		} else if (continuar.equalsIgnoreCase("S")) {
			main(args);
		} else {
			System.out.println("\nOPÇÃO INVÁLIDA, finalizando o programa");
		}
		
	    scanner.close();
	}

}
