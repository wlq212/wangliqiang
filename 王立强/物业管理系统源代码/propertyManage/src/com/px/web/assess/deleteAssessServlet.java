package com.px.web.assess;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.px.service.AssessService;
import com.px.service.Impl.AssessServiceImpl;

/**
 * Servlet implementation class deleteAssessServlet
 */
@WebServlet("/deleteAssessServlet")
public class deleteAssessServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public deleteAssessServlet() {
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
		AssessService assessService = new AssessServiceImpl();
		int num = assessService.deleteByAno(ano);
		if(num!=0){
			request.getRequestDispatcher("listAssessServlet").forward(request, response);
		}
		else{
			request.setAttribute("error", "该考核记录不存在");
			request.getRequestDispatcher("listAssessServlet").forward(request, response);
			
		}
	}

}
