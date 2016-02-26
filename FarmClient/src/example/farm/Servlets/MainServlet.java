package example.farm.Servlets;
 
import java.io.IOException;
 
import java.io.PrintWriter;
 
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
 
import bajs.Person;
 
@WebServlet("/MainServlet")
public class MainServlet extends HttpServlet {
    // För test
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        PrintWriter out = response.getWriter();
        out.println("MainServlet-doGet");
        out.close();
    }
 
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String url = null;
        // Get hidden field
        String operation = request.getParameter("operation");
        if (operation.equals("showperson")) {
            System.out.println("MainServlet-showperson");
            String name = request.getParameter("txtName");
            Person p = new Person(name, "Lund");
            request.setAttribute("person", p);
            url = "/farmit/ShowPerson.jsp";
        } else if (operation.equals("searchperson")) {
            System.out.println("MainServlet-searchperson");
            url = "/farmit/SearchPerson.jsp";
        } else {
            url = "/farmit/SearchPerson.jsp";
        }
        System.out.println(url);
        RequestDispatcher dispatcher = getServletContext().getRequestDispatcher(url);
        dispatcher.forward(request, response);
    }
}