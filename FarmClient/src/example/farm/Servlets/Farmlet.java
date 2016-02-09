package example.farm.Servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.ejb.EJB;
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
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		out.println("<!DOCTYPE html><html><head>");
		out.println("<title>FarmIt</title>");
		out.println("<meta charset=\"ISO-8859-1\">");
		out.println("</head><body>");
		out.println("<h3>Farmlet</h3>");

//		Cow a = new Cow();
//		a.setAge("12");
//		a.setIdAnimal(2);
//		a.setName("Sosse");
//		a.setStatusAnimal("Alive");
//		facade.createAnimal(a);

//		Building bs=new Building ();
//		bs.setIdBuilding("Alfa");
//		facade.createBuilding(bs);
		
		
		Animal a1 = facade.findByIdAnimal(999);
		if (a1 != null) {
			out.println("<h4>Hittade: " + a1.getIdAnimal());
			out.println(" </h4>");
		}
		
//		Building e1 = facade.findByIdBuilding("Alfa");
//		if (e1 != null) {
//			out.println("<h4>Hittade: " + e1.getIdBuilding());
//			out.println(" </h4>");
//		}
//		Box e3 = facade.findByIdBox("1");
//		if (e3 != null) {
//			out.println("<h4>Hittade: " + e3.getIdBox());
////			out.println(" " + e3.getBuilding() + "</h4>");
////		}
//		Animal e2 = facade.findByIdAnimal(666);
//		if (e2 != null) {
//			out.println("<h4>Hittade: " + e2.getName());
//			out.println(" " + e2.getStatusAnimal() + "</h4>");
//		}
//		Food e4 = facade.findByIdFood(1);
//		if (e4 != null) {
//			out.println("<h4>Hittade: " + e4.getType());
////			out.println(" </h4>");
////		}
//
//		List<Animal> animals = facade.findAll();
//		for (Animal emp2 : animals) {
//			out.println("<h4>Hittade: " + emp2.getName());
//			out.println(" Id: " + emp2.getIdAnimal());
//			out.println("</h4>");
//		}
//		
	
		// Animal a = facade.findByIdAnimal(10001);
		// Building bs =facade.findByIdBuilding("FuckOF");

//		Box b = new Box();
//		b.setIdBox("1");
//		b.setBuilding(e1);
//		facade.createBox(b);
//
//		Cow c = new Cow();
//		c.setBox(e3);
//		c.setAge("12");
//		c.setName("KarlMax");
//		c.setAmountOfPowerFeed(12);
//		c.setIdAnimal(10001);
//		c.setStatusAnimal("Frisk");
//		facade.createAnimal(c);

		// b.addAnimaltoBox(c);

		// facade.createBox(b);
		//
		// Food f= new Food();
		// f.setAmount(1000000);
		// f.setIdFood(1);
		// f.setType("PowerFeed");
		////

		//
//
//		facade.addAnimal(e4, e2);
//		// e4.addAnimal(e2);
//		// e4.getAnimals();
//		facade.updateFood(e4);

		out.println("</body></html>");
	}

}
