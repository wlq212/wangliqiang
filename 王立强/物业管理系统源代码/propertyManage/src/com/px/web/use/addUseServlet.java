package com.px.web.use;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.px.bean.Use;
import com.px.service.UseService;
import com.px.service.Impl.UseServiceImpl;

/**
 * Servlet implementation class addUseServlet
 */
@WebServlet("/addUseServlet")
public class addUseServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public addUseServlet() {
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
		int uno = Integer.parseInt(request.getParameter("uno"));
		String uname = request.getParameter("uname");
		String password = request.getParameter("password");
		String sex = request.getParameter("sex");
		int age = Integer.parseInt(request.getParameter("age"));
		String carid = request.getParameter("carid");
		String pet = request.getParameter("pet");
        long phone = Long.parseLong(request.getParameter("phone"));
		String father = request.getParameter("father");
		String mother = request.getParameter("mother");
		Use use = new Use(uno, uname, password, sex, age, carid, pet, phone, father, mother);
		UseService useService = new UseServiceImpl();
		int num = useService.addUse(use);
		if(num!=0){
			request.getRequestDispatcher("listUseServlet").forward(request, response);
		}
		else{
			request.setAttribute("error", "该用户编号已存在");
			request.getRequestDispatcher("Use1.jsp").forward(request, response);
			
		}
	}

}
