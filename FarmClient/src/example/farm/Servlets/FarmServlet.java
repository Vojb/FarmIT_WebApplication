package example.farm.Servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import example.farm.facade.FarmFacadeLocal;
import example.farm.model.Animal;
import example.farm.model.Cow;
import example.farm.model.Food;

/**
 * Servlet implementation class FarmServlet
 */
@WebServlet("/FarmServlet")
public class FarmServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	@EJB
	FarmFacadeLocal facade;
	
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FarmServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 PrintWriter out = response.getWriter();
		 out.println("<!DOCTYPE html><html><head>");
		 out.println("<title>FarmIt</title>");
		 out.println("<meta charset=\"ISO-8859-1\">");
		 out.println("</head><body>");
		 out.println("<h3>Katt med sammansatt nyckel</h3>");
		
	Cow a = new Cow();
	a.setAge("12");
	a.setIdAnimal(2);
	a.setName("Sosse");
	a.setStatusAnimal("Alive");
	facade.createAnimal(a);
		 if(a != null){

			 out.println(a.getName());
			  
		 }out.println("</body></html>");
	}

}
