package entities;

import java.util.UUID;

public class Pessoa {

	private UUID id;
	private String nome;

	public Pessoa() {
		this.id = UUID.randomUUID();
	}

	public Pessoa(String nome) {
		this.id = UUID.randomUUID();
		this.nome = nome;
	}

	public UUID getId() {
		return id;
	}

	public void setId(UUID id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

}
