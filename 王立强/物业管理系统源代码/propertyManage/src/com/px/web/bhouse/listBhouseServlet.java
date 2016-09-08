package com.px.web.bhouse;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.px.bean.Bhouse;
import com.px.service.BhouseService;
import com.px.service.Impl.BhouseServiceImpl;

/**
 * Servlet implementation class listBhouseServlet
 */
@WebServlet("/listBhouseServlet")
public class listBhouseServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public listBhouseServlet() {
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
		request.setCharacterEncoding("UTF-8");
		BhouseService bhouseService = new BhouseServiceImpl();
		List<Bhouse> bhouses = bhouseService.listAllBhouse();
		request.setAttribute("bhouses", bhouses);
		request.getRequestDispatcher("Bhousetab.jsp").forward(request, response);
	}

}
