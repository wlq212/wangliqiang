package com.px.web.stuff;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.px.bean.Stuff;
import com.px.service.StuffService;
import com.px.service.Impl.StuffServiceImpl;

/**
 * Servlet implementation class addStuffServlet
 */
@WebServlet("/addStuffServlet")
public class addStuffServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public addStuffServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setCharacterEncoding("UTF-8");
		int sno = Integer.parseInt(request.getParameter("sno"));
		String sname = request.getParameter("sname");
		String password = request.getParameter("password");
		String sex = request.getParameter("sex");
		int age = Integer.parseInt(request.getParameter("age"));
		String education = request.getParameter("education");
		String address = request.getParameter("address");
		String email = request.getParameter("email");
        long phone = Long.parseLong(request.getParameter("phone"));
		String status = request.getParameter("status");
		String father = request.getParameter("father");
		String fworkerplace = request.getParameter("fworkerplace");
		String mother = request.getParameter("mother");
		String mworkerplace = request.getParameter("mworkerplace");
		Stuff stuff = new Stuff(sno, sname, password, sex, age, education, address, email, phone, status, father, fworkerplace, mother, mworkerplace);
		StuffService stuffService = new StuffServiceImpl();
		int num = stuffService.addStuff(stuff);
		if(num!=0){
			request.getRequestDispatcher("login.jsp").forward(request, response);
		}
		else{
			request.setAttribute("error", "该工号已存在");
			request.getRequestDispatcher("Staff1.jsp").forward(request, response);
			
		}

        

	}

}
