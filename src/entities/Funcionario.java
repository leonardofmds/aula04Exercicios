package entities;

public class Funcionario extends Pessoa {

	private String cpf, matricula;
	private double salario;
	private Funcao funcao;
	private Setor setor;

	public Funcionario() {

	}

	public Funcionario(String nome, String cpf, String matricula, double salario, Funcao funcao, Setor setor) {
		super(nome);
		this.cpf = cpf;
		this.matricula = matricula;
		this.salario = salario;
		this.funcao = funcao;
		this.setor = setor;
	}

	public Funcionario(String nome, String cpf, String matricula, double salario) {
		super(nome);
		this.cpf = cpf;
		this.matricula = matricula;
		this.salario = salario;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public Funcao getFuncao() {
		return funcao;
	}

	public void setFuncao(Funcao funcao) {
		this.funcao = funcao;
	}

	public Setor getSetor() {
		return setor;
	}

	public void setSetor(Setor setor) {
		this.setor = setor;
	}
}
