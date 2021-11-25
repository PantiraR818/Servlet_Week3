package com;
/*กรณีขึ้นErrorลองกดที่ClassหลังExtends เปลี่ยนที่import*/
import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class SaveServlet
 *//*เอามาจากActionที่หน้า JSP ในส่วนของ@WebServlet*/
@WebServlet("/Save")
public class SaveServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public SaveServlet() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Pantira R. ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		//สำคัญ               เอาค่าออกเรียก Setแอตทิบิวต์
		String id = request.getParameter("id");
		String name = request.getParameter("name");
		int score = Integer.parseInt(request.getParameter("score")); //รับค่าเป็นตัวเลข
		String selectedCourse = request.getParameter("listCourse");
		String payment = request.getParameter("payment");
		
		//Array
		String[] names = new String[] {"Ploy","Mild","Fah"};
		//Array String
		String[] methods = request.getParameterValues("method");
	
		//Set attributes   หน้าเป็นชื่อ หลังตัวแปร
		request.setAttribute("o_id",id);
		request.setAttribute("o_name", name);
		request.setAttribute("o_score", score);
		request.setAttribute("names", names);
		request.setAttribute("o_course",selectedCourse );
		request.setAttribute("o_payment",payment );
		request.setAttribute("o_methods", methods);
		//include file เข้ามา  ส่งData ออกไป
		request.getRequestDispatcher("/result.jsp").forward(request, response);
		
		
//		PrintWriter out = response.getWriter();
//		response.setContentType("text/html");
//		
//		out.println("<div style='color:red'>");
//		out.println("ID: "+ id + "<br>");
//		out.println("Name: "+ name + "<br>");
//		out.println("Score: "+ score + "<br>");
//		out.println("</div>");
		
		
	}

}
