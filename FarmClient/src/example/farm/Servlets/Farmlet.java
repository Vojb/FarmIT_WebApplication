package example.farm.Servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
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
		String url = null;
		List<Food> f = facade.findAllFood();

		if (f != null) {
			request.setAttribute("allFood", f);
			url = "/index.jsp?";
		} else {
			url = "/index.jsp?";
		}
		// forward to the desired view
		// this is the real JSP that has the content to display to user
		request.getRequestDispatcher("/index.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String url = null;
		try {
			String operation = request.getParameter("operation");

			if (operation.equals("findByIdAnimal")) {
				int id = Integer.parseInt(request.getParameter("findIdAnimal"));
				Animal a = facade.findByIdAnimal(id);

				if (a != null) {
					request.setAttribute("animal", a);
					url = "/updateAnimal.jsp?";
				} else {
					request.setAttribute("msgA", "didnt find an animal");
					url = "/find.jsp?";
				}

			} else if (operation.equals("findByIdBuilding")) {
				String id = request.getParameter("findIdBuilding");
				Building b = facade.findByIdBuilding(id);

				if (b != null) {
					request.setAttribute("building", b);
					url = "/updateBuilding.jsp?";
				} else {
					request.setAttribute("msgB", "didnt find a building");
					url = "/find.jsp?";

				}
			} else if (operation.equals("findByIdBox")) {
				String id = request.getParameter("findIdBox");
				Box b = facade.findByIdBox(id);
				if (b != null) {
					request.setAttribute("box", b);
					url = "/updateBox.jsp?";
				} else {
					request.setAttribute("msgBox", "didnt find a box");
					url = "/find.jsp?";
				}
			} else if (operation.equals("buy")) {
				Food f = null;
				int food = Integer.parseInt(request.getParameter("foundIdFood"));
				f = facade.findByIdFood(food);
				if (f != null) {

					facade.addAmount(f, Integer.parseInt(request.getParameter("buyAmount")));
					facade.updateFood(f);
					request.setAttribute("food", f);
					url = "/updateFood.jsp?";
				} else {
					request.setAttribute("msgF", "didnt find your food");
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
					request.setAttribute("msgF", "didnt find your food");
					url = "/find.jsp?";
				}
			} else if (operation.equals("addAnimal")) {

				String animalType = request.getParameter("typeAnimal");
				if (animalType.equals("Cow")) {
					Cow a = new Cow();
					a.setAmountOfPowerFeed(Integer.parseInt(request.getParameter("food")));
					a.setIdAnimal(Long.parseLong(request.getParameter("idAnimal")));
					a.setStatusAnimal(request.getParameter("status-animal"));
					a.setName(request.getParameter("name"));
					a.setAge(request.getParameter("age"));

					Box b = facade.findByIdBox(request.getParameter("idBox"));
					if (b != null) {
						a.setBox(b);
						facade.createAnimal(a);
						request.setAttribute("msgCreate", "Animal Created");
						url = "/create.jsp?";
					}

				} else if (animalType.equals("Hen")) {
					Hen a = new Hen();
					a.setAmountOfOats(Integer.parseInt(request.getParameter("food")));
					a.setIdAnimal(Long.parseLong(request.getParameter("idAnimal")));
					a.setStatusAnimal(request.getParameter("status-animal"));
					a.setName(request.getParameter("name"));
					a.setAge(request.getParameter("age"));

					Box b = facade.findByIdBox(request.getParameter("idBox"));
					if (b != null) {
						a.setBox(b);
						facade.createAnimal(a);
						request.setAttribute("msgCreate", "Animal Created");
						url = "/create.jsp?";
					}

				} else if (animalType.equals("Horse")) {
					Horse a = new Horse();
					a.setAmountOfPowerFeed(Integer.parseInt(request.getParameter("food")));

					a.setAmountOfHay(Integer.parseInt(request.getParameter("hay")));
					a.setIdAnimal(Long.parseLong(request.getParameter("idAnimal")));
					a.setStatusAnimal(request.getParameter("status-animal"));
					a.setName(request.getParameter("name"));
					a.setAge(request.getParameter("age"));

					Box b = facade.findByIdBox(request.getParameter("idBox"));
					if (b != null) {
						a.setBox(b);
						facade.createAnimal(a);
						request.setAttribute("msgCreate", "Animal Created");
						url = "/create.jsp?";
					}

				} else {
					Pig a = new Pig();
					a.setAmountOfPowerFeed(Integer.parseInt(request.getParameter("food")));
					a.setIdAnimal(Long.parseLong(request.getParameter("idAnimal")));
					a.setStatusAnimal(request.getParameter("status-animal"));
					a.setName(request.getParameter("name"));
					a.setAge(request.getParameter("age"));

					Box b = facade.findByIdBox(request.getParameter("idBox"));
					if (b != null) {
						a.setBox(b);
						facade.createAnimal(a);
						request.setAttribute("msgCreate", "Animal Created");
						url = "/create.jsp?";
					}
				}
				List<Food> f = facade.findAllFood();

				if (f != null) {
					request.setAttribute("allFood", f);
					url = "/create.jsp?";
				} else {
					url = "/create.jsp?";
				}
			} else if (operation.equals("updateAnimal")) {

				String animalType = request.getParameter("foundType");
				System.out.println(request.getParameter("foundType"));
				if (animalType.equals("Cow")) {
					Animal a = facade.findByIdAnimal(Long.parseLong(request.getParameter("foundidAnimal")));
					a.setAmountOfFood(Integer.parseInt(request.getParameter("foundfood")));
					a.setStatusAnimal(request.getParameter("foundstatusAnimal"));
					a.setName(request.getParameter("foundname"));
					a.setAge(request.getParameter("foundage"));

					Box b = facade.findByIdBox(request.getParameter("foundidBox"));
					if (b != null) {
						a.setBox(b);
					}

					facade.updateAnimal(a);
				} else if (animalType.equals("Hen")) {
					Animal a = facade.findByIdAnimal(Long.parseLong(request.getParameter("foundidAnimal")));
					a.setAmountOfFood(Integer.parseInt(request.getParameter("foundfood")));
					a.setStatusAnimal(request.getParameter("foundstatusAnimal"));
					a.setName(request.getParameter("foundname"));
					a.setAge(request.getParameter("foundage"));

					Box b = facade.findByIdBox(request.getParameter("foundidBox"));
					if (b != null) {
						a.setBox(b);

					}

					facade.updateAnimal(a);
				} else if (animalType.equals("Horse")) {
					Animal a = facade.findByIdAnimal(Long.parseLong(request.getParameter("foundidAnimal")));
					a.setAmountOfFood(Integer.parseInt(request.getParameter("foundfood")));
					a.setAmountOfHay(Integer.parseInt(request.getParameter("foundHay")));
					a.setStatusAnimal(request.getParameter("foundstatusAnimal"));
					a.setName(request.getParameter("foundname"));
					a.setAge(request.getParameter("foundage"));

					Box b = facade.findByIdBox(request.getParameter("foundidBox"));
					if (b != null) {
						a.setBox(b);
					}

					facade.updateAnimal(a);
				} else {
					Animal a = facade.findByIdAnimal(Long.parseLong(request.getParameter("foundidAnimal")));
					a.setAmountOfFood(Integer.parseInt(request.getParameter("foundfood")));
					a.setStatusAnimal(request.getParameter("foundstatusAnimal"));
					a.setName(request.getParameter("foundname"));
					a.setAge(request.getParameter("foundage"));

					Box b = facade.findByIdBox(request.getParameter("foundidBox"));
					if (b != null) {
						a.setBox(b);
					}
					facade.updateAnimal(a);
				}

				int id = Integer.parseInt(request.getParameter("foundidAnimal"));
				Animal a = facade.findByIdAnimal(id);

				if (a != null) {
					request.setAttribute("animal", a);
					url = "/updateAnimal.jsp?";
				}

			} else if (operation.equals("addHorse")) {
				Horse a = new Horse();
				a.setAmountOfPowerFeed(Integer.parseInt(request.getParameter("food")));
				a.setAmountOfHay(Integer.parseInt(request.getParameter("foodOne")));
				a.setIdAnimal(Long.parseLong(request.getParameter("idAnimal")));
				a.setStatusAnimal(request.getParameter("status-animal"));
				a.setName(request.getParameter("name"));
				a.setAge(request.getParameter("age"));

				Box b = facade.findByIdBox(request.getParameter("idBox"));
				if (b != null) {
					a.setBox(b);
					facade.createAnimal(a);
					request.setAttribute("msgCreate", "Animal Created");
					url = "/create.jsp?";
				}

				
				
			} else if (operation.equals("remove")) {

				int a = Integer.parseInt(request.getParameter("foundAnimal"));

				List<Food> f = facade.findAllFood();
				request.setAttribute("allFood", f);

				facade.deleteAnimal(a);

				url = "/index.jsp";
				request.setAttribute("msgKill", "you just killed an animal");

			} else if (operation.equals("feedAnimals")) {
				facade.feedAllAnimals(1, 2, 3);
				List<Food> f = facade.findAllFood();

				if (f != null) {
					request.setAttribute("allFood", f);
					url = "/index.jsp?";
				} else {
					url = "/index.jsp?";
				}

			} else if (operation.equals("createHen")) {

				List<Animal> f = facade.findByTypeQuery("Hen");

				if (f != null) {
					request.setAttribute("Hen", f);
					url = "/hen.jsp?";
				} else {
					url = "/hen.jsp?";
				}

			} else if (operation.equals("bajs")) {

				List<Animal> f = facade.findByTypeQuery("Horse");

				if (f != null) {
					request.setAttribute("Horse", f);
					url = "/horse.jsp?";
				} else {
					url = "/horse.jsp?";
				}

			} else if (operation.equals("createPig")) {

				List<Animal> f = facade.findByTypeQuery("Pig");

				if (f != null) {
					request.setAttribute("Pig", f);
					url = "/pig.jsp?";
				} else {
					url = "/pig.jsp?";
				}

			} else if (operation.equals("createCow")) {

				List<Animal> f = facade.findByTypeQuery("Cow");

				if (f != null) {
					request.setAttribute("Cow", f);
					url = "/cow.jsp?";
				} else {
					url = "/cow.jsp?";
				}

			} else if (operation.equals("getFood")) {

				List<Food> f = facade.findAllFood();

				if (f != null) {
					request.setAttribute("allFood", f);
					url = "/index.jsp?";
				} else {
					url = "/index.jsp?";
				}

			} else if (operation.equals("find")) {
				url = "/find.jsp?";
			} else {
				url = "/find.jsp?";
			}
			RequestDispatcher dispatcher = getServletContext().getRequestDispatcher(url);
			dispatcher.forward(request, response);
		} catch (Exception e) {

			url = "/about.jsp";
			RequestDispatcher dispatcher = getServletContext().getRequestDispatcher(url);
			dispatcher.forward(request, response);
		}
	}

}
