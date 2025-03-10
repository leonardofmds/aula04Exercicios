package entities;

import java.util.UUID;

public class Funcao {
	private UUID id;
	private String nome; 
	
	public Funcao() {
		this.id = UUID.randomUUID();
	}
	
	public Funcao(String nome) {
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
