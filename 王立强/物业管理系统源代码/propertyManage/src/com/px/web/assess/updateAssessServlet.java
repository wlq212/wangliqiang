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
 * Servlet implementation class updateAssessServlet
 */
@WebServlet("/updateAssessServlet")
public class updateAssessServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public updateAssessServlet() {
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
		String content = request.getParameter("content");
		String time = request.getParameter("time");
		String rank = request.getParameter("rank");
		int ano = Integer.parseInt(request.getParameter("ano"));
		AssessService assessService = new AssessServiceImpl();
		Assess assess = new Assess(content, time, rank, ano);
		int num = assessService.updateAssess(assess);
		if(num!=0){
			request.getRequestDispatcher("listAssessServlet").forward(request, response);
		}
		else{
			request.setAttribute("error", "该考核记录不存在");
			request.getRequestDispatcher("listAssessServlet").forward(request, response);
			
		}
		
	}

}
