package com.px.web.assess;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.px.bean.Assess;
import com.px.service.AssessService;
import com.px.service.Impl.AssessServiceImpl;

/**
 * Servlet implementation class addAssessServlet
 */
@WebServlet("/addAssessServlet")
public class addAssessServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public addAssessServlet() {
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
		int ano = Integer.parseInt(request.getParameter("ano"));
		String content = request.getParameter("content");
		String time = request.getParameter("time");
		int sno = Integer.parseInt(request.getParameter("sno"));
		String name = request.getParameter("name");
		String rank = request.getParameter("rank");
		Assess assess = new Assess(ano, content, time, sno, name, rank);
		AssessService assessService = new AssessServiceImpl();
		int num = assessService.addAssess(assess);
		if(num!=0){
			request.getRequestDispatcher("listAssessServlet").forward(request, response);
		}
		else{
			request.setAttribute("error", "该考核编号已存在或该员工不存在");
			request.getRequestDispatcher("Assess1.jsp").forward(request, response);
			
		}

		
	}

}
