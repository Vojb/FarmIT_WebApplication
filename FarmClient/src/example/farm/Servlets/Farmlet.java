package example.farm.Servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;
import java.util.Set;

import javax.ejb.EJB;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bajs.Person;
import example.farm.facade.FarmFacadeLocal;
import example.farm.model.Animal;
import example.farm.model.Box;
import example.farm.model.Building;
import example.farm.model.Cow;
import example.farm.model.Food;

/**
 * Servlet implementation class FarmServlet
 */
@WebServlet("/Farmlet")
public class Farmlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	@EJB
	FarmFacadeLocal facade;


	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public Farmlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        PrintWriter out = response.getWriter();
        out.println("Farmlet-doGet");
        out.close();
    }
	   protected void doPost(HttpServletRequest request, HttpServletResponse response)
	            throws ServletException, IOException {
	        String url = null;
	        String operation = request.getParameter("operation");
	        if (operation.equals("findByIdAnimal")) {
	          int id=0;
	          Animal a= null;
	        		
	        	 id = Integer.parseInt(request.getParameter("findIdAnimal"));
	        	 a = facade.findByIdAnimal(id);
	        	
	        	if(a!=null){

		        	request.setAttribute("animal", a);
		            System.out.println(a);
		            request.setAttribute("foundidAnimal", a.getIdAnimal());
		            request.setAttribute("foundname", a.getName());
//		            
		            System.out.print(a.getName());
		            url = "/updateAnimal.jsp?";
		        	
	            }
	        }
	        
	        
	        RequestDispatcher dispatcher = getServletContext().getRequestDispatcher(url);
	        dispatcher.forward(request, response);
	    }
}
