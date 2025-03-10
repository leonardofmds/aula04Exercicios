package entities;

import java.util.UUID;

public class Setor {
	private UUID id;
	private String descricao;

	public Setor() {
		this.id = UUID.randomUUID();
	}

	public Setor(String descricao) {
		this.id = UUID.randomUUID();
		this.descricao = descricao;
	}

	public UUID getId() {
		return id;
	}

	public void setId(UUID id) {
		this.id = id;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

}
