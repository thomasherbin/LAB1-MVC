package lab.mvc.controller;

import lab.mvc.model.Personn;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "ServletController", urlPatterns = "/ServletController")
public class ServletController extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String firstName = request.getParameter("firstName");
        String lastName = request.getParameter("lastName");
        String birthDate = request.getParameter("birthDate");
        String gender = request.getParameter("gender");

        Personn personn = new Personn(firstName, lastName, birthDate, gender);
        request.setAttribute("personn", personn);

        int birthYear = Integer.parseInt(birthDate.split("-")[0]);



        if (birthYear <= 1990) {
            request.getRequestDispatcher("/old.jsp").forward(request, response);
        } else {
            request.getRequestDispatcher("/young.jsp").forward(request, response);
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
