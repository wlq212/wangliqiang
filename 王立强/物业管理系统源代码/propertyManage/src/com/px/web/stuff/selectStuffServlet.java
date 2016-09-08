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
@WebServlet("/selectStuffServlet")
public class selectStuffServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public selectStuffServlet() {
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
		int sno = Integer.parseInt(request.getParameter("sno"));
		StuffService stuffService = new StuffServiceImpl();
		List<Stuff> stuffs = stuffService.selectStuffBySno(sno);
		if(stuffs!=null){
		request.setAttribute("stuffs", stuffs);
		request.getRequestDispatcher("Stafftab.jsp").forward(request, response);
	}else{
		request.setAttribute("error", "该员工不存在");
		request.getRequestDispatcher("listStuffServlet").forward(request, response);
	}

}
}
