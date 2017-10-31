package br.com;

<<<<<<< HEAD
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
=======
>>>>>>> ffb687d311081f09790cf4316d6afd4fc9bc4b94
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
<<<<<<< HEAD

		SessionFactory sf = new Configuration().configure("src/main/java/br/com/hibernate.cfg.xml")
				.buildSessionFactory();
=======
>>>>>>> ffb687d311081f09790cf4316d6afd4fc9bc4b94
	}
}
