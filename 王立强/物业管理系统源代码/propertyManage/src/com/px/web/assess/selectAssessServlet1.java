package com.px.web.assess;

import java.io.IOException;

import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.px.bean.Assess;
import com.px.service.AssessService;
import com.px.service.Impl.AssessServiceImpl;

/**
 * Servlet implementation class selectAssessServlet
 */
@WebServlet("/selectAssessServlet1")
public class selectAssessServlet1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public selectAssessServlet1() {
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
		List<Assess> assesss = assessService.selectAssessByAno(ano);
		if(assesss!=null){
			request.setAttribute("assesss", assesss);
			request.getRequestDispatcher("Assess.jsp").forward(request, response);
		}else{
			request.setAttribute("error", "该考核记录不存在");
			request.getRequestDispatcher("listAssessServlet").forward(request, response);
		}
	}

}
