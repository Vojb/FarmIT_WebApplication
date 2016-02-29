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

import example.farm.facade.FarmFacadeLocal;
import example.farm.model.Animal;
import example.farm.model.Box;
import example.farm.model.Building;
import example.farm.model.Cow;
import example.farm.model.Food;

@WebServlet("/Farmlet")
public class Farmlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	@EJB
	FarmFacadeLocal facade;

	public Farmlet() {
		super();
	}

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
			int id = 0;
			Animal a = null;

			id = Integer.parseInt(request.getParameter("findIdAnimal"));
			a = facade.findByIdAnimal(id);
			if (a != null) {
				request.setAttribute("animal", a);
				url = "/updateAnimal.jsp?";

			}
		} else if (operation.equals("findByIdBuilding")) {
			String id = request.getParameter("findIdBuilding");
			Building b = facade.findByIdBuilding(id);
			
			if (b != null) {
				request.setAttribute("building", b);
				url = "/updateBuilding.jsp?";
			}
		} else if (operation.equals("findByIdBox")) {
			String id = request.getParameter("findIdBox");
			Box b = facade.findByIdBox(id);
			if (b != null) {
				request.setAttribute("box", b);
				url = "/updateBox.jsp?";
			}	
		}  else if (operation.equals("findByFoodName")) {
			Food f = null;
			String foodname = request.getParameter("findByFoodName");
			f = facade.findByFoodName(foodname);
			if (f!= null) {
				request.setAttribute("food", f);
				url = "/updateFood.jsp?";
			}	
		} else if (operation.equals("feedAnimals")) {
				facade.feedAllAnimals(1,2,3);
				url = "/index.jsp?";
				
		}else if (operation.equals("find")) {
			url = "/find.jsp?";
		} else {
			url = "/find.jsp?";
		}
		RequestDispatcher dispatcher = getServletContext().getRequestDispatcher(url);
		dispatcher.forward(request, response);
	}
}
