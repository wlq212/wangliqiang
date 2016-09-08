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
 * Servlet implementation class listAssessServlet
 */
@WebServlet("/listAssessServlet")
public class listAssessServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public listAssessServlet() {
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
		AssessService assessService = new AssessServiceImpl();
		List<Assess> assesss = assessService.listAllAssess();
		request.setAttribute("assesss", assesss);
		request.getRequestDispatcher("Assesstab.jsp").forward(request, response);
	}

}
