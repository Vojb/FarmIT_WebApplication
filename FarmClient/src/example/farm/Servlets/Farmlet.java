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
import example.farm.model.Hen;
import example.farm.model.Horse;
import example.farm.model.Pig;

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
			int id = Integer.parseInt(request.getParameter("findIdAnimal"));
			Animal a = facade.findByIdAnimal(id);

			if (a != null) {
				request.setAttribute("animal", a);
				url = "/updateAnimal.jsp?";
			} else {
				request.setAttribute("msgA", "didnt find a fucking animal");
				url = "/find.jsp?";
			}

		} else if (operation.equals("findByIdBuilding")) {
			String id = request.getParameter("findIdBuilding");
			Building b = facade.findByIdBuilding(id);

			if (b != null) {
				request.setAttribute("building", b);
				url = "/updateBuilding.jsp?";
			} else {
				request.setAttribute("msgB", "didnt find a fucking building");
				url = "/find.jsp?";

			}
		} else if (operation.equals("findByIdBox")) {
			String id = request.getParameter("findIdBox");
			Box b = facade.findByIdBox(id);
			if (b != null) {
				request.setAttribute("box", b);
				url = "/updateBox.jsp?";
			} else {
				request.setAttribute("msgBox", "didnt find a fucking box");
				url = "/find.jsp?";
			}
		} else if (operation.equals("findByFoodName")) {
			Food f = null;
			String foodname = request.getParameter("findByFoodName");
			f = facade.findByFoodName(foodname);
			if (f != null) {
				request.setAttribute("food", f);
				url = "/updateFood.jsp?";
			} else {
				request.setAttribute("msgF", "didnt find your fucking food");
				url = "/find.jsp?";
			}
		} else if (operation.equals("addAnimal")) {

			String animalType = request.getParameter("changefoods");
			System.out.println(request.getParameter("changefoods"));
			if (animalType.equals("Cow")) {
				Cow a = new Cow();
				a.setAmountOfPowerFeed(Integer.parseInt(request.getParameter("food")));
				a.setIdAnimal(Long.parseLong(request.getParameter("changefood")));
				a.setStatusAnimal(request.getParameter("status-animal"));
				a.setName(request.getParameter("name"));
				a.setAge(request.getParameter("age"));

				Box b = facade.findByIdBox(request.getParameter("idBox"));
				if (b != null) {
					a.setBox(b);
				}

				facade.createAnimal(a);
			} else if (animalType.equals("Hen")) {
				Hen a = new Hen();
				a.setAmountOfOats(Integer.parseInt(request.getParameter("food")));
				a.setIdAnimal(Long.parseLong(request.getParameter("changefood")));
				a.setStatusAnimal(request.getParameter("status-animal"));
				a.setName(request.getParameter("name"));
				a.setAge(request.getParameter("age"));

				Box b = facade.findByIdBox(request.getParameter("idBox"));
				if (b != null) {
					a.setBox(b);

				}

				facade.createAnimal(a);
			} else if (animalType.equals("Horse")) {
				Horse a = new Horse();
				a.setAmountOfPowerFeed(Integer.parseInt(request.getParameter("food")));
				a.setAmountOfHay(Integer.parseInt(request.getParameter("food")));
				a.setIdAnimal(Long.parseLong(request.getParameter("changefood")));
				a.setStatusAnimal(request.getParameter("status-animal"));
				a.setName(request.getParameter("name"));
				a.setAge(request.getParameter("age"));

				Box b = facade.findByIdBox(request.getParameter("idBox"));
				if (b != null) {
					a.setBox(b);
				}

				facade.createAnimal(a);
			} else {
				Pig a = new Pig();
				a.setAmountOfPowerFeed(Integer.parseInt(request.getParameter("food")));
				a.setIdAnimal(Long.parseLong(request.getParameter("changefood")));
				a.setStatusAnimal(request.getParameter("status-animal"));
				a.setName(request.getParameter("name"));
				a.setAge(request.getParameter("age"));

				Box b = facade.findByIdBox(request.getParameter("idBox"));
				if (b != null) {
					a.setBox(b);
				}
				facade.createAnimal(a);
			}
			
			url = "/index.jsp?";

		} else if (operation.equals("feedAnimals")) {
			facade.feedAllAnimals(1, 2, 3);
			url = "/index.jsp?";

		} else if (operation.equals("find")) {
			url = "/find.jsp?";
		} else {
			url = "/find.jsp?";
		}
		RequestDispatcher dispatcher = getServletContext().getRequestDispatcher(url);
		dispatcher.forward(request, response);
	}
}
