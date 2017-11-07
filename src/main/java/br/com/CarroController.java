package br.com;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Transactional
@Service
public class CarroController {

	@Autowired
	private CarroDao carroDao;

	public void persistirCarro(Carro carro) {
		this.carroDao.persistir(carro);
	}

	public Carro buscarCarro(Long id) {
		return this.carroDao.buscar(id);
	}

	public void removerCarro(Long id) {
		Carro carro = this.buscarCarro(id);
		this.carroDao.remover(carro);
	}

	public void atualizarCarro(Carro carro) {
		this.carroDao.atualizar(carro);
	}

	public List<Carro> buscarTodosOsCarros() {
		return this.carroDao.buscarTodos();
	}

}
