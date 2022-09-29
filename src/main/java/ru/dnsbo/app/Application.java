package ru.dnsbo.app;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import ru.dnsbo.models.Referee;

public class Application {
    public static void main(String[] args) {

        Configuration configuration = new Configuration();
        configuration.setProperty("hibernate.connection.url", "jdbc:postgresql://localhost:5432/referee-live");
        configuration.setProperty("hibernate.connection.username", "postgres");
        configuration.setProperty("hibernate.connection.password", "380996120958");
        configuration.setProperty("hibernate.connection.driver_class", "org.postgresql.Driver");
        configuration.setProperty("hibernate.dialect", "org.hibernate.dialect.PostgreSQL95Dialect");

/*        configuration.setProperty("hibernate.hbm2ddl.auto", "update");*/
        configuration.addResource("Referee.hbm.xml");
 //       configuration.addAnnotatedClass(Referee.class);
 //       configuration.setProperty("hibernate.show_sql", "true");
        SessionFactory sessionFactory = configuration.buildSessionFactory();

        Session session = sessionFactory.openSession();

        Referee referee = session.createQuery("from Referee referee where referee.id = 1", Referee.class).getSingleResult();

        System.out.println(referee);
        /*session.beginTransaction();
        session.save(new Referee("Tarakanov", "Daniil", "tarakanov@gmail.com", "654321"));
        session.getTransaction().commit();*/
    }


}
