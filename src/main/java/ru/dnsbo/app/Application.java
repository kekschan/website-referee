package ru.dnsbo.app;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import ru.dnsbo.models.Referee;

public class Application {
    public static void main(String[] args) {

        Configuration configuration = new Configuration();

        configuration.configure();

        SessionFactory sessionFactory = configuration.buildSessionFactory();
        Session session = sessionFactory.openSession();

        System.out.println("ok");
        session.beginTransaction();
        Referee referee = new Referee("Tankov", "Artem", "tanakov@gmail.com", "456123");
        session.save(referee);
        session.getTransaction().commit();
    }
}
