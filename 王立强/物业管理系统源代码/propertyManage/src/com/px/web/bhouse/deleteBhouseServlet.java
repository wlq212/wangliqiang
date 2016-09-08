package com.px.web.bhouse;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.px.service.BhouseService;
import com.px.service.Impl.BhouseServiceImpl;

/**
 * Servlet implementation class deleteBhouseServlet
 */
@WebServlet("/deleteBhouseServlet")
public class deleteBhouseServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public deleteBhouseServlet() {
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
		int bhno = Integer.parseInt(request.getParameter("bhno"));
		BhouseService bhouseService = new BhouseServiceImpl();
		int num = bhouseService.deleteByBhno(bhno);
		if(num!=0){
			request.getRequestDispatcher("listBhouseServlet").forward(request, response);
		}
		else{
			request.setAttribute("error", "该购租房记录不存在");
			request.getRequestDispatcher("listBhouseServlet").forward(request, response);
			
		}
	}

}
