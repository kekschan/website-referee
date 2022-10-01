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
import java.util.List;
import java.util.Properties;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {
    Properties properties = new Properties();
    Configuration configuration = new Configuration();
    private Connection connection;
    @Override
    public void init() throws ServletException {

  /*      try {
            properties.load(Files.newInputStream(Paths.get(getServletContext().getRealPath("/WEB-INF/classes/db.properties"))));
            String dbUrl = properties.getProperty("db.url");
            String dbUser = properties.getProperty("db.username");
            String dbPassword = properties.getProperty("db.password");
            String driverClass = properties.getProperty("db.driverClassName");

            configuration.setProperty("hibernate.connection.url", dbUrl);
            configuration.setProperty("hibernate.connection.username", dbUser);
            configuration.setProperty("hibernate.connection.password", dbPassword);
            configuration.setProperty("hibernate.connection.driver_class", driverClass);
            configuration.setProperty("hibernate.dialect", "org.hibernate.dialect.PostgreSQL95Dialect");

            configuration.addResource("Referee.hbm.xml");

            Class.forName(driverClass);
            connection = DriverManager.getConnection(dbUrl, dbUser, dbPassword);

        } catch (IOException | ClassNotFoundException | SQLException e) {
            throw new RuntimeException(e);
        }*/
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getServletContext().getRequestDispatcher("/jsp/login.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
      /*  SessionFactory sessionFactory = configuration.buildSessionFactory();
        Session session = sessionFactory.openSession();*/

       /* String Email = request.getParameter("email");
        String Password = request.getParameter("password");

        for (int i = 1; i < 10; ) {
            Referee referee = session.createQuery("from Referee referee where referee.id = " + i, Referee.class).getSingleResult();
            if (referee.getEmail().equals(Email) & referee.getPassword().equals(Password)) {
                request.getServletContext().getRequestDispatcher("/jsp/profile.jsp").forward(request, response);
            }

        }
        request.getServletContext().getRequestDispatcher("/jsp/login.jsp").forward(request, response);*/
    }
}
