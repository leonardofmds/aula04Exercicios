package controllers;

import java.util.Scanner;

import entities.Funcao;
import entities.Funcionario;
import entities.Setor;
import repositories.FuncionarioRepositoryJson;

public class FuncionarioController {

	private Scanner scanner = new Scanner(System.in);
	
	public void cadastrarFuncionario() {
		var funcionario = new Funcionario();

		System.out.println("Cadastrar Funcionario");

		System.out.println("Nome: ");
		funcionario.setNome(scanner.nextLine());
		System.out.println("CPF: ");
		funcionario.setCpf(scanner.nextLine());
		System.out.println("Matricula: ");
		funcionario.setMatricula(scanner.nextLine());
		System.out.println("Salario: ");
		funcionario.setSalario(Double.parseDouble(scanner.nextLine()));
		System.out.println("Funcao: ");
		funcionario.setFuncao(new Funcao(scanner.nextLine()));
		System.out.println("Setor: ");
		funcionario.setSetor(new Setor(scanner.nextLine()));
		
		/* Implementar dessa forma futuramente
 		var funcao = new Funcao();
		var setor = new Setor();
		System.out.println("Funcao: ");
		System.out.println("Deseja cadastrar uma funcao ou selecionar uma existente?");

		var inputFuncaoCorreta = false;
		while (inputFuncaoCorreta == false) {
			System.out.println("Responda (1) para cadastrar | (2) para selecionar");
			if (System.console().readLine().equals("1")) {
				var funcaoController = new FuncaoController();
				funcaoController.cadastrarFuncao();
				inputFuncaoCorreta = true;
			} else if (System.console().readLine().equals("2")) {
				System.out.println("Selecione a funcao: ");
				var funcaoController = new FuncaoController();
				funcaoController.listarFuncoes();
				inputFuncaoCorreta = true;
			} else {
				System.out.println("Opcao invalida");
			}
		}
		
		System.out.println("Setor: ");
		System.out.println("Deseja cadastrar um setor ou selecionar um existente?");

		var inputSetorCorreto = false;
		while (inputSetorCorreto == false) {
			System.out.println("Responda (1) para cadastrar | (2) para selecionar");
			if (System.console().readLine().equals("1")) {
				var funcaoController = new FuncaoController();
				funcaoController.cadastrarFuncao();
				inputSetorCorreto = true;
			} else if (System.console().readLine().equals("2")) {
				System.out.println("Selecione a funcao: ");
				var funcaoController = new FuncaoController();
				funcaoController.listarFuncoes();
				inputSetorCorreto = true;
			} else {
				System.out.println("Opcao invalida");
			}
		}*/		
		var funcionarioRepository = new FuncionarioRepositoryJson();
		funcionarioRepository.exportarFuncionario(funcionario);
	}

	public void listarFuncionarios() {

	}
}
