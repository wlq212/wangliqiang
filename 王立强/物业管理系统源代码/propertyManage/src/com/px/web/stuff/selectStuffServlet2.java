package com.px.web.stuff;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.px.bean.Stuff;
import com.px.service.StuffService;
import com.px.service.Impl.StuffServiceImpl;

/**
 * Servlet implementation class selectStuffServlet
 */
@WebServlet("/selectStuffServlet2")
public class selectStuffServlet2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public selectStuffServlet2() {
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
		String sname = new String(request.getParameter("sname").getBytes("ISO-8859-1"),"UTF-8");
		StuffService stuffService = new StuffServiceImpl();
		List<Stuff> stuffs = stuffService.selectStuffBySname(sname);
		if(stuffs!=null){
		request.setAttribute("stuffs", stuffs);
		request.getRequestDispatcher("Staff2.jsp").forward(request, response);
	}else{
		request.setAttribute("error", "该员工不存在");
		request.getRequestDispatcher("listStuffServlet").forward(request, response);
	}

}
}

