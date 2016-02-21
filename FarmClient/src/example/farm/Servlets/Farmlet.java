package example.farm.Servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
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
		out.println("<title>FarmLet</title>");
		out.println("<meta charset=\"ISO-8859-1\">");
		out.println("</head><body>");
	

//		try{
//
//		//	facade.findByTypeQuery("Cow");
//			out.print("<h1> MATADE alla djur förutom odd, han blev flådd, dem blev mätta</h1>");
//		}catch(Exception e){
//			out.print("<h1> MATADE INTE DJUREN </h1>");
//		}
		
		
		
//		
		try{

			List<Animal> animals = facade.findByTypeQuery("Cow");
			for(Animal a:animals){
				out.print(a.getName());
			}
				
		}catch(Exception e){
			out.print("HELA VÄRLDEN SUGER"+e);
		}
		
//		
//		out.println(facade.sumOfCowFood());
out.println("<body background=https://scontent-arn2-1.xx.fbcdn.net/hphotos-xpt1/v/t35.0-12/12674798_10153805914356278_1012328399_o.jpg?oh=6f2d9bb75b591d52fcd1691a6d3e3605&oe=56BE85ED>");
		
//		try{
//		Food f= facade.findByIdFood(1);
//		facade.feedCow(f);
//		out.println("Det gick att mata kossorna");
//		out.println("så de så");
//		
//		}catch(Exception e){
//			out.println("Det gick ej att mata kossorna");
//			out.println("så de så");
//		}
		
		
		
//		Cow a = new Cow();
//		a.setAge("12");
//		a.setIdAnimal(2);
//		a.setName("Sosse");
//		a.setStatusAnimal("Alive");
//		facade.createAnimal(a);

//		Building bs=new Building ();
//		bs.setIdBuilding("Alfa");
//		facade.createBuilding(bs);
		
//		
//		Animal a1 = facade.findByIdAnimal(999);
//		if (a1 != null) {
//			out.println("<h4>Hittade: " + a1.getIdAnimal());
//			out.println(" </h4>");
//		}
		
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
//		 Food f= new Food();
//		 f.setAmount(1000000);
//		 f.setIdFood(10);
//		 f.setType("Godis");
//		 facade.createFood(f);
		//

		//
//	// e4.addAnimal(e2);
//		// e4.getAnimals();
//		facade.updateFood(e4);

		out.println("</body></html>");
	}

}
