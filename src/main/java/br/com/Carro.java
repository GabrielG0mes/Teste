package br.com;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Carro {

	@Id
	@GeneratedValue
	private Long id;
	private String nome;
	private double valor;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	@Override
	public String toString() {
		return "Carro [id=" + id + ", nome=" + nome + ", valor=" + valor + "]";
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

}
