package com.px.web.bhouse;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.px.bean.Bhouse;
import com.px.service.BhouseService;
import com.px.service.Impl.BhouseServiceImpl;

/**
 * Servlet implementation class updateBhouseServlet
 */
@WebServlet("/updateBhouseServlet")
public class updateBhouseServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public updateBhouseServlet() {
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
		int rno = Integer.parseInt(request.getParameter("rno"));
		String time = request.getParameter("time");
		String style = request.getParameter("style");
		String retur = request.getParameter("retur");
		int bhno = Integer.parseInt(request.getParameter("bhno"));
		BhouseService bhouseService = new BhouseServiceImpl();
		Bhouse bhouse = new Bhouse(rno, time, style, retur, bhno);
		int num = bhouseService.updateBhouse(bhouse);
		if(num!=0){
			request.getRequestDispatcher("listBhouseServlet").forward(request, response);
		}
		else{
			request.setAttribute("error", "该购租房记录不存在");
			request.getRequestDispatcher("listBhouseServlet").forward(request, response);
			
		}
	}

}
