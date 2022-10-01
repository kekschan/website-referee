package ru.dnsbo.servlet;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import ru.dnsbo.models.Referee;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.sql.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Properties;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {
    Properties properties = new Properties();
    Configuration configuration = new Configuration();
    private Connection connection;

    @Override
    public void init() throws ServletException {

    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getServletContext().getRequestDispatcher("/jsp/login.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String email = request.getParameter("email");
        String password = request.getParameter("password");

        Configuration configuration = new Configuration();

        configuration.configure();

        SessionFactory sessionFactory = configuration.buildSessionFactory();
        Session session = sessionFactory.openSession();

        session.beginTransaction();

        //проверка объктов из базы данных

        String sql = "from " + Referee.class.getSimpleName();
        System.out.println("sql = " + sql);

        List<Referee> referees = session.createQuery(sql).list();

        System.out.println("referees size = " + referees.size());


        for ( int i = 1; i <= referees.size(); i++) {
            if (email.equals(referees.get(i-1).getEmail()) & password.equals(referees.get(i-1).getPassword())){
                request.getServletContext().getRequestDispatcher("/jsp/profile.jsp").forward(request, response);
            }
        }
        request.getServletContext().getRequestDispatcher("/jsp/login.jsp").forward(request, response);
        session.getTransaction().commit();

    }
}
