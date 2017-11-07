package br.com;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

@Repository
public class CarroDao {

	@PersistenceContext
	private EntityManager entityManager;

	public void persistir(Carro carro) {
		this.entityManager.persist(carro);
	}

	public Carro buscar(Long id) {
		return this.entityManager.find(Carro.class, id);
	}

	public void remover(Carro carro) {
		this.entityManager.remove(carro);
	}

	public void atualizar(Carro carro) {
		this.entityManager.merge(carro);
	}

	public List<Carro> buscarTodos() {
		List<Carro> carros = this.entityManager.createQuery("select car from Carro car").getResultList();
		return carros;
	}

}
