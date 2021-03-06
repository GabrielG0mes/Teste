package br.com;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("SpringBeans.xml");

		Carro carro = (Carro) context.getBean("carro");
		System.out.println(carro.getNome());
		System.out.println(carro.getValor());

		// EntityManagerFactory emf = Persistence.createEntityManagerFactory("tabelafipe");
		// EntityManager em = emf.createEntityManager();

		CarroController carroController = context.getBean(CarroController.class);
		carro.setNome("Fiesta");
		carro.setValor(35000);

		// carroController.persistirCarro(carro);

		List<Carro> carros = carroController.buscarTodosOsCarros();
		for (int i = 0; i < carros.size(); i++) {
			System.out.println(carros.get(i).getId() + " " + carros.get(i).getNome());
		}

		// em.getTransaction().begin();
		// em.persist(carro);
		// em.getTransaction().commit();
		// System.out.println("Novo carro inserido! Id: " + carro.getId());

		// List<Carro> carros = em.createQuery("select car from Carro car").getResultList();
		//
		// for (int i = 0; i < carros.size(); i++) {
		// System.out.println(carros.get(i).getNome() + " " + carros.get(i).getValor());
		// }

		// em.close();
		// emf.close();

		// SessionFactory sf = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
		//
		// Session session = sf.openSession();
		// session.beginTransaction();
		// // session.save(carro);
		//
		// System.out.println(carro);
		//
		// // List<Carro> carros = session.createQuery("from Carro").list();
		// // carros.forEach(c -> System.out.println(c));
		// // System.out.println("tamanho: " + carros.size());
		//
		// carro = (Carro) session.load(Carro.class, 2l);
		// System.out.println(carro);
		//
		// // carro.setNome("Astra");
		// //
		// // session.save(carro);
		// // session.getTransaction().commit();
		// //
		// // System.out.println(carro);

	}
}
