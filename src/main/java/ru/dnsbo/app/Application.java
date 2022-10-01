package ru.dnsbo.app;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import ru.dnsbo.models.Referee;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Application {
    public static void main(String[] args) {


        Configuration configuration = new Configuration();

        int i = 3;
        configuration.configure();

        SessionFactory sessionFactory = configuration.buildSessionFactory();
        Session session = sessionFactory.openSession();

        System.out.println("ok");
        session.beginTransaction();

        //проверка объктов из базы данных

        String sql = "from " + Referee.class.getSimpleName();
        System.out.println("sql = " + sql);

        List<Referee> referees = session.createQuery(sql).list();

        System.out.println(referees.get(i-1).getEmail());
        System.out.println("referees size = " + referees.size());
        for (Iterator<Referee> it = referees.iterator(); it.hasNext(); ) {
            Referee referee = (Referee) it.next();
            System.out.println(referee.toString());
        }

        //добавление объекта в базу данных

        /* Referee referee = new Referee("Tankov", "Artem", "tanakov@gmail.com", "456123");*/
        /*session.save(referee);*/

        session.getTransaction().commit();

    }
}
