package br.inatel.labs.padraomdc.model.entity;

import java.util.Objects;

public class Produto {
	private Long id;
	private String descricao;
	private Double preco;

	public Produto(Long id, String descricao, Double preco) {
		super();
		this.id = id;
		this.descricao = descricao;
		this.preco = preco;
	}

	public Long getId() {
		return id;
	}
	public String getDescricao() {
		return descricao;
	}
	
	public Double getPreco() {
		return preco;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(descricao, id, preco);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Produto other = (Produto) obj;
		return Objects.equals(descricao, other.descricao) && Objects.equals(id, other.id)
				&& Objects.equals(preco, other.preco);
	}
		
}
