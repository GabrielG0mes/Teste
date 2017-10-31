package br.com;

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

		SessionFactory sf = new Configuration().configure("src/main/java/br/com/hibernate.cfg.xml")
				.buildSessionFactory();

	}
}
