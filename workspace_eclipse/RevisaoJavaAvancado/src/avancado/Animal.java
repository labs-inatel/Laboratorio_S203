package avancado;

import java.util.Objects;

public class Animal implements Comparable<Animal> {
	private Long id;
	private String nome;

	public Animal(Long id, String nome) {
		this.id = id;
		this.nome = nome;
	}

	public Long getId() {
		return id;
	}

	public String getNome() {
		return nome;
	}

	@Override
	public int compareTo(Animal that) {
		return this.nome.compareTo(that.nome);
	}
	
	@Override
	public String toString() {
		return "Animal [id=" + id + ", nome=" + nome + "]";
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(id, nome);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Animal other = (Animal) obj;
		return Objects.equals(id, other.id) && Objects.equals(nome, other.nome);
	}
	
	
}
