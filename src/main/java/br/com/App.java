package br.com;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
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

		SessionFactory sf = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();

		Session session = sf.openSession();
		session.beginTransaction();
		// session.save(carro);

		System.out.println("teste");

		System.out.println(carro);

		// List<Carro> carros = session.createQuery("from Carro").list();
		// carros.forEach(c -> System.out.println(c));
		// System.out.println("tamanho: " + carros.size());

		carro = (Carro) session.load(Carro.class, 2l);
		System.out.println(carro);

		// carro.setNome("Astra");
		//
		// session.save(carro);
		// session.getTransaction().commit();
		//
		// System.out.println(carro);

	}
}
