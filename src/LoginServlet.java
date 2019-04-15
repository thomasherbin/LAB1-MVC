import com.reinaldoarrosi.android.querybuilder.sqlite.QueryBuilder;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "LoginServlet", urlPatterns = "/LoginServlet")
public class LoginServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String userid = request.getParameter("user");
        String password = request.getParameter("password");

        System.out.println(userid);
        System.out.println(password);


        String loginResponse = "InCorrect";
        if (userid.equals("abc") && password.equals("123")) {
            loginResponse = "Correct";
        }

        response.setContentType("text/plain");  // Set content type of the response so that jQuery knows what it can expect.
        response.setCharacterEncoding("UTF-8"); // You want world domination, huh?
        response.getWriter().write(loginResponse);
    }
}
