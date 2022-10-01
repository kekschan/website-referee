package ru.dnsbo.servlet;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import ru.dnsbo.models.Referee;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet("/registration")
public class RegistrationServlet extends HttpServlet {

    @Override
    public void init() throws ServletException {

    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String secondName = request.getParameter("secondName");
        String firstName = request.getParameter("firstName");
        String email = request.getParameter("email");
        String password = request.getParameter("password");

        Configuration configuration = new Configuration();

        configuration.configure();

        SessionFactory sessionFactory = configuration.buildSessionFactory();
        Session session = sessionFactory.openSession();

        //через получения данных проверять существует ли такоей пользователь
        //если да, то не добавлять заявку
        session.beginTransaction();
        Referee referee = new Referee(secondName, firstName, email, password);
        session.save(referee);

        session.getTransaction().commit();
        request.getServletContext().getRequestDispatcher("/jsp/login.jsp").forward(request,response);
    }
}
